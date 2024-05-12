package JavaFXMLEjemplo.javafx_fxml;

import java.io.ByteArrayInputStream;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

import javafx.scene.image.Image;

public class CameraCaptureExample {

	private VideoCapture capture;

	public CameraCaptureExample() {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		capture = new VideoCapture(0);
		capture.set(Videoio.CAP_PROP_FRAME_WIDTH, 640);
		capture.set(Videoio.CAP_PROP_FRAME_HEIGHT, 480);
	}

	public Image captureImage() {
		Mat frame = new Mat();
		capture.read(frame);

		Mat dest = new Mat();
		Core.flip(frame, dest, 0);
		Size sz = new Size(640, 480);
		Imgproc.resize(dest, dest, sz);

		byte[] imageData = new byte[(int) (dest.total() * dest.channels())];
		dest.get(0, 0, imageData);

		Image imagen = new Image(new ByteArrayInputStream(imageData));

		return imagen;
	}
}
