module com.example.fun4kidz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fun4kidz to javafx.fxml;
    exports com.example.fun4kidz;
}