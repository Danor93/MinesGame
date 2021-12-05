package SimpleFx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainForFX extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();
		VBox root;
		try {
			loader.setLocation(getClass().getResource("SecFXML.fxml"));
			root = loader.load();
			Scene s = new Scene(root);
			primaryStage.setScene(s);
			primaryStage.setTitle("Vote");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
