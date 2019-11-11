import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreen {
    @FXML
    Label label_Version;
    @FXML
    TextField textfield_username;
    @FXML
    TextField textField_password;
    @FXML
    Button button_login;
    @FXML
    Button button_createAccount;


    public void login(ActionEvent actionEvent) {
        label_Version.setText("Login erfolgt...");
    }

    public void createAccount(ActionEvent actionEvent) {
        label_Version.setText("Account wird erstellt.");
    }
}
