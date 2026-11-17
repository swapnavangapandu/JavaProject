package Daywise_classnotes;

public class Oops_Encapsulation { //hiding the data

	public static void main(String[] args) {
	bank b = new bank();
	b.get_bal();
	b.set_upipin(7458);
	}

}

class bank {
	private int bal = 45871;
	private int upipin = 1254;
	
	void get_bal() {
		System.out.println(bal);
	}
	void set_upipin(int upipin) {
		this.upipin = upipin;
		System.out.println(upipin);
		
	}
	
}