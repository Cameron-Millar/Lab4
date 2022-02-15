package lab4.lab4;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    public TextField Username;
    public PasswordField Password;
    public TextField FullName;
    public TextField Email;
    public TextField Phone;
    public DatePicker date;
    @FXML
    protected void onRegisterButtonClick() {
        System.out.println(Username.getText());
        System.out.println(Password.getText());
        System.out.println(FullName.getText());
        System.out.println(Email.getText());
        System.out.println(date.getValue());
    }
}