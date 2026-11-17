package Daywise_Assignment;

public class Day7 {

	public static void main(String[] args) {
		cardPayment card = new cardPayment();
		card.pay();
		card.refund();
		upiPayment upi = new upiPayment();
		upi.pay();
		upi.refund();
		

	}

}
//Design a PaymentGateway interface with pay() and refund(). Create CardPayment and UpiPayment implementations.
interface PaymentGateway {
	
 void pay();
 void refund();	
}

class cardPayment implements PaymentGateway {
      public void pay() {
		System.out.println("Pay using credit/debit card");
		
	}
      public void refund() {
		System.out.println("Refund initiated to credit/debit card");
		
	}	
}
	
class upiPayment implements PaymentGateway {
         public void pay() {
			System.out.println("Pay using Upi");
			
		}
         public void refund() {
			System.out.println("refund to upi account");
			
		}}


//Create an abstract TestReporter with write() and common header logic. Implement HtmlReporter and JsonReporter.
abstract class TestReporter{
	abstract void write ();
	
}





//Create a SearchStrategy interface for WebSearch and ApiSearch. Use one service method to execute either strategy.

interface SearchStrategy{
	void Websearch();
	void ApiSearch();
}

class Search{
	void serviceMethod() {
		
	}
}


//Write examples showing overloading vs overriding and annotate why the binding time differs.



