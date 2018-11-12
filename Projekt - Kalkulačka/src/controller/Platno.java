package controller;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import view.IKresleny;

public class Platno {
	
	GraphicsContext painter;
	private static Platno platno;
	private List<IKresleny> utvary = new ArrayList<IKresleny>();
	private double sirka;
	private double vyska;
	private boolean isOsaX;
	private boolean isOsaY;
	private double scale = 1;
	private double velikost = 2;
	private double krok = 10;
	private Color pozadi = Color.BEIGE;
	private double nulovyBodx = 0;
	private double nulovyBody = 0;

	public static Platno getPlatno(Canvas canvas){
		if(platno==null){
			platno = new Platno(canvas);
			return platno;}
			else
				return platno;
		}
	
	
	public Platno(Canvas canvas){
		painter = canvas.getGraphicsContext2D();
		sirka = canvas.getWidth();
		vyska = canvas.getHeight();
		painter.setTransform(scale, 0, 0, scale, sirka/2, vyska/2); // posunutí soustavy souøadnic na støed
		nulovyBodx = -sirka/2;
		nulovyBody = -vyska/2;
		isOsaX = true;
		isOsaY = true;
	}
	
	
	public GraphicsContext getPainter(){
		return painter;
	}
	
	public void pridej(IKresleny utvar){
		utvary.add(utvar);
	}
	
	public void odeber(IKresleny utvar){
		utvary.remove(utvar);
	}
	
	public void odeberVse(){
		utvary.removeAll(utvary);
	}
	
	public boolean isOsaX(){
		return isOsaX;
	}
	
	public boolean isOsaY(){
		return isOsaY;
	}
	
	public void setOsaX(boolean on){
		isOsaX = on;
	}
	
	public void setOsaY(boolean on){
		isOsaY = on;
	}
	
	public double getVelikost(){
		return velikost;
	}
	
	public void setVelikost(double velikost){
		this.velikost = velikost;
	}
	
	public double getKrok(){
		return krok;
	}
	
	public void setKrok(double krok){
		this.krok = krok;
	}
	
	public void vymaz(){
		// smazat vše
		painter.save();
		painter.setFill(Color.BEIGE);
		painter.fillRect(nulovyBodx,nulovyBody, sirka, vyska);
		if (isOsaX) kresliOsaX();
		if (isOsaY) kresliOsaY();
		painter.restore();
	}
	
	public void kresliOsaX(){
		painter.strokeLine(nulovyBodx, 0, nulovyBodx + sirka, 0);
		for(double i = nulovyBodx; i<nulovyBodx + sirka;i=i+getKrok()){
			painter.strokeLine(i,-getVelikost(),i,getVelikost());
		}
	}
	
	public void kresliOsaY(){
		painter.strokeLine(0, nulovyBody, 0, nulovyBody + vyska);
		for(double i = nulovyBody; i<nulovyBody + vyska;i=i+getKrok()){
			painter.strokeLine(-getVelikost(),i,getVelikost(),i);
		}
	}
	
	public void prekresli(){
		vymaz();
		for (IKresleny utvar : utvary ){
			utvar.kresli(painter);
		}
		
	}
	
	public void testPlatno(){
		painter.fillOval(100, 100, 3, 3);
	}

}
