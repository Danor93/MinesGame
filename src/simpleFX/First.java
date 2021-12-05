package simpleFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class First extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(makeVBox());
		stage.setTitle("Vote");
		stage.setScene(scene);
		stage.show();
	}

	private int i = 0;

	private VBox makeVBox() {
		HBox hbox;
		VBox vbox;
		Label label = new Label("0");
		Button b1 = new Button("Ofra Haza");
		Button b2 = new Button("Yardena Arazi");

		class LabelIncreaser implements EventHandler<ActionEvent> {

			@Override
			public void handle(ActionEvent event) {
				String Str = "";
				i++;
				label.setText(Str + i);

			}

		}
		class LabelIncreaser2 implements EventHandler<ActionEvent> {

			@Override
			public void handle(ActionEvent event) {
				String Str = "";
				i--;
				label.setText(Str + i);
			}

		}
		BackgroundFill f = new BackgroundFill(Color.RED, null, null);// background fill color
		Background b = new Background(f);
		label.setTextFill(Color.BLACK);
		label.setBackground(b);
		label.setMaxWidth(Double.MAX_VALUE);
		label.setMaxHeight(Double.MAX_VALUE);
		label.setAlignment(Pos.CENTER);
		b1.setOnAction(new LabelIncreaser());
		b2.setOnAction(new LabelIncreaser2());
		hbox = new HBox(20, b1, b2);
		hbox.setAlignment(Pos.BASELINE_LEFT);
		hbox.setPadding(new Insets(20));
		vbox = new VBox(hbox, label);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPrefHeight(100);
		vbox.setPadding(new Insets(10));
		return vbox;
	}
}