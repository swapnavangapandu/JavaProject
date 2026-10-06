package Daywise_classnotes;

public class Operators1 {

	public static void main (String[]args) {
// Write a program to find whether a number is even or odd using %.
		int num = 27;
		String result = num % 2 == 0 ? "The given number is even" : "The given number is odd ";
		System.out.println(result);
		
// Write a program to check cart quantity
		int stock = 12;
		int requestedQty = 11;
		String quantityCheck = requestedQty > 0 && requestedQty <= stock ? "Stock available you can order"	 : "Stock not available" ;	
		System.out.println(quantityCheck);
				
// Write a program to swap to two numbers
	
	int a = 5;
	int b = 6;
	int temp = a;
	  a = b;
	 b = temp;
	 
	 System.out.println("a = " + a + "b = " + b);
	 
}}