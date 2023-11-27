module com.example.conversor_divisas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conversor_divisas to javafx.fxml;
    exports com.example.conversor_divisas;
}