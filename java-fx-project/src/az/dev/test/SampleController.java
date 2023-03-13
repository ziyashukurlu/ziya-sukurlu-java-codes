package az.dev.test;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SampleController {	
	

	@FXML
	private TextField studentNameText;
	
	@FXML
	private Label studentNameLabel;
    
	@FXML 
	private void saveStudent() {
	    studentNameLabel.setText("Salam, "+studentNameText.getText());
		
	} 	
}