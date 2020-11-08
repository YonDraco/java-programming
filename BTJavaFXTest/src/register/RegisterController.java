package register;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterController {
	@FXML
	TextField emailTF;
	@FXML
	TextField hoTenTF;
	@FXML
	Label msg;

	@FXML
	public void onClickRegisterButton() {
		String email = emailTF.getText();
		String hoTen = hoTenTF.getText();
		RegisterModel registerModel = new RegisterModel();
		if (registerModel.checkExist(email)) {
			msg.setText("Email đã tồn tại!");
		} else {
			registerModel.themUser(new User(email, hoTen));
			msg.setText("Đăng ký thành công");
		}
	}

}
