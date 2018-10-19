package com.example.bootifulfx;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SimpleController {

	private final HostServices hostServices;

	@FXML
	public Label label;

	@FXML
	public Button button;


	@FXML
	public void initialize() {
		this.button.setOnAction(actionEvent ->
			this.label.setText(this.hostServices.getDocumentBase())
		);
	}
}
