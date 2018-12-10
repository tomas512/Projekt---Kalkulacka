package controller;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{

	
	public Controller(){
		
	}
	
	@FXML
	private void initialize(){
	}
		@FXML
	    private TextField texto;

	
	
	@FXML
    private void handleButtonAction(ActionEvent event)
    {
        Button button = (Button)event.getSource();
        texto.appendText(button.getText());
    }
	
}



