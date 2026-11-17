package Daywise_classnotes;

public class Opps_poly {
	public static void main(String[]args) {
		poly p = new poly();
		p.add(2387989787877l, 51, 9);
		p.add(11, 12);
		p.add(45, 78, 78);
		c2 c = new c2();
		c.msg();
		
	}

}

class poly{  //method overloading - same method name but different arguments
	void add(int a, int b) {
		System.out.println(a+b);
		
	}
	void add(long a , long b, long c) {
		System.out.println("a is :" + a + "b is :" + "c is :" + c);
	}
	void add (int a , int b, int c) {
		System.out.println("a is :" + a + "b is :" + "c is :" + c);
	}
}

class superkeyword{
	int a = 13;
void msg() {
		System.out.println("send text msg");
	}

	
}
class c2 extends superkeyword{
	int a= 32;
	public void msg() {
		System.out.println(a); // o/p : 32
	System.out.println("send text msg and email");
	System.out.println(super.a);
	
}}