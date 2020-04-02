package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;






public class pressButtonTest  {
	
	private ArrayList<String> myList = new ArrayList<String>();

	@Test
	public void test() {
		String string = "Java";
		Controller testController = new Controller();
		testController.toString();
		
		myList.add("Java");
		myList.add("Python");
		myList.add("C");
		
		System.out.printf("My favorite programming languages are: %s, %s, and %s ",
				myList.contains("Java"),
				myList.contains("Python"), 
				myList.contains("C"));
		
		
		
		
	}

}
