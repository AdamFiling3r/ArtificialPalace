module com.example.artificialpalace {
    requires javafx.controls;
    requires javafx.fxml;
    requires icepdf.viewer;
    requires PDFViewerFX;


    opens com.example.artificialpalace to javafx.fxml;
    exports com.example.artificialpalace;
}