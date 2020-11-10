package ontap;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {
	@FXML
	private Label lblThongBao;

	public void hienThi(String name, String email) {
		lblThongBao.setText("Ten nguoi dung: " + name + ", Email: " + email);
	}
}
