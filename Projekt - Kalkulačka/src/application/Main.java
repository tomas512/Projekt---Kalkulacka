package application;
	
import java.io.IOException;

import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private BorderPane rootLayout;
	private Controller Controller;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			initRootLayout(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initRootLayout(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/view/RootLayout.fxml"));
		rootLayout = (BorderPane) loader.load();
		Controller = loader.getController();
		Scene scene = new Scene(rootLayout,800,600);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
