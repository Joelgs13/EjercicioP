module com.example.ejerciciop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciop to javafx.fxml;
    exports com.example.ejerciciop;
}