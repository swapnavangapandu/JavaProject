package Daywise_classnotes;

public class arrays_1 {
	public static void main(String[]args) {
		//datatype [] var_name = {v1. v2, v3, ...};
		String[] stud_Name = {"Teju", "Raju", "Lehansh", "Aryan", "Kranthi", "Swapna"};
		System.out.println(stud_Name); // will print the address of the array o/p : [Ljava.lang.String;@2b2fa4f7
		//if want print specific/particular value from array
		System.out.println(stud_Name[2]); // output : Lehansh
		//to print all the values in an array , we do it two ways
		for (int i=1; i<stud_Name.length; i++) {
			System.out.println(stud_Name[i]);
		}
		System.out.println("**********************");
		for(String i : stud_Name) {
			System.out.println(i);
			
		}
		
		int[] roll_Num = {1,8,7,78,25,9,74,2,35,64,178,11,8897,714};
		for(int i : roll_Num) {
			System.out.println(i);
		}

}}
