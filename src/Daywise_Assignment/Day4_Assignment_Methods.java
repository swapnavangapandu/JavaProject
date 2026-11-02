package Daywise_Assignment;

public class Day4_Assignment_Methods {
	
	public static void main(String[]args) {
		System.out.println(bank_tran(500, 3500, 1000, true));

		
	}

//Create validateTransaction(amount, balance, dailyLimit, accountStatus) returning PASS / REJECT with clear reasons.

	public static String bank_tran(double amount, double balance, int dailyLimit, boolean accountStatus) {
		if(amount <=0) {
			return "Reject : amount should be greater than 0" ;
		}
		if(amount > balance) {
			return "Reject : Insuffiecient Balance" ;
		}
		
		if(!accountStatus) {
			return "Reject : Account is not active " ;
			
		}
		if(amount >dailyLimit ) {
			return "Reject : Limit exceeded " ;
			}
		return "Pass : Transcation Approved";
			
	}
	
	
//Create overloaded calculateDiscount() methods for percentage, flat amount, and coupon-based input.
	public void cal_Dis(double percentage, double amount, int coupon) {
		
		
	}
//Create reusable methods isStatusCodeValid(), hasField(), isResponseTimeAcceptable() and compose a final result.	
	public void api_Res(int isStatusCodeValid, String hasField, boolean isResponseTimeAcceptable) {
		
	}
	
//Create shouldRetry(attempt, maxAttempts, errorType) and test timeout, credential failure, and server error cases.
}

//Create methods to normalize usernames, trim fields, generate unique emails, and build readable test IDs.

//Create calculateTax(), calculateGrandTotal(), and isAmountWithinTolerance().

//Create hasAccess(role, action) using conditions and reusable helper methods.

//Create methods to check file existence, validate file extension, and return a simple result object/status string.

//Create methods to validate count, expected text, sorting order, and mandatory fields.

//Create a Utility class with 8-10 static methods and a separate Demo/Test class that uses the utilities.