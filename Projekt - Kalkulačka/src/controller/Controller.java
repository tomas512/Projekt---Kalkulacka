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
	
	// int[] cislo1 = new int[50];
	// ArrayList<String> c = new ArrayList<String>();
	private long cislo1 = 0;
	private long cislo2 = 0;
	private String operator = "";
	private boolean start = true;

    private Model model = new Model();
	
	// public Controller(){
	//	c.add("10");
	//}
	
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
	            
	            int[] cislo = new int[10];
	            String[] operator = new String[10];
	            parseVyraz(texto.getText(),cislo,operator);

	         //   operator = value;
	         //   cislo1 = Long.parseLong(texto.getText());
	         //   texto.setText("" + cislo1 + operator);
	        }
	        else {
	            if (operator.isEmpty())
	                return;
	            
	           
	            texto.setText(String.valueOf(model.calculate(cislo1, cislo2, operator)));
	            operator = "";
	            start = true;
	        }
	    }
	 

		
	 private void parseVyraz(String vyraz, int[] cislo, String[] operator) {
		// øetìzec, který chceme analyzovat
		 String s = texto.getText();
		 s = s.toLowerCase();

		 // inicializace poèítadel
		 int pocetcisel = 10;
		 int pocetoperatoru = 4;

		 // definice typù znakù
		 String cisla = "1234567890";
		 String operatory = "+-*/";

		 // hlavní cyklus
		 for (char c : s.toCharArray()) {
			 if (cisla.contains(String.valueOf(pocetcisel))) {
			       
			    }
			   
			    else if (operatory.contains(String.valueOf(pocetoperatoru))) {
			        
			    }	
		 }
		 }
	}




