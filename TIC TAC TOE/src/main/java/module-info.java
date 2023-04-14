module com.example.tic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tic to javafx.fxml;
    exports com.example.tic;
}