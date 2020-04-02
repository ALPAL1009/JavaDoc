package application;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.omg.CORBA.PRIVATE_MEMBER;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextFlow;


/** 
 * Represents a Controller.
 * 
 */
public class Controller 
{
	Button Count;
	
	/**
	 * Annotation that tags a class or member as accessible to markup
	 */
	@FXML
	private Label myMessage;
	
	
	
	/** This is a pressButton method.
	 * Demonstrates the use of Sets
	 * @param event
	 * @throws IOException
	 */
	
	public void pressButton(ActionEvent event) throws IOException
	{
		Count = new Button();


		/**
         * Set up so that we can do line-oriented character reads
         * from the standard input stream.
         */
		URL url = new URL("http://shakespeare.mit.edu/macbeth/full.html"); // making url object (opens)
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); // reading webpage

		// TreeMap - holds words as keys and values
		Map<String, Integer> map = new TreeMap<>();
		String line = in.readLine();

		try {
			
			// read each line
			while ((line = in.readLine()) != null) {
				String[] words = line.split("[ \n\t\r.,;:!?()#{}<>=/%123\"'-4567890]"); // words declares what will not
																						// be in output

				// Determining repeated words in file
				// incrementing value if word occurs more than once, else initialize as 1
				for (int counter = 0; counter < words.length; counter++) {
					String key = words[counter].toLowerCase();
					if (key.length() > 0) {
						if (map.get(key) == null) {
							map.put(key, 1);
						} else {
							int value = map.get(key).intValue();
							value++;
							map.put(key, value);
						}
					}
				}
			}

			/**	 
			 * Evaluates the provided reader to find individual words and the
			 * number of occurrences of the word.
			 * If there are processing errors the exception is thrown to the
			 * caller.
			 * @return number of occurrences of particular word
			 */
			List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
			Collections.sort(entries, (entry1, entry2) -> {

				return entry2.getValue().compareTo(entry1.getValue());
			
			
			});

			
			
				
			for (Map.Entry<String, Integer> entry : entries) 
			{
				
				
				
				System.out.println(entry.getKey() + "\t\t" + entry.getValue());
				
				Platform.runLater(() -> {
			         myMessage.setText(myMessage.getText() +  entry.getKey() + " = "  + entry.getValue() + "\n"  );
			});
				
				
				
				
				 
			
			}
			
				

			
			
			
			
			
				
				
			
			

		}
		
		
		
		// recover from exception
		catch (IOException error) {
			System.out.println("Invalid File");
			// always executes - closes the stream releasing the resources.
		} finally {
			
			in.close();
		}
		
		
		
		
		
		
	}








	








	private void PrintStream(Object setText) {
		// TODO Auto-generated method stub
		
	}
	
	

}
