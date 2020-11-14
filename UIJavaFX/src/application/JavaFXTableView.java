package application;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class JavaFXTableView extends Application {
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage) {
		TableView<Student> table = new TableView<Student>();
// Cho phép chỉnh sửa dữ liệu trong bảng với
// các cột thực hiện setCellFactory
		table.setEditable(true);
// Cho phép thay đổi kích thước bảng +
// Kết hợp setHgrow, setVgrow trong layout
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		TableColumn<Student, String> codeCol = new TableColumn<Student, String>("Msv");
		TableColumn<Student, String> fullNameCol = new TableColumn<Student, String>("Họ tên");
		TableColumn<Student, String> lastNameCol = new TableColumn<Student, String>("Họ đệm");
		TableColumn<Student, String> firstNameCol = new TableColumn<Student, String>("Tên");
		TableColumn<Student, String> genderCol = new TableColumn<Student, String>("Giới tính");
		TableColumn<Student, Boolean> activeCol = new TableColumn<Student, Boolean>("Kích hoạt");
// Thêm 2 cột Họ đệm, Tên vào cột Họ tên
		fullNameCol.getColumns().addAll(lastNameCol, firstNameCol);
		table.getColumns().addAll(codeCol, fullNameCol, genderCol, activeCol);
//Bắt cặp 3 cột với 3 thuộc tính đã có
//dữ liệu trong đối tượng sinh viên
		codeCol.setCellValueFactory(new PropertyValueFactory<Student, String>("code"));
		lastNameCol.setCellValueFactory(new PropertyValueFactory<Student, String>("lastName"));
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Student, String>("firstName"));
//Cho phép chỉnh sửa dữ liệu trường Họ đệm qua ô TextField
		lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
//Xử lý sự kiện kết thúc việc chỉnh sửa ô trong cột Họ đệm
		lastNameCol.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Student, String>>() {
			@Override
			public void handle(CellEditEvent<Student, String> event) {
				System.out.println("Thay đổi họ đệm: " + event.getOldValue() + " -> " + event.getNewValue());
//Cập nhật vào đối tượng sinh viên
//tương ứng trong danh sách
				String newLastName = event.getNewValue();
				int row = event.getTablePosition().getRow();
				Student std = event.getTableView().getItems().get(row);
				std.setLastName(newLastName);
			}
		});
//Cho phép chỉnh sửa dữ liệu trường "Kích hoạt" qua ô checkbox
		activeCol.setCellFactory(CheckBoxTableCell.forTableColumn(activeCol));
//Cho phép chỉnh sửa dữ liệu trường "Giới tính" qua ô ComboBox
		genderCol.setCellFactory(ComboBoxTableCell.forTableColumn("Nam", "Nữ"));
		List<Student> studentList = getStudentList();
		ObservableList<Student> obsList = FXCollections.observableArrayList(studentList);
		table.setItems(obsList);
		GridPane root = new GridPane();
		root.getChildren().add(table);
		GridPane.setHgrow(table, Priority.ALWAYS);
		GridPane.setVgrow(table, Priority.ALWAYS);
		stage.setTitle("Minh họa JavaFX TableView");
		Scene scene = new Scene(root, 450, 300);
		stage.setScene(scene);
		stage.show();
	}

	private List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("639313", "Hoàng", "Nguyễn Văn"));
		studentList.add(new Student("638811", "Ngọc", "Vũ Văn"));
		studentList.add(new Student("620835", "Hoa", "Nguyễn Mai"));
		studentList.add(new Student("622649", "Tuân", "Đỗ Đức"));
		return studentList;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
