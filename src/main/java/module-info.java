module com.example.artificialpalace {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.artificialpalace to javafx.fxml;
    exports com.example.artificialpalace;
}