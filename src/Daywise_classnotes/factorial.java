package Daywise_classnotes;

public class factorial {
	public static void main (String[]args) {
		/*
		 * //Find factorial of a number //Lets take 7 factorial = 7*6*5*4*3*2*1 int temp
		 * = 1; for (int i=7; i>=2; i--) { temp = temp * i; // System.out.println(i);
		 * 
		 * } System.out.print(temp);
		 */
		 //Reverse a number.
			/*
			 * int num = 7935; // output : 5397 // int revn = 0; while(num>0) { int revn =
			 * num % 10; num = num/10; System.out.print(revn); }
			 */

		//Check palindrome.
		/*
		 * int num = 121 ; // output : A palindrome number is a number that remains the
		 * same when reversed. int revn = 0; int original = num; while(num > 0) { int
		 * lastNum = num % 10; // output 1 num = num / 10 ; revn = revn * 10 + lastNum;
		 * 
		 * }
		 * 
		 * System.out.println(revn); if(revn == original) {
		 * System.out.println("Its Panlindrome");
		 * 
		 * } else { System.out.println("Its not Panlindrome"); }
		 */
	
		/*
		 * //Reverse a String; String str = "swapna"; // anpaws String revstr = ""; for
		 * (int i = 0; i<=str.length()-1; i++) { revstr = str.charAt(i) + revstr; }
		 * System.out.print(revstr);
		 */

	//Count the number digits in a number
	
	int num  = 477876;
	int count = 0;
	while(num>0) {
		
		num = num/10;
		count ++;
	}
	System.out.println(count);
		
		
	
	
	}}

