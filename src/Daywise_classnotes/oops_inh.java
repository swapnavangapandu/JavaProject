package Daywise_classnotes;

public class oops_inh {
	public static void main (String[]args) {
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.b);
		c.Addition();
		D d = new D();
		d.sub();
		user u = new user();
		u.prn();
	}
}
	class A{
		int a = 45;
	}
	class B extends A{    //single level inh
		int b = 20;
	
	}
	class C extends B{ // Multilevel inh (C is getting the prop of B and B is getting the prop of A
		void Addition() {
			System.out.println(a+b);
			
		}
	}
	
	
	class D extends A{
			int C = 40;
			void sub() {
				System.out.println(a-C);
			}
	}
			class E extends A { // hierarichal inh (class D, E is getting the prop of class A)
				int c = 20;
				public void mul() {
					System.out.println(a*c);
			}
			
		}
		
		
			interface A1{
				String s = "hello";
			}
	
			interface A2{
				String s1 = "how r u";
			}
	class user implements A1, A2{ // Multiple inh (one class using the properties of two parent classes
	  void prn() {
		  System.out.println(s + s1);
	  }
	}


