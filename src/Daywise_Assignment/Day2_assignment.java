package Daywise_Assignment;

import java.util.Scanner;

public class Day2_assignment {
	static int count = 0;
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
	//BASIC:
		//Create variables for employee name, ID, department, salary and active status. Print a neat report.
		/* String employee_name = "Swapna V";
		 String department = "Software Testing";
		 int salary = 60000;
		 boolean active_status = false;
		 System.out.println("I am " + employee_name + " " + "working as " + department + " "+ "with salary of " + salary+ " " + "and current working status " + active_status);
//-----------------------------------------------------------------------		 
		 //Create a product with price and quantity. Calculate subtotal, 18% tax and final total.
		 String product = "bottles";
		 double price = 99.99;
		 int quantity = 8;
	// total = price * quantity;
		 double subtotal = price * quantity;
		 System.out.println("The subtotal amount is" + subtotal);
		// Tax = 18% of subtotal
		 double tax = 0.18 * subtotal;
		 System.out.println("Tax for the product is " + tax);
		 //final amount = subtotal * tax
		double  final_Amount = subtotal * tax;
		 System.out.println("Final Amount for " + quantity + " " + product+ " "+ "is " + final_Amount  ); */
//-------------------------------------------------------------------------------------------------------		 
		 //Read an integer and print whether it is positive, negative or zero.
		
		   int x = -67;
		   if(x>0) {
			   System.out.println("The given number is +ve");
		   }
		   else if (x<0){
			   System.out.println("The given is number is -ve");
			   
		   }
		   else{
			   System.out.println("The given numver is zero");
			   
		   }
		 
	//-------------------------------------------------------------------------------------	 
		 //Check whether a number is divisible by both 3 and 5 using logical operators.
		 int num = 18;
	String is_num_div = num % 3==0 && num % 5 == 0 ? "Number is divisble by 3 and 5" : "Number is not divisble by 3 and 5";
	System.out.println(is_num_div);
	//------------------------------------------------------------------------------------------	 
		//Create two integers and print sum, difference, product, quotient and remainder.
		 int a = 85;
		 int b= 72;
		int  sum = a+b;
		int diff = a-b;
		int product = a*b;
		int quotient = a/b;
		int remainder = a%b;
		 System.out.println("The sum of two intergers is: " + sum);
		 System.out.println("The difference between two intergers is: " +diff );
		 System.out.println("Product of two numbers is: " + product);
		 System.out.println("The sum of two intergers is: " + quotient);
		 System.out.println("The sum of two intergers is: " + remainder);
		 
		 
//------------------------------------------------------------------------------------------
//Calculate simple interest using principal, rate and time.
		 int principal = 7500;
		 int rate = 5;
		 int time_in_years = 3; 
		 
		double simpleInterest = principal * rate * time_in_years / 100 ;
		System.out.println("SimpleInterest for 3years = " + simpleInterest);
//--------------------------------------------------------------------------------------------		 
		
//Write an eligibility check: age >;= 18 AND income &gt;= 25000.
		int age = 17;
		int income = 24500;
		String Eligibility_Check = age >= 18 && income > 25000 ? "Eliglible for loan" : " Not Eligibile" ;
		System.out.println(Eligibility_Check);
		
//Use ternary to mark an order as "Free Delivery" when amount >= 999..
		double amount = 999.9;
		System.out.println(amount>= 999 ? "Free delivery" : " Delivery charges applicable");
	
		
//Create a static counter that increments every time an object is created.
		int employee = count ++;
		

		
	
		
//Demonstrate pre-increment and post-increment and explain the output.
		
	x = 45;
	 int pre_inc = ++x;
	 System.out.println(pre_inc); // output : 46 here ++x, increments the x first and then assigns the incremented value to pre_inc 
	 System.out.println(x); // output : 46 because the x is incremented 
	 
	 int y = 17;
	 int post_inc = y++;
	  System.out.println(post_inc); //output: 17 here it will assign y to post_inc first and then it increments
	  System.out.println(y); // output: 18
	  
	  //---------------------------------------------------------------------------------------------------------
	  
//Build a banking withdrawal validator using balance, withdrawal amount, accountActive and pinValid.
	  /* double balance = 19999.85;
	   System.out.println("enter withdrawal amount");
	   int withdrawal =  sc.nextInt();
	  boolean accountActive = true;
	  System.out.println("enter pin");
	 int pin =  sc.nextInt();
	   
	  String statement =  withdrawal < balance && accountActive  && pin == 1234 ? " WIthdrawal successfull": "Not successful" ;
	  System.out.println(statement); */
	  
//Build an e-commerce discount rule: VIP = 10%, standard = 5%, but only when cart >= 2000.
	  
		/*
		 * int cartAmount = 2700; String customerType = "VIP"; double discount = 0;
		 * if(cartAmount>= 2000) { if(customerType.equals("VIP")) { discount = 0.1;
		 * 
		 * } else if (customerType.equals("Standard")) {
		 * 
		 * discount = 0.05;
		 * 
		 * }
		 * 
		 * } double discountAmount = cartAmount * discount ; double finalAmount =
		 * cartAmount - discountAmount; System.out.println(discountAmount);
		 * System.out.println(finalAmount);
		 */
	  
//Build a flight booking rule: logged in, seats available, fare> 0, payment successful.
	Boolean loggedin = true;
	int seats_Available = 5;
	int fare = 2500;
	Boolean payment = true;
	
	System.out.println("Enter number of persons");
int bookingseats = 	sc.nextInt();
if(loggedin && bookingseats <= seats_Available && fare >0 && payment ) {
		System.out.println("Booking successfull");
		
	}
else {
	System.out.println("Booking failed");
	
	}
	

//A test may retry up to 3 times. Model retryCount and maxRetry. What should happen at retryCount = 0, 2, 3 and 4?
		int maxRetry = 3;
		//int retryCount = 0;
		for (int retryCount = 0; retryCount<=4; retryCount++) {
			if(retryCount < maxRetry ) {
				System.out.println("Retest " + retryCount);
			}
			else {
				System.out.println("limit exceed");
			}
			
			
		}
//An API test passes when statusCode == 200 AND responseTime < 2000 AND response body is not null.Convert this into a Java boolean expression.
		
		int statusCode = 200;
		int responseTime = 2500;
		String responseBody = "{\"status\":\"success\"}";	
		Boolean result = statusCode == 200 && responseTime <2000 && responseBody != null;
		System.out.println(result);

//Infant = age <; 2, child = age >= 2 and age <; 12, adult = age >= 12. Which operators and conditions will you se?
	int infant_Age = sc.nextInt();
	int childAge =sc.nextInt();
	int adultAge = sc.nextInt();
	if(infant_Age<2 && childAge >=2 && childAge<12 && adultAge >=12 ) {
		 System.out.println( "Allowed");
		 
	}
	else {
		System.out.println( "age doesn't match");
	}
	
//Displayed amount and charged amount must match for this practice. Which relational operator will you use ?What edge cases would you test?
	int displayedAmount = sc.nextInt();
	int chargedAmount = sc.nextInt();
	int match = displayedAmount -  chargedAmount ;
	if(match==0 ) {
		System.out.println("DisplayedAmount and Charged Amount matches");
		
	}
	else {
		System.out.println("DisplayedAmount and Charged Amount matched by " + match);
		
	}
	
	}
}