package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXChoiceBox extends Application {
	@Override
	public void start(Stage primaryStage) {
		ProgrammingLanguage java = new ProgrammingLanguage("PL01", "Java");
		ProgrammingLanguage cSharp = new ProgrammingLanguage("PL02", "C#");
		ProgrammingLanguage ruby = new ProgrammingLanguage("PL03", "Ruby");
		ProgrammingLanguage python = new ProgrammingLanguage("PL04", "Python");
		HBox root = new HBox();
		Label label = new Label("Select Programming Language: ");
		Label selectedPL = new Label();
		ObservableList<ProgrammingLanguage> languages = FXCollections.observableArrayList(cSharp, java, ruby, python);
		ChoiceBox<ProgrammingLanguage> choiceBox = new ChoiceBox<ProgrammingLanguage>(languages);
		// Đặt lựa chọn mặc định
		choiceBox.setValue(java);
		selectedPL.setText(java.getCode() + "-" + java.getName());

		ChangeListener<ProgrammingLanguage> changeListener = new ChangeListener<ProgrammingLanguage>() {
			@Override
			public void changed(ObservableValue<? extends ProgrammingLanguage> observable, ProgrammingLanguage oldValue,
					ProgrammingLanguage newValue) {
				// Hiển thị mã và tên ngôn ngữ được chọn
				ProgrammingLanguage selected = choiceBox.getValue();
				selectedPL.setText(selected.getCode() + " - " + selected.getName());
			}
		};
		// Sự kiện khi thay đổi Item trên ChoiceBox

		choiceBox.getSelectionModel().selectedItemProperty().addListener(changeListener);
		root.getChildren().addAll(label, choiceBox, selectedPL);
		root.setPadding(new Insets(20));
		root.setSpacing(5);
		primaryStage.setTitle("Minh họa JavaFX ChoiceBox");

		Scene scene = new Scene(root, 370, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
