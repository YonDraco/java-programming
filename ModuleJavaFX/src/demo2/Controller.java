package demo2;

import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller extends BaseController implements Initializable {

	@FXML
	public ListView<Book> listView;

	@FXML
	private TextField textField;

	SortedList<Book> sortedList;

	FilteredList<Book> filteredList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<Book> items = FXCollections.observableArrayList(new Book("Harry Potter", "J.K. Rowling"),
				new Book("Chronicles of Narnia", "C.S. Lewis"),
				new Book("A Song of Ice and Fire", "George R.R. Martin"));

		sortedList = new SortedList<>(items);
		filteredList = new FilteredList<>(sortedList);

		listView.setItems(filteredList);

		filteredList.setPredicate(book -> book.getAuthor().contains("R"));

		listView.setCellFactory(param -> new ListCell<Book>() {
			@Override
			protected void updateItem(Book item, boolean empty) {
				super.updateItem(item, empty);

				if (empty || item == null) {
					setText(null);
				} else {
					setText(item.getName() + " - " + item.getAuthor());
				}
			}
		});

	}

	@FXML
	void authorAsc(ActionEvent event) {
		sortedList.setComparator(Comparator.comparing(Book::getAuthor));
	}

	@FXML
	void authorDesc(ActionEvent event) {
		sortedList.setComparator(Comparator.comparing(Book::getAuthor, Comparator.reverseOrder()));
	}

	@FXML
	void nameAsc(ActionEvent event) {
		sortedList.setComparator(Comparator.comparing(Book::getName));
	}

	@FXML
	void nameDesc(ActionEvent event) {
		sortedList.setComparator(Comparator.comparing(Book::getName, Comparator.reverseOrder()));
	}

}
