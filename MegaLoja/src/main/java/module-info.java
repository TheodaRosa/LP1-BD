module com.loja.megaloja {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.loja.objects to javafx.fxml;
    exports com.loja.objects;
    exports com.loja.controllers;
    opens com.loja.controllers to javafx.fxml;
    exports com.loja;
    opens com.loja to javafx.fxml;
}