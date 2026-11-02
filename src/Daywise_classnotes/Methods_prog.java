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
	
	 // print 1 - 10 numbers without using loops
       static void  print_num (int sp, int ep) {
   
        	 if(sp>ep) {
        		 System.out.println("Sp is greater than ep");
        	 }
        	 
        	 else {
        		 System.out.println(sp);
        		 sp++;
        		 print_num(sp,ep);
        		
        	 }
         
       }
	public static void main(String[]args) {
		System.out.println(fact_num(6));
		int op = power_num(5,4);
		System.out.println(op);
	    print_num(1, 10);
	
		
	}
}
