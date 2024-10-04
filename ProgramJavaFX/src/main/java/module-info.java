module com.mycompany.programjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.programjavafx to javafx.fxml;
    exports com.mycompany.programjavafx;
}
