package gui;

import java.util.List;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeControllerDB {
@FXML
private TableView<Student> table = new TableView<Student>();
@FXML
private TextField textCode;
@FXML
private TextField textName;
@FXML
private TextField textClass;
@FXML
private Button btnAdd;
@FXML
private Button btnUpdate;
@FXML
private Button btnDelete;
@FXML
private Label message;
// Tao doi tuong tang Model
// HRMDB hrmDB = new HRMDB
"jdbc:ucanaccess://E:/TTHIEU/JAVA/workspace/hrm.accdb
","", "");
@SuppressWarnings("unchecked")
@FXML
public void initialize() {
Platform.runLater(() -> {
TableColumn<Student, String> studentCodeColumn =

(TableColumn<Student, String>) table

.getVisibleLeafColumn(0);
studentCodeColumn.setCellValueFactory(new

PropertyValueFactory<Student, String>("code"));

TableColumn<Student, String> fullnameColumn =
(TableColumn<Student, String>) table.getVisibleLeafColumn(1);
fullnameColumn.setCellValueFactory(new
PropertyValueFactory<Student, String>("fullname"));

TableColumn<Student, String> classColumn = (TableColumn<Student,

String>) table.getVisibleLeafColumn(2);

classColumn.setCellValueFactory(new PropertyValueFactory<Student,

String>("class_"));

List<Student> studentList = hrmDB.getStudentList(); // DB
ObservableList<Student> obsStudentList =

FXCollections.observableArrayList(studentList);
table.setItems(obsStudentList);
});
}
public void onClickAddButton() {

Student std = new Student(textCode.getText(), textName.getText(),

textClass.getText());

boolean addResult = hrmDB.addStudent(std);
if (addResult) {
table.getItems().add(std);
System.out.println("Add successfull!");
message.setText("Add successfull!");
} else {
System.out.println("Error add to database!");
message.setText("Error add to database!!");
}
}
public void onClickUpdateButton() {
int selectedIndex = table.getSelectionModel().getSelectedIndex();
Student selectedStudent = table.getItems().get(selectedIndex);
selectedStudent.setCode(textCode.getText());
selectedStudent.setFullname(textName.getText());
selectedStudent.setClass_(textClass.getText());
if (selectedIndex >= 0) {
boolean updateResult = hrmDB.updateStudent(selectedStudent);
if (updateResult) {
table.getItems().set(selectedIndex, selectedStudent);
System.out.println("Update successfull!");
message.setText("Update successfull!");
} else {
System.out.println("Error update to database!");
message.setText("Error update to database!");
}
}
}
public void onClickDeleteButton() {
int selectedIndex = table.getSelectionModel().getSelectedIndex();
Student std = table.getItems().get(selectedIndex);
if (selectedIndex >= 0) {
boolean deleteResult = hrmDB.deleteStudent(std.getCode());
if (deleteResult) {
table.getItems().remove(selectedIndex);
System.out.println("Delete successfull!");
message.setText("Delete successfull!");
} else {
System.out.println("Error delete to database!");
message.setText("Error delete to database!");
}
}
}
public void onClickRow() {
textCode.setText(table.getSelectionModel().getSelectedItem().getCode());
textName.setText(table.getSelectionModel().getSelectedItem().getFullname());
textClass.setText(table.getSelectionModel().getSelectedItem().getClass_());
}
