package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXCheckBox extends Application {
	public void start(Stage stage) {
		VBox root = new VBox();
		Label label = new Label("LIST BOOK");
		CheckBox checkBox1 = new CheckBox("Java Book");
		checkBox1.setAllowIndeterminate(true);
		CheckBox checkBox2 = new CheckBox("C# Book");
		checkBox2.setAllowIndeterminate(true);
		CheckBox checkBox3 = new CheckBox("Python Book");
		checkBox3.setAllowIndeterminate(true);
		root.setSpacing(10);
		root.setPadding(new Insets(15));
		root.getChildren().addAll(label, checkBox1, checkBox2, checkBox3);
		Scene scene = new Scene(root, 200, 200);
		stage.setTitle("JavaFX CheckBox Demo");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
