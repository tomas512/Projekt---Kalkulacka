package controller;




import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Model;

public class Controller {

	@FXML
    private Text texto;
	
	//int[] cislo1 = new int[50];
//	ArrayList<String> c = new ArrayList<String>();
	private long cislo2 = 0;
	private String operator = "";
	private boolean start = true;

    private Model model = new Model();
	
	public Controller(){
		c.add("10");
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
	            
	            int[] cislo = new int[texto.getText().length()];
	            String[] operator = new String[10];
	            parseVyraz(texto.getText(),cislo,operator);

	            operator = value;
	            cislo1 = Long.parseLong(texto.getText());
	            texto.setText("" + cislo1 + operator);
	        }
	        else {
	            if (operator.isEmpty())
	                return;
	            
	           
	            texto.setText(String.valueOf(model.calculate(cislo1, cislo2, operator)));
	            operator = "";
	            start = true;
	        }
	    }
	 
	 	private void parserVyraz(String vyraz, int[] cislo, String[] operator) {
	 		
	 	}
	}




