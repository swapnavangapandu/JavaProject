package Daywise_classnotes;

public class Methods {

	// Non-static method
  int add (int a , int b) {
		int sum = a+b;
	return sum;
		
	}
 static void sub(int a, int b) {
	 int s = a-b;
	 System.out.println(s);
	 
 }
	
	public static void main(String[]args) {
		Methods m = new Methods(); // For non-static methods/variables we have to create object of class and then call the methods. We can't access the directly.
		System.out.println(m.add(12, 54));
	
		//System.out.println(add(42,54));
		sub(35,52);
	}
}
