package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ThongBaoController {
	@FXML
	private Label id_hidden;

	public void hienThi(String hoten, String email) {
		id_hidden.setText("Tên người dùng: " + hoten + "Email: " + email);
	}
}
