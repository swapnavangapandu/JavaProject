package Daywise_classnotes;

import java.util.Scanner;

public class flow_Controls {
	
	public static void main (String[]args) {
		
		//Take the inputs from user username and password , login if data is valid
		
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter valid username"); String username = sc.next();
		 * System.out.println("Enter valid password"); String password = sc.next();
		 * 
		 * if(username.equals("swapna") && password.equals("S4567@") ) {
		 * System.out.println("Login Successfully"); }
		 * 
		 * else { System.out.println("Invalid Credentials"); }
		 */
		
		
		//How would you find the first price greater than ₹10,000?
		
               int first_Price =   sc.nextInt();
               int diff = first_Price - 10000;
               
               if(first_Price > 10000) {
            	   System.out.println("First price greater by : " + diff);
               }
               
               else {
            	   System.out.println("First price is not greater");
               }
	}

}
