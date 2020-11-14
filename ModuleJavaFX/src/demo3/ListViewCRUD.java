package demo3;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ListViewCRUD extends Application {
	/*
	 * Our data Object
	 */
	public static class SpiritualTeacher {
		private final SimpleStringProperty name;

		private SpiritualTeacher(String name) {
			this.name = new SimpleStringProperty(name);
		}

		public String getName() {
			return name.get();
		}

		public void setName(String mName) {
			name.set(mName);
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	/*
	 * ObservableList. Our data source.
	 */
	private final ObservableList<SpiritualTeacher> spiritualTeachers = FXCollections.observableArrayList(
			new SpiritualTeacher("Sedata"), new SpiritualTeacher("Meister Eckhart"), new SpiritualTeacher("Confucius"),
			new SpiritualTeacher("Rumi"), new SpiritualTeacher("Ramana Maharshi"));
	private int selectedIndex = -1;

	/*
	 * JavaFx Start Method
	 */
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new Group());
		stage.setTitle("JavaFX ListView CRUD - ADD UPDATE DELETE CLEAR");
		stage.setWidth(450);
		stage.setHeight(550);
		Label nameLabel = new Label("Spiritial Teachers");
		nameLabel.setFont(new Font("Arial", 20));
		TextField nameTxt = new TextField();
		nameTxt.setPromptText("Name");
		ListView myListView = new ListView();
		myListView.setItems(spiritualTeachers);
		myListView.setOnMouseClicked(event -> {
			String selectedItem = myListView.getSelectionModel().getSelectedItem().toString();
			selectedIndex = myListView.getSelectionModel().getSelectedIndex();
			nameTxt.setText(selectedItem);
		});
		Button addButton = new Button("Add");
		addButton.setOnAction((ActionEvent e) -> {
			spiritualTeachers.add(new SpiritualTeacher(nameTxt.getText()));
			nameTxt.clear();
		});
		Button updateBtn = new Button("Update");
		updateBtn.setOnAction((ActionEvent e) -> {
			Dialog d = new Alert(Alert.AlertType.INFORMATION, String.valueOf(selectedIndex));
			d.show();
			spiritualTeachers.remove(selectedIndex);
			spiritualTeachers.add(selectedIndex, new SpiritualTeacher(nameTxt.getText()));
			nameTxt.clear();
		});
		Button deleteBtn = new Button("Delete");
		deleteBtn.setOnAction((ActionEvent e) -> {
			spiritualTeachers.remove(selectedIndex);
			nameTxt.clear();
		});
		Button clearBtn = new Button("Clear");
		clearBtn.setOnAction((ActionEvent e) -> {
			spiritualTeachers.clear();
			nameTxt.clear();
		});
		HBox myHBox = new HBox();
		myHBox.getChildren().addAll(nameTxt, addButton, updateBtn, deleteBtn, clearBtn);
		myHBox.setSpacing(3);
		VBox myVBox = new VBox();
		myVBox.setSpacing(5);
		myVBox.setPadding(new Insets(10, 0, 0, 10));
		myVBox.getChildren().addAll(nameLabel, myListView, myHBox);
		((Group) scene.getRoot()).getChildren().addAll(myVBox);
		stage.setScene(scene);
		stage.show();
	}

	/*
	 * Main method
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}
}
