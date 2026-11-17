package Daywise_classnotes;

public class Methods_prog {
	
	//factorial of a num
	public static int fact_num(int num) {
		int fact = 1;
		for(int i =num; i>1; i--) {
			fact*= i; // fact = fact * i 
			
		}
	    return fact;				
	}

	//power of a number
	public static int power_num (int num, int power) {
		int p = 1;
		for (int i=1; i<=power; i++) {
			p*= num; // p = p*num
		}
		
		return p;
	}
	

	public static void main(String[]args) {
		System.out.println(fact_num(6));
		int op = power_num(5,4);
		System.out.println(op);
	   
	
		
	}
}
