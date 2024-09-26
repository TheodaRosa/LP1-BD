module org.lojanova.lojanova {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.lojanova.lojanova to javafx.fxml;
    exports org.lojanova.lojanova;
}