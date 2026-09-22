package Daywise_classnotes;

public class Operators {
	public static void main(String[] args) {
		int a = 5; 
		a++;
		System.out.println(a); // 
		
		a = 5;
		++a;
		System.out.println(a); //
		
		a = 10;
		a--;
		System.out.println(a);  
		
		a = 5;
		int b = a++; // 5+1 = 6 
		System.out.println(a);
		System.out.println(b);
		 
		 a = 5;
		b = ++a; 
		System.out.println(a); 
		System.out.println(b);
		int x = 10;
		int y = x--;
		System.out.println(x);
		System.out.println(y);
		
		 x = 10;
		 y = --x;
		System.out.println(x);
		System.out.println(y);
		
		a = 5;
		 b = a++ + 2;
		System.out.println(a);
		System.out.println(b);
		
		a = 5;
		 b = ++a + 2;
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		 b = 5;
		int  c = a++ + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		 a = 10;
		b = a++ + a++;
		System.out.println(a);
		System.out.println(b);
		
		 a = 10;
		b = ++a + ++a;
		System.out.println(a);
		System.out.println(b);

		x = 5;
		x = ++x + 2;
		System.out.println(x);
		
		a = 10;
		a++;
		++a;
		a--;
		--a;
		System.out.println(a);
		
		
		a = 5;
		b = 10;

		c = a++ + b++ + ++a + ++b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		 x = 5;
		 y = x++ * 2 + ++x;

		System.out.println(x);
		System.out.println(y);

		x = 10;

		int result = x-- - --x + x++;

		System.out.println(x);
		System.out.println(result);

		 a = 1;

		 result = ++a + a++ + ++a;

		System.out.println(a);
		System.out.println(result);

		 x = 3;

		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);

		 a = 5;

		if (a++ == 5) {
		    System.out.println("A");
		}
System.out.println(a);
	
	
	x = 5;

	if (x++ > 5 && ++x > 6) {
	    System.out.println("Yes");
	}

	System.out.println(x);
	
	x = 5;

	if (x++ > 4 || ++x > 6) {
	    System.out.println("Yes");
	}

	System.out.println(x);


	x = 1;

	x++;
	++x;
	x = x++ + ++x;
	x--;
	++x;
	x = --x + x++;

	System.out.println(x);

}}