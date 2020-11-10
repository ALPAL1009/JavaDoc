package application;

//Author Name: Gregory Griffin
//Date: 3/14/2020
// UpDated: 4/2/2020
//Program Name: Griffin_module10_Add_JavaDoc
//Purpose: Add JavaDoc usage to your word occurrences

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



// This is a Test 



/**
 * <h1>Word Occurrences Application<h1>
 * <p>
 * @author Gregory Griffin
 */
public class Main extends Application {
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Word occurrences GUI");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 
     * This is the main method  
     * which executes/launches the java program.
     */
	public static void main(String[] args) {
		launch(args);
		
	}
}
