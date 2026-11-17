package Daywise_classnotes;

public class Opps_user {
	public static void main(String[]args) {
		
		cal obj = new cal();
		obj.add();
		obj.sub();
		System.out.println(obj.a); // as 'a' is nonstatic we cant call directly by classname we have create object and then we can call.
	//	System.out.println(cal.a); // will get exception, as 'a' is nonstatic we cant call by classname
		System.out.println(cal.c);// static variables we can call by classname.varname
		System.out.println(obj.c); // objectname.clsname should not be allowed for static varilables or methods but in java it allows 
		
	}

}



class cal {
	int a = 45;
	int b = 32;
	static int c = 20;
	
 void add() {
		System.out.println(a+b); // if both variables and methods are non-static we can access the variables directly.
		System.out.println(c);
	}
	
 void mul() {
		System.out.println(a*b);
		
	}
	static void sub() {
		cal c = new cal(); //if variables non-static and method is static we have to create object of the class and then use it.
	System.out.println(c.a - c.b);
		
	}
}