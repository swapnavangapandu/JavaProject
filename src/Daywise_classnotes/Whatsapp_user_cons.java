package Daywise_classnotes;

public class Whatsapp_user_cons {
	
	public static void main(String[]args) {
	Whatsapp u1 = new Whatsapp(123456779l);
	Whatsapp u2 = new Whatsapp(7894788893l);
	//here if we forgot to set_ph method it will default value and multiple objects is created with same data. --to overcome this  will we constructor
//	u1.set_ph(12334587); 
//	u2.set_ph(78112529);

		
	}
	

}



class Whatsapp{
	long ph;
	Whatsapp(long nph){
		ph=nph;
		System.out.println(ph);
		
	}
//	void set_ph(int nph) {
//		ph = nph;
//		System.out.println(ph);
//	}
	
	 void msg() {
		System.out.println("u can msg" + ph);		
	}
	void call() {
		System.out.println("u can call" + ph);		
	}
	
}