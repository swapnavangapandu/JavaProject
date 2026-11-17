package Daywise_classnotes;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_List {
	public static void main(String[]args) {
		int[] a = {10,15,11};
		ArrayList al = new ArrayList(); // allows any datatype
		al.add(25);
		al.add("hello");
		al.add(7821.00);
		al.add(12398409l);
		al.add(a); //prints the address of the array
		System.out.println(al); //op:[25, hello, 7821.0, 12398409, [I@2b2fa4f7]
		al.add(2, 45); //add value(45) at index 2
		System.out.println(al); //op:[25, hello, 45, 7821.0, 12398409, [I@2b2fa4f7]
		al.remove(a); //removes array
		System.out.println(al);
	
		
		
		ArrayList<Integer> ia = new ArrayList<>(); //allows only int datatype. If we want to add only one data type use this. In place of integer you can mention String, long, etc
	ia.add(10);
	ia.add(48);
	ia.add(3);
	ia.add(37);
	al.addAll(ia);
	System.out.println(al); // [25, hello, 45, 7821.0, 12398409, 10, 48, 3, 37]
	
	//al.removeAll(ia);
	al.add(ia); //[25, hello, 45, 7821.0, 12398409, [10, 48, 3, 37]]
	al.addAll(2, ia); // [25, hello, 10, 48, 3, 37, 45, 7821.0, 12398409] // adds ia values at index2
	System.out.println(al); 
	al.remove(0); // IndexOutofBounds exception , we cannot give value to remove interger we have to give only index of the integer
	System.out.println(al);
	//ia.removeAll(al);
	//Collections.sort(al); // Classcastexception .. we can't sort different type of data
	Collections.sort(ia);
	System.out.println(ia);
	}
	
	

}
