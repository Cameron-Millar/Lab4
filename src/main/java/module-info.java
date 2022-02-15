module lab4.lab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab4.lab4 to javafx.fxml;
    exports lab4.lab4;
}