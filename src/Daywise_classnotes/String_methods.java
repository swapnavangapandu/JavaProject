package Daywise_classnotes;

public class String_methods {

	public static void main(String[] args) {
		String str = "hello i am java";
		String rstr = " ";
		for(int i=str.length()-1; i>=0; i--) {
			rstr+=str.charAt(i);
		}
System.out.print(rstr);
	}

}
