package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyController {
	@FXML
	private TextField id_un;

	@FXML
	private PasswordField id_pw;

	@FXML
	private Label id_hidden;

	@FXML
	private Button id_btn;

	public void initialize() {
		id_btn.setDefaultButton(true);
	}

	// Xử lý sự kiện click nút Login
	@FXML
	public void showHomePage(ActionEvent e) throws Exception {
		String username = id_un.getText();
		String password = id_pw.getText();

		// Lay ds tkhoan
		ListUser ql = new ListUser();
		List<User> list = ql.traVe();
		for (User account : list) {
			if (account.getUsername().equals(id_un.getText()) && account.getPassword().equals(id_pw.getText())) {
				id_hidden.setText("Bạn đã đăng nhập thành công.");
				Stage homePageStage = new Stage();
				Label nameLabel = new Label("     Xin chào " + id_un.getText());
				HBox homePageRoot = new HBox(nameLabel);
				Scene homePageScene = new Scene(homePageRoot, 200, 200);
				homePageStage.setScene(homePageScene);
				homePageStage.setTitle("Home Page");
				homePageStage.show();

				Stage parentStage = (Stage) id_un.getScene().getWindow();
				parentStage.close();
			} else {
				id_hidden.setText("Dữ liệu không hợp lệ");
			}
		}
	}
}
