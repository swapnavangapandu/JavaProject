package Daywise_Assignment;

public class Day6 {

	public static void main(String[] args) {
		/*Account a = new Account();
		a.Account = true;
		a.depoAmount=1150;
		a.getbal();
		System.out.println(a.display_deposit());
		a.Account= true;
		a.WithdrawalAmount=1000;
		//a.Withdrawal();
		System.out.println(a.Withdrawal()); 
		
		AdminLoginPage admin = new AdminLoginPage();
		admin.launch_browser("Firefox");
		admin.username("test");
		admin.password("1234546");
		admin.login();
		admin.adminPage(); */
		
		WebTest wb = new WebTest();
		wb.setUp("https://www.google.com", "QA");
		wb.duration("30");
		wb.browser_Data("Chrome", "vs101");
		
		
		
		
		
		
	}
}

//Create an Account class with private balance. Allow deposits and withdrawals only when business rules are satisfied.

class Account{
	private double balance = 7000.56;
	double depoAmount;
	boolean Account;
	double WithdrawalAmount;
	public void getbal() {
		System.out.println("AvlBalance : " + balance);
	}
	String display_deposit() {
		//this.balance = balance;
		if(Account!=false && depoAmount > 0 ) {
			double finalAmount  =  balance + depoAmount ;
			System.out.println("Final Amount : " + finalAmount);
			return "deposit accepted";
			
		}
		
		return "deposit rejected";
		
	}
	
	String  Withdrawal () {
		if(Account!=false && WithdrawalAmount > 0 && WithdrawalAmount<= balance ) {
			double balAftrwithdrawal  =  balance - WithdrawalAmount ;
			System.out.println("Balance After Withrdrawal :" + balAftrwithdrawal);
			return "Withdrawal done";
		}
		return "Withdrawal not accepted";
		}
}


//Create BasePage -> LoginPage -> AdminLoginPage and identify which methods are inherited.
class BasePage{
	void launch_browser(String browser ) {
		System.out.println("Browser : " + browser);
	}
}

class LoginPage extends BasePage{
	void username(String username) {
		System.out.println("Username : " + username);
		
	}
	void password(String Password) {
		System.out.println("Password : " + Password);
		
	}
	void login() {
		System.out.println("Click Login button ");
		
	}
}
class AdminLoginPage extends LoginPage{
	void adminPage() {
	System.out.println("Admin Login Successfully");
	
}
}
//Create BaseTest with common setup values and a WebTest child that adds browser-specific data.
class BaseTest{
	void setUp(String url, String environment) {
		System.out.println("Url : " + url + " "  + "Environment : " + environment );	
	}
	void duration(String timeout) {
		System.out.println("Timeout : " + timeout + " seconds");
		
	}
}
class WebTest extends BaseTest{
	void browser_Data(String browserName, String version) {
		System.out.println("BrowserName : " + browserName + " "+ "Version " + version);
		
	}
	
}


//Add validation to setters for username, timeout and environment name.
class setters{
	private String username;
	private int timeOut;
	private String environmentName;
	
	
	public void set_userName(String username ) {
		this.username=username;
		if(username==null || username.isEmpty()) {
			System.out.println("Invalid Username");
			
		}
		else {
			System.out.println("Username : " + username );
		}
		
	}
	public void set_time(int timeOut) {
		if(timeOut<=0) {
			System.out.println("Invalid Timeout");
		}
		else {
			this.timeOut=timeOut;
	System.out.println("Timeout : " + timeOut + " seconds");
	}}
	
	public void set_env_name(String environmentName) {
		if (environmentName == null) {
            System.out.println("Invalid environment!");
        } else if (
            environmentName.equalsIgnoreCase("QA") ||
            environmentName.equalsIgnoreCase("UAT") ||
            environmentName.equalsIgnoreCase("PROD"))
		System.out.println("EnvironmentName : " + environmentName);
	}
}

