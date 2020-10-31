package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXRadioButton extends Application {
	@Override
	public void start(Stage stage) {
		HBox root = new HBox();
		// Tạo các RadioButton và thêm vào nhóm
		ToggleGroup group = new ToggleGroup();
		RadioButton button1 = new RadioButton("Green");
		button1.setToggleGroup(group);
		RadioButton button2 = new RadioButton("Yellow");
		button2.setToggleGroup(group);
		RadioButton button3 = new RadioButton("Red");
		button3.setToggleGroup(group);
		// Thiết lập mặc định
		button1.setSelected(true);
		root.setStyle("-fx-background-color: #00FF00;");
		// Xử lý sự kiện thay đổi lựa chọn RadioButton trong group
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
				if (group.getSelectedToggle() != null) {
					RadioButton selectedRadio = (RadioButton) group.getSelectedToggle();
					switch (selectedRadio.getText()) {
					case "Green":
						root.setStyle("-fx-background-color: #00FF00;");
						break;
					case "Yellow":
						root.setStyle("-fx-background-color: #FFFF00;");
						break;
					case "Red":
						root.setStyle("-fx-background-color: #FF0000;");
						break;
					default:
						root.setStyle("-fx-background-color: #FAF8CC;");
						break;
					}
				}
			}
		});
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(button1, button2, button3);
		Scene scene = new Scene(root, 300, 100);
		stage.setTitle("Minh họa JavaFX RadioButton");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
