package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.canvas.Canvas;

public class Controller {

	@FXML
	private Canvas canvas;
	
	public Controller(){
		
	}
	
	@FXML
	private void initialize(){
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>(){
			
			@Override 
			public void handle(MouseEvent event) { 
			      System.out.println(event.getEventType()); 

		}
		
		};
		addEventHandler(MouseEvent.MOUSE_CLICKED,handler);
	}

	private void addEventHandler(EventType<MouseEvent> mouseClicked, EventHandler<MouseEvent> handler) {
		// TODO Auto-generated method stub
		
	}
		@FXML
		private void handleButtonAction(ActionEvent event) {
		    // Button was clicked, do something…
		    
		
	}
}
