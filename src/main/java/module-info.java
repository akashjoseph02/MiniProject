module com.example.miniproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.miniproject to javafx.fxml;
    exports com.example.miniproject;
}