package Daywise_Assignment;

public class Day5 {

	public static void main (String[]args) {
		Customer c = new Customer(2, 1000, "swapna", "swapna@gmail.com");
	           c.display();
	    BrowserSession bs = new BrowserSession("Chrome", "vs450", "Dev");
         bs.printSessionKey();
		TestCase tc = new TestCase(101, "Login", "High", "Ready");
		System.out.println(tc.TestExecution());
		employee emp = new employee();
		emp.empId= 11;
		emp.empName="test";
		emp.salary=117791;
		
		employee emp1 = new employee();
		emp1.empId= 9;
		emp1.empName="newuser";
		emp1.salary=45555.5;
		
    emp.emp_Details();
    emp1.emp_Details();
    
	
}
}
//Create a Customer class with id, name, email and balance. Add constructor + display method.

class Customer{
	int id, balance;
	String name, email;
	Customer(int id, int balance, String name, String email){
		this.id = id;
		this.balance=balance;
		this.name= name;
		this.email= email;
			
	}
	
	void display() {
		System.out.println("Customerid :" + id + " Balance: " + balance + "name: " + name + " Email: " + email);
	}
}

//2. Create a BrowserSession class with browser, version and environment. Add a method that prints a session key.

class BrowserSession{
	 String version, browser, Environment;
	 BrowserSession(String browser ,String version,String Environment){
		 this.version= version;
		 this.browser=browser;
		 this.Environment=Environment;
	 }
	void printSessionKey() {
		String sessionKey = browser + "_" + version + "_" + Environment ;
		System.out.println(sessionKey);
	}

	
}

//Build a TestCase class with testId, title, priority and status. Add a method that returns whether execution is allowed.

class TestCase{
int testId;
String title, priority, Status;

TestCase(int testId, String title, String priority, String Status ){
	this.testId=testId;
	this.title=title;
	this.priority=priority;
	this.Status=Status;
}

String TestExecution() {
	if(testId > 0 &&
			title!=null && !title.isEmpty() && priority.equalsIgnoreCase("High") || priority.equalsIgnoreCase("Medium") || priority.equalsIgnoreCase("Low")
			&& Status.equalsIgnoreCase("Ready")) {
		return "Exceution allowed";
	}
	
	return "Exceution Not allowed";
}}

//Create two objects with different data and explain why instance variables are not shared between them.

class employee{
	int empId;
	String empName;
	double salary;
	void emp_Details() {	
		System.out.println("EmployeeId : " + empId + " " + "EmployeeName: " + empName + " " + "Salary : " + salary );
	}
}



