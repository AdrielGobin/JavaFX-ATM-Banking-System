package banking_application.pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AccountStageController implements Initializable{
	
	//radio buttons
	@FXML
	RadioButton checkBtn;
	@FXML
	RadioButton savBtn;
	
	//text fields
	@FXML
	TextField nameInput;
	@FXML
	TextField idInput;
	@FXML
	TextField numInput;
	@FXML
	TextField startBal;
	@FXML
	TextField minBal;
	@FXML
	TextField intRate;
	
	@Override
		public void initialize(URL location, ResourceBundle resources) {
		}
	
	public int accountType(){
		int data = 0;
		
		if (checkBtn.isSelected())
			data = 1;
		else if (savBtn.isSelected())
			data = 2;
		
		return data;
	}
	
	public String nameInput(){
		String data = nameInput.getText();
		return data;
	}
	public String IDInput(){
		String data = idInput.getText();
		return data;
	}
	public float accountNum(){
		float data = Float.valueOf(numInput.getText());
		return data;
	}
	public float startBal(){
		float data = Float.valueOf(startBal.getText());
		return data;
	}
	public float minBal(){
		float data = Float.valueOf(minBal.getText());
		return data;
	}
	public float intRate(){
		float data = Float.valueOf(intRate.getText());
			return data;
	}
	
}
