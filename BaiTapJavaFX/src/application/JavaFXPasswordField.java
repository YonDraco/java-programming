package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JavaFXPasswordField extends Application {
	@Override
	public void start(Stage stage) {

		TextField textField = new TextField();
		textField.setMinWidth(200);
		textField.setPromptText("Nhập mật khẩu...");
		textField.setFocusTraversable(false);
		textField.setLayoutX(20);
		textField.setLayoutY(20);
		textField.setVisible(false);
		// Trường password trùng vị trí, kích thước với trường text
		PasswordField passwordField = new PasswordField();
		passwordField.setMinWidth(200);
		passwordField.setPromptText("Nhập mật khẩu...");
		passwordField.setFocusTraversable(false);
		passwordField.setLayoutX(20);
		passwordField.setLayoutY(20);
		CheckBox checkBox = new CheckBox();
		checkBox.setText("Hiển thị");
		checkBox.setLayoutX(20);
		checkBox.setLayoutY(50);

		// Xử lý sự kiện click vào checkbox
		checkBox.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				boolean selected = checkBox.isSelected();
				// Điều khiển việc ẩn hiện của trường password,text
				textField.setVisible(selected);
				passwordField.setVisible(!selected);
				// Copy nội dung passwordfield -> textfield
				if (selected) {
					textField.setText(passwordField.getText());
				} else {// Copy nội dung textfield -> passwordfield
					passwordField.setText(textField.getText());
				}
			}
		});
		AnchorPane anchorPane = new AnchorPane(textField, passwordField, checkBox);
		Scene scene = new Scene(anchorPane, 300, 100);
		stage.setTitle("Minh họa JavaFX PasswordField");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
