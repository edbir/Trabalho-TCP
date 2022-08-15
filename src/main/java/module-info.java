module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires jfugue;

    opens com.example.demo5 to javafx.fxml;
    exports com.example.demo5;
}