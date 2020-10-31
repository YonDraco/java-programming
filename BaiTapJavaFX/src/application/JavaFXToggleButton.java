package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXToggleButton extends Application {
	@Override
	public void start(Stage stage) {
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setSpacing(5);
		// Tạo ToggleGroup
		ToggleGroup group = new ToggleGroup();
		ToggleButton maleBtn = new ToggleButton("Nam");
		ToggleButton femaleBtn = new ToggleButton("Nữ");
		// Đặt các ToggleButton vào nhóm.
		maleBtn.setToggleGroup(group);
		femaleBtn.setToggleGroup(group);
		// Đặt lựa chọn mặc định
		maleBtn.setSelected(true);
		root.getChildren().add(new Label("Giới tính:"));
		root.getChildren().addAll(maleBtn, femaleBtn);

		Scene scene = new Scene(root, 300, 60);
		stage.setTitle("Minh họa JavaFX ToggleButton");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
