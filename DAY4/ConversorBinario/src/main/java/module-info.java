module com.example.conversorbinario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conversorbinario to javafx.fxml;
    exports com.example.conversorbinario;
}