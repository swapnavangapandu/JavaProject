package Daywise_classnotes;

public class Switch_Case {
	public static void main(String[]args) {
		int a = 48;
		int b = 20;
		String op = "div";
		switch(op) {
		case "add" :
			System.out.println(a+b);
			break;
		
		case "sub":
			System.out.println(a-b);
			break;
		
	case "mul":
		System.out.println(a*b);
		break;
	case "div":
		System.out.println(a/b);
		break;
	}
	}

}
