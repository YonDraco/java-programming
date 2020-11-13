package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SearchController implements Initializable {
	@FXML
	private TextField idtxtsearch;

	@FXML
	private Button idbtnsearch;

	@FXML
	private TableView<Books> idtableview;

	@FXML
	private TableColumn<Books, String> idtitle;

	@FXML
	private TableColumn<Books, String> idauthor;

	// Danh sách hiển thị lưu trữ dữ liệu
	private final ObservableList<Books> dataList = FXCollections.observableArrayList();

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		idtitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		idauthor.setCellValueFactory(new PropertyValueFactory<>("Author"));

		Books b1 = new Books("Vũ trụ", "Carl Sagan");
		Books b2 = new Books("Nhà tiên tri VanGa", "Anna Marianis");
		Books b3 = new Books("Vũ trụ", "Carl Sagan");
		Books b4 = new Books("Nhà tiên tri VanGa", "Anna Marianis");

		dataList.addAll(b1, b2, b3, b4);

		// Hiển thị tất cả dữ liệu
		FilteredList<Books> filteredData = new FilteredList<>(dataList, b -> true);

		// Cài đặt phần tìm dữ liệu
		idtxtsearch.textProperty().addListener((observable, oldValue, newValue) -> {
			filteredData.setPredicate(Books -> {
				// Nếu phần tìm trống thì hiển thị tất cả
				if (newValue == null || newValue.isEmpty()) {
					return true;
				}

				// So sánh tên, tác giả với ô text search
				String lowerCaseFilter = newValue.toLowerCase();
				if (Books.getTitle().contains(newValue)) {
					return true;
				} else if (Books.getAuthor().toLowerCase().contains(lowerCaseFilter)) {
					return true;
				} else
					return false;
			});
		});

		SortedList<Books> sortedData = new SortedList<>(filteredData);

		sortedData.comparatorProperty().bind(idtableview.comparatorProperty()); // Books id của

		idtableview.setItems(sortedData);
	}
}
