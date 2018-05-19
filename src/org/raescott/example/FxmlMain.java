package org.raescott.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class FxmlMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

		Scene scene = new Scene(root, 300, 275);

		stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();
	}
}