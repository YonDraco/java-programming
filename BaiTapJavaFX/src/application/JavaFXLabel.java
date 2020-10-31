package application;

import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXLabel extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Label label1 = new Label();
		label1.setGraphic(
				new ImageView(new Image(new FileInputStream(new File("C:\\Users\\hthit\\Pictures\\dog.jpg")))));
		label1.setMaxWidth(55);
		label1.setAlignment(Pos.CENTER);

		Label label2 = new Label();
		label2.setText("http://fita.vnua.edu.vn");
		label2.setTextFill(Color.BLUE);
		label2.setFont(new Font("Arial", 20));
		label2.setAlignment(Pos.CENTER);
		// Vbox: layout sắp các thành phần chứa bên trong theo chiều dọc
		VBox vBox = new VBox(label1, label2);
		vBox.setSpacing(12);
		vBox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vBox, 500, 500);
		stage.setTitle("Khoa CNTT - VNUA");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}