package Daywise_classnotes;

public class Oops_interface {
public static void main(String[]args) {
	demo d = new demo();
d.add(20, 12);
d.sub(48, 41);
	
}
}

interface B1{
	int a = 45; // in interface once declared it is consider as final.
	void add(int a,int b);

}

interface C1 extends B1{ // interface - interface --> Extends keyword
	void sub(int a ,int b);
}

class demo implements C1{  //in java 

	
	 public void add(int a, int b) {
		 System.out.println(a+b);
		
		
	}

	 public void sub(int a, int b) {
		 System.out.println(a-b);
		
	}
	
	
	
}