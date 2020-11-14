package application;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
	@FXML
	private TextField id_hoten;

	@FXML
	private TextField id_email;

	@FXML
	private Button id_btn;

	@FXML
	private Label id_hidden;

	public void initialize() {
		id_btn.setDefaultButton(true);
	}

	public void onClick(ActionEvent e) {
		String email = id_email.getText();
		String hoten = id_hoten.getText();
		// Lay ds tkhoan
		QuanLy ql = new QuanLy();
		List<User> list = ql.traVe();

		for (User account : list) {
			if (account.getEmail().equals(id_email.getText())) {
				// Thong bao email da ton tai
				id_hidden.setText("Email da ton tai. Email la: " + account.getEmail());
			} else {
				ql.themUser(hoten, email);
				id_hidden.setText("Đăng ký thành công");
			}
		}
		// nhay den trang chu
		ql.themUser(id_hoten.getText(), id_email.getText());

		showHomeGUI();
	}

	public void showHomeGUI() {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("formThongBao.fxml"));
			Parent root = (Parent) fxmlLoader.load();

			ThongBaoController controller = fxmlLoader.getController();

			// Tao Stage, Scene
			Stage stage = new Stage();
			stage.setTitle("Hello");
			stage.setScene(new Scene(root));
			controller.hienThi(id_hoten.getText(), id_email.getText());
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
