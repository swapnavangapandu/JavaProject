package Daywise_Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//Create a List of 20 test names and print only tests containing the word Login.

public class Day10{
	public static void main(String[]args) {
		List <String> testNames = Arrays.asList("ApiLogin", "Test", "WebLogin", "LoginPage", "hello", "swapna");
		for(String testName : testNames) {
			if(testName.contains("Login")) {
				System.out.println(testName);
			}
		}
		
//Convert an array to List and sort it without modifying the source array.
     int[] numbers = {10,5,15,30,78,1,6};
  ArrayList<Integer> newlist = new ArrayList();
  for(int number : numbers) {
	  newlist.add(number);
  }

Collections.sort(newlist);
System.out.println("Original Array: " + Arrays.toString(numbers));
		System.out.println("Sorted Array:  " + newlist);
	}
}
	




//Insert a high-priority test at index 0 and explain the cost of repeated inserts at the beginning of an ArrayList.








//Compare ArrayList and LinkedList for a suite that frequently reads by index but rarely inserts in the middle.



