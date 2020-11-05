package gui;

import java.util.List;
import core.HRM;
import core.Student;
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

public class HomeController {
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
	private Label loginMessage;
// Khai báo thêm thuộc tính role và userName
// để nhận dữ liệu truyền từ LoginController sang
	private int role;
	private String userName;

@SuppressWarnings("unchecked")
@FXML
public void initialize() {
// run later để nhận được các giá trị role,
// userName truyền sang
Platform.runLater(() -> {
// Lấy về các cột 0 của bảng và gắn với thuộc tính "code" tương

ứng trong đối tượng sinh viên

TableColumn<Student, String> studentCodeColumn =

(TableColumn<Student, String>) table

.getVisibleLeafColumn(0);
studentCodeColumn.setCellValueFactory(new

PropertyValueFactory<Student, String>("code"));
// Gắn với thuộc tính fullname
TableColumn<Student, String> fullnameColumn = ?;
fullnameColumn.?;
// Gắn với thuộc tính class_
TableColumn<Student, String> classColumn = ?;
classColumn.?;
// Lấy danh sách sinh viên
List<Student> studentList = new HRM().getStudentList();
// Chuyển kiểu cho danh sách sinh viên sang dạng ObservableList có thể đưa vào tableview

ObservableList<Student> obsStudentList =

FXCollections.observableArrayList(studentList);
// Gán dữ liệu cho tableview
table.setItems(obsStudentList);
if (role == 0) { // Nếu là sinh vien -> disable cac nut bam
btnAdd.setDisable(true);
// disable nút update ?;
// disable nút delete ?;
// Đưa username vào nhãn loginMessage để hiển thị lên giao diện

loginMessage.setText("Login student:\n" + userName);
} else {
loginMessage.setText("Login lecturer:\n" + userName);
}
});
}

// Xử lý sự kiện bấm nút Add sau khi nhập dữ liệu vào 3 ô
	@SuppressWarnings("unchecked")
	public void onClickAddButton() {
// Tạo đối tượng sinh viên từ 3 ô dữ liệu nhập vào
		Student std = new Student(textCode.getText(), textName.getText(),

				textClass.getText());

// Thêm vào danh sách dữ liệu của tableview
		table.getItems().add(std);
	}

// Xử lý sự kiện bấm nút Update sau khi sửa dữ liệu tương ứng với một dòng được chọn trên tableview

public void onClickUpdateButton() {
// Lấy về chỉ số dòng đang được chọn trên bảng
int selectedIndex = table.getSelectionModel().getSelectedIndex();
// Lấy về đối tượng dữ liệu tương ứng với dòng được chọn
Student selectedStudent = table.getItems().get(selectedIndex);

// Thay đổi dữ liệu trong đối tượng sinh viên được chọn
selectedStudent.setCode(textCode.getText());
selectedStudent.setFullname(?);
selectedStudent.setClass_(?);
// Cập nhật lại đối tượng dữ liệu tại vị trí được chọn để hiển thị lên bảng

table.getItems().set(selectedIndex, selectedStudent);
}

// Xử lý sự kiện bấm nút xóa một dòng được chọn trong bảng
	public void onClickDeleteButton() {
		int selectedIndex = table.getSelectionModel().getSelectedIndex();
		table.getItems().remove(selectedIndex);
	}

// Xử lý sự kiện click chọn một dòng trên bảng
public void onClickRow() {
// Lấy dữ liệu từ dòng được chọn gán vào các ô text tương ứng bên dưới
textCode.setText(table.getSelectionModel().getSelectedItem().getCode());
textName.?;
textClass.?;
}

// Phương thức gán dữ liệu cho role
	public void setRole(int role) {
		this.role = role;
	}

// Phương thức gán dữ liệu cho userName
	public void setUserName(String userName) {
		this.userName = userName;
	}
}