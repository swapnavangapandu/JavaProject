package Daywise_classnotes;

public class Fabnocci_series {
	public static void main (String[]args) {
		//fabnocci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
		// print numbers 0 - 10
		int a = 0;
		int b = 1;
		int temp = a+b;
		//using while loop
		  while(a <=10) { 
			  // 0+1 = 1 
			  System.out.println(a);
			  temp = a+b; // 0+ 1 = 1
			  a = b; // a = 1 
			  b = temp ; // b = 1 
			  
		  
		  }
		 
		
		//using for loop : as we know starting and ending point we go for loop
		
		for(int i =0; i<10; i++) {
			if(a <= 10) {
				System.out.println(a);
				temp = a+b; // 0+ 1 = 1 
				a = b;     // a = 1
				b = temp ;
			}
		} 
	
		//Print 10 fabnocci numbers
		int num = 10;
		while(num >0) {
			System.out.println(a);
			temp = a + b;
			a = b;
			b = temp;
			num--;
			
		}
	}

}
