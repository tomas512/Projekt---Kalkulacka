package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;

public class CanvasController {
	
	@FXML
	private Canvas canvas;
	
	public CanvasController(){
		
	}
	
	@FXML
	private void initialize(){
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>(){
			
			@Override 
			public void handle(MouseEvent event) { 
			      System.out.println(event.getEventType()); 

		}
		
		};
		canvas.addEventHandler(MouseEvent.ANY,handler);
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
	
	public void kresliNaPlatno(){
	
		canvas.getGraphicsContext2D().fillRect(50, 100, 100, 100);
	}

}
