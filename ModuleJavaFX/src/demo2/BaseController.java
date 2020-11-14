package demo2;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class BaseController {
	@FXML
	private TextArea log;

	@FXML
	private AnchorPane pane;

	protected void add(Node node) {
		pane.getChildren().add(node);
	}

	protected void add(Node... nodes) {
		pane.getChildren().addAll(nodes);
	}

	protected void log(Object line) {
		log.appendText(line.toString() + System.lineSeparator());
	}
}
