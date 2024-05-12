module JavaFXMLEjemplo.javafx_fxml {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.bytedeco.javacv;
	requires org.bytedeco.javacv.platform;

	requires org.bytedeco.opencv;
	requires javafx.graphics;

	opens JavaFXMLEjemplo.javafx_fxml to javafx.fxml;

	exports JavaFXMLEjemplo.javafx_fxml;
}
