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

	// Khai báo thêm thuộc tính role, userName để nhận dữ liệu truyền từ
	// LoginController sang
	private int role;
	private String userName;

	@SuppressWarnings("unchecked")
	@FXML
	public void initialize() {
		// run later để nhận được các giá trị role, userName truyền sang
		Platform.runLater(() -> {
			// Lấy về các cột 0 của bảng và gắn với thuộc tính "code" tương ứng trong đối
			// tượng sinh viên
			TableColumn<Student, String> studentCodeColumn = (TableColumn<Student, String>) table
					.getVisibleLeafColumn(0);

			studentCodeColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("code"));

			// Gắn với thuộc tính fullname
			TableColumn<Student, String> fullnameColumn = (TableColumn<Student, String>) table.getVisibleLeafColumn(1);

			fullnameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("fullname"));

			// Gắn với thuộc tính class_
			TableColumn<Student, String> classColumn = (TableColumn<Student, String>) table.getVisibleLeafColumn(2);

			classColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("class_"));

			// Lấy danh sách sinh viên
			List<Student> studentList = new HRM().getStudentList();

			// Chuyển kiểu cho danh sách sinh viên sang dạng ObservableList có thể đưa vào
			// tableview
			ObservableList<Student> obsStudentList = FXCollections.observableArrayList(studentList);

			// Gán dữ liệu cho tableview
			table.setItems(obsStudentList);

			if (role == 0) {// Nếu là sinh viên -> disable các nút bấm
				btnAdd.setDisable(true);
				btnDelete.setDisable(true);
				btnUpdate.setDisable(true);
				// Đưa userName vào nhãn loginMessage để hiển thị lên giao diện
				loginMessage.setText("Login student:\n" + userName);
			} else {
				loginMessage.setText("Login lecturer:\n" + userName);
			}
		});
	}

	// Xử lý sự kiện nút bấm Add sau khi nhập dữ liệu vào 3 ô
	@SuppressWarnings("unckecked")
	public void onClickAddButton() {
		// Tạo đối tượng sinh viên từ 3 ô dữ liệu nhập vào
		Student std = new Student(textCode.getText(), textName.getText(), textClass.getText());

		// Thêm vào danh sách dữ liệu của tableview
		table.getItems().add(std);
	}

	// Xử lý sự kiện bấm nút Update sau khi sửa dữ liệu tương ứng với một dòng được
	// chọn trên tableview
	public void onClickUpdateButton() {
		// Lấy về chỉ số dòng đang được chọn trên bảng
		int selectedIndex = table.getSelectionModel().getSelectedIndex();

		// Lấy về đối tượng dữ liệu tương ứng với dòng được chọn
		Student seletedStudent = table.getItems().get(selectedIndex);

		// Thay đổi dữ liệu trong đối tượng sinh viên được chọn
		seletedStudent.setCode(textCode.getText());
		seletedStudent.setFullname(textName.getText());
		seletedStudent.setClass_(textClass.getText());

		// Cập nhật lại đối tượng dữ liệu tại vị trí được chọn để hiển thị lên bảng
		table.getItems().set(selectedIndex, seletedStudent);
	}

	// Xử lý sự kiện bấm nút xóa 1 dòng được chọn trên bảng
	public void onClickDeleteButton() {
		int selectedIndex = table.getSelectionModel().getSelectedIndex();
		table.getItems().remove(selectedIndex);
	}

	// Xử lý sự kiện click chọn 1 dòng trên bảng
	public void onClickRow() {
		// Lấy dữ liệu từ dòng được chọn gán vào các ô text tương ứng bên dưới
		textCode.setText(table.getSelectionModel().getSelectedItem().getCode());
		textName.setText(table.getSelectionModel().getSelectedItem().getFullname());
		textClass.setText(table.getSelectionModel().getSelectedItem().getClass_());
	}

	public void setRole(int role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

}
