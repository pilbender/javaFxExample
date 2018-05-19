package org.raescott.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class FxmlController {
	@FXML
	private Text actiontarget;

	@FXML protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Sign in button pressed");
	}
}
