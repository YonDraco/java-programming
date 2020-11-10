package login;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyController {
	@FXML
	TextField textField;

	@FXML
	Button myButton;

	@FXML
	public void showHomePage() {
		Stage homePageStage = new Stage();
		Label nameLabel = new Label("     Xin chào " + textField.getText());
		HBox homePageRoot = new HBox(nameLabel);
		Scene homePageScene = new Scene(homePageRoot, 200, 200);
		homePageStage.setScene(homePageScene);
		homePageStage.setTitle("Home Page");
		homePageStage.show();

		Stage parentStage = (Stage) textField.getScene().getWindow();
		parentStage.close();
	}
}
