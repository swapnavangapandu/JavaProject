package Daywise_classnotes;

public class Method_recur {
	
	static void print_num(int sp, int ep) {	
		if(sp>ep) {
			System.out.println("done");
			
		}
		else {
			System.out.println(sp);
		sp++;
			print_num(sp, ep);		
		}
		
	}
		static void disp(String msg, int count) {
			if(count>0) {
			System.out.println(msg);
			count--;
			disp(msg, count);
			
		}}
		
	
	public static void main(String[]args) {
		print_num(1, 10);
		disp("hello", 5);
		//String[] s={"hello, hi"};
		//main(s); // Will get StackOverflow exception 
		
		
	}

}
