package Daywise_classnotes;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collections_Set {

	public static void main(String[] args) {
		//HashSet hs = new HashSet(); //doesnt not allow duplicate values and values not printed in the given order.
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(36);
		hs.add("hello");
		hs.add(10.9);
		hs.add(true);
		hs.add(36);
		hs.add(null);
		System.out.println(hs);
		
		HashSet <String> shs = new HashSet();
		shs.add("hai");
		shs.add("bye");
		shs.add("hello");
		shs.add("java");
		hs.addAll(shs);
		System.out.println(hs);
		hs.remove("hello");
		System.out.println(hs);
		hs.removeAll(shs);
		System.out.println(hs);
	}

}

