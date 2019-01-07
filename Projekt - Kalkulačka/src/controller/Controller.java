package controller;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import model.Model;

public class Controller {

	@FXML
    private Text texto;
	
	private long cislo1 = 0;
	private String operator = "";
	private boolean start = true;

    private Model model = new Model();
	
	public Controller(){
		
	}
	
	@FXML
    private void processNumpad(ActionEvent event) {
        if(start) {
        	texto.setText("");
        	start = false;
        }
		
		String value = ((Button)event.getSource()).getText();
        texto.setText(texto.getText() + value);
	}
    
	 @FXML
	    private void processOperator(ActionEvent event) {
	        String value = ((Button)event.getSource()).getText();

	        if (!"=".equals(value)) {
	            if (!operator.isEmpty())
	                return;

	            operator = value;
	            cislo1 = Long.parseLong(texto.getText());
	            texto.setText("");
	        }
	        else {
	            if (operator.isEmpty())
	                return;

	            texto.setText(String.valueOf(model.calculate(cislo1, Long.parseLong(texto.getText()), operator)));
	            operator = "";
	            start = true;
	        }
	    }
	}




