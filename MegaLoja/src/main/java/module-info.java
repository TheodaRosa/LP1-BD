module com.loja.megaloja {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.loja.megaloja to javafx.fxml;
    exports com.loja.megaloja;
}