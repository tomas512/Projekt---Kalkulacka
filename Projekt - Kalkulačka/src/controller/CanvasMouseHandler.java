package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class CanvasMouseHandler {

	@FXML
	private void initialize(){
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>(){
			
			@Override 
			public void handle(MouseEvent event) { 
			      System.out.println(event.getEventType()); 

		}
		
		};
	}
}
		
	
			     

	
