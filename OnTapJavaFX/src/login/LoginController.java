package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private TextField textField;

	@FXML
	private PasswordField passwordField;

	@FXML
	private Label msg;

	@FXML
	private Button myButton;

	@FXML
	void showHomePage(ActionEvent event) {
		String username = textField.getText();
		String password = passwordField.getText();
		ListUser listUser = new ListUser();
		if (listUser.checkExist(password)) {
			Stage homePageStage = new Stage();
			Label nameLabel = new Label("     Xin chào " + textField.getText());
			HBox homePageRoot = new HBox(nameLabel);
			Scene homePageScene = new Scene(homePageRoot, 200, 200);
			homePageStage.setScene(homePageScene);
			homePageStage.setTitle("Home Page");
			homePageStage.show();

			Stage parentStage = (Stage) textField.getScene().getWindow();
			parentStage.close();
		} else {
			msg.setText("Sai password");
		}
	}
}
