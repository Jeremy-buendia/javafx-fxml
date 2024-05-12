package JavaFXMLEjemplo.javafx_fxml;

import org.opencv.core.Core;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		CameraCaptureExample camera = new CameraCaptureExample();
		ImageView imageView = new ImageView();

		StackPane root = new StackPane();
		root.getChildren().add(imageView);

		Scene scene = new Scene(root, 640, 480);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Camera Capture Example");
		primaryStage.show();

		// Captura una imagen y la muestra en el ImageView
		imageView.setImage(camera.captureImage());
	}

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		launch(args);
	}

}