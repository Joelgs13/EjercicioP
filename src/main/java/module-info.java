module com.example.ejerciciop {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.joel.ejerciciop to javafx.fxml;
    exports es.joel.ejerciciop;
}