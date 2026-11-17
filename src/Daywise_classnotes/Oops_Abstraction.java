package Daywise_classnotes;

public class Oops_Abstraction {
public static void main(String[]args) {
	unimp_methods s = new unimp_methods();
	System.out.println(s.add(45,35,98));
	s.sub(45,15,98);
	s.mod(78,25);
}
}

abstract class Cal{
	abstract int add(int...a);
	abstract void sub(int...a);
	abstract void mul(int...a);
	abstract void div(int...a);
	abstract void mod(int ...a);
	abstract void exp(int...a);
}

abstract class std extends Cal{ // If we have any unimplemented methods in Parent class (Ex:CAl) we have to mention Abstract in class and implement those unimplemnted methods in another class.
      int add(int... a) {
    	  int sum = 0;
    	  for(int i : a) {
    		  sum+=i;
    	  }
		return sum;
		
	}
    void sub(int... a) {
   int  	s = a[0];
    	for(int i=1; i<a.length; i++) {
    		s-=a[i];
    	}
System.out.println(s);
		
	}

	void mul(int... a) {
		int m = 1;
   	  for(int i : a) {
   		  m*=i;
   	  }
	}

	void div(int... a) {
		int d = a[0];
	 	for(int i=1; i<a.length; i++) {
    		d/=a[i];
    	}
	System.out.println(d);	
		
	}
	
}

class unimp_methods extends std{

	void mod(int... a) {
		
			int d = a[0];
		 	for(int i=1; i<a.length; i++) {
	    		d%=a[i];
	    	}
		System.out.println(d);	
		
	}

	void exp(int... a) {
		
		
	}
	
	
	
}