package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.canvas.Canvas;

public class CanvasMouseHandler {

	@FXML
	private Canvas canvas;
	
	@FXML
	private void initialize(){
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>(){
			
			@Override 
			public void handle(MouseEvent event) { 
			      System.out.println(event.getEventType()); 

		}
		
		};
		canvas.addEventHandler(MouseEvent.MOUSE_CLICKED,handler);
	}
}
		
	
			     

	
