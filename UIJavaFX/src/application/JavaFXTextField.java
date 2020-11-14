package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTextField extends Application {
	@Override
	public void start(Stage stage) {
		Label label = new Label();
		label.setMaxWidth(300);
		label.setText("ĐĂNG NHẬP TRANG SINH VIÊN");
		label.setAlignment(Pos.CENTER);
		TextField textField = new TextField();
		textField.setMaxWidth(200);
		textField.setMinHeight(25);
		textField.setPromptText("Nhập mã sinh viên và nhấn Enter");
		// Vô hiệu hóa trạng thái focus mặc định để hiển thị prompt text
		textField.setFocusTraversable(false);

		// Xử lý sự kiện kết thúc nhập và nhấn Enter
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Kiểm tra mã sinh viên: " + textField.getText());
			}
		});
		VBox vBox = new VBox(label, textField);
		vBox.setSpacing(10);
		vBox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vBox, 300, 80);
		stage.setTitle("Minh họa JavaFX TextField");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
