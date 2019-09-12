package controller;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFX {
	
	private Connection connection;

	@FXML
	private TextField txtUsuario;

	@FXML
	private PasswordField txtPassword;
	
	@FXML
	private Button btnAceptar;

	@FXML
	private Button btnCancelar;

	@FXML
	private void initialize() {

	}

	@FXML
	private void btnAceptar_Action() {
		try {
			connection = new Connection(txtUsuario.getText(), txtPassword.getText(), "proyectorestaurante");
			FormsOperations formsOperations = new FormsOperations();
			FXMLLoader fXMLLoader = formsOperations.OpenForm("Menu", "/view/InitialFX.fxml");
			InitialFX initialFX = fXMLLoader.getController();
			initialFX.setConnection(connection);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
