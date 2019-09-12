package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InitialFX {
	
	private Connection connection;
	
	@FXML
	private Label producto;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
}
