package Daywise_classnotes;

public class Prime_Number {
	public static void main (String[]args) {
		int num = 11;
		boolean is_prime = true;
		if(num <= 1) {
			is_prime = false;
			System.out.println(is_prime);
		}
		
		for(int i=2; i<num/2; i++) {
			if(num % i == 0) {
				is_prime =false;
				//System.out.println("its not prime number");
			}
		}
			if (is_prime ==false) {
					System.out.println(num +  " "+"Its not a prime number");
				}
			else {
				System.out.println(num + " "+ "Its  a prime number");
			}
			
			
			
			
			
			
			}
			}
		
		
		
		
	


