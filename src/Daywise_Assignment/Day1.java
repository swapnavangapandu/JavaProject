package Daywise_Assignment;

public class Day1 {

	public static void main(String[] args) {
		//What is the output?
				int a=10, b=3;
				System.out.println(a/b); // output : 3
				System.out.println(a%b); // output : 1
			//Find x, y and z:
				int x=5;  // 5+1 = 6 +1 = 7
				int y=x++; // output : 5
				int z=++x; // output : 7
			//What is d?
				double d = 10 / 4; // output : 2.5
				
				// Fix:
				float price = 99.99F; // output : 99.99f
				
				//Predict:
				a=10; // 10+1 = 11 +1 =12 
				System.out.println(a++ + ++a); // output : 10 + 12 = 22
				
				//Write a program using ?: to print PASS/FAIL.
				
				//Build a salary calculator:
				int basic = 50000;
				int bonus = 5000;
				double tax = 0.1;
				// gross = basic + bonus 
						int gross = 55000;
						
				//print gross, tax and net salary.
						System.out.println(gross);
						//tax = 10% of gross;
					double 	Tax = tax * gross;
						System.out.println(Tax);
						//Net = Gross -Tax
						double Net = gross - Tax;
						System.out.println(Net);
						
						
						
	}

}