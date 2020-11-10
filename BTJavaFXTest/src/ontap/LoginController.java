package ontap;

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

public class LoginController {
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtEmail;
	@FXML
	private Button btnLogin;
	@FXML
	private Label lblThongBao;

	public void initialize() {
		btnLogin.setDefaultButton(true);
	}

	public void onClick(ActionEvent e) {

		// Lay ds tkhoan
		QuanLy ql = new QuanLy();
		List<Account> list = ql.traVe();

		for (Account account : list) {
			if (account.getEmail().equals(txtEmail.getText())) {
				// Thong bao email da ton tai
				lblThongBao.setText("Email da ton tai. Email la: " + account.getEmail());
				return;
			}
		}
		// nhay den trang chu
		ql.themAccount(txtName.getText(), txtEmail.getText());

		showHomeGUI();
	}

	public void showHomeGUI() {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("formTrangChu.fxml"));
			Parent root = (Parent) fxmlLoader.load();

			HomeController controller = fxmlLoader.getController();

			// Tao Stage, Scene
			Stage stage = new Stage();
			stage.setTitle("Trang chu");
			stage.setScene(new Scene(root));
			controller.hienThi(txtName.getText(), txtEmail.getText());
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
