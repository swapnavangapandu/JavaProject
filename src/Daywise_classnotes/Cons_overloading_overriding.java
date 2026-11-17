package Daywise_classnotes;

public class Cons_overloading_overriding {
	
	public static void main(String[]args) {
		WV1 v1= new WV1(12345567787l);
		System.out.println(v1.ph);
	WV1 v2 = new WV1(12, 25);
	//WV1 v3 = new WV1("hello");
	cons2 con = new cons2();
	
	

	}

}

 class WV1{
	 long ph; // global 
	WV1 (long ph){
		this.ph = ph ; // local.  // local and global variable name should be same in constrcutor.
		
	}
	WV1(int a , int b){
		this("hello"); // to call another constructor which is in same class
		System.out.println(a*b);
		
	}
	WV1 (String str){
		
		System.out.println(str);
	}
}
 
 class cons1{
	 int a, b;
	 
	 cons1(int a , int b){
		 this.a=a;
		 this.b=b;
		 
		 System.out.println("cons1");
		 }
		 
		 
	 }
 
	 class cons2 extends cons1{
		
		 cons2(){
			 super(1,2); // to call constructor available in another class.
			 System.out.println(super.a + super.b);
			 System.out.println("cons2"); 
	 }
	 }
 class cons3 extends cons2{
	 cons3(){
		 System.out.println("cons3"); 
		 
	 }
 }