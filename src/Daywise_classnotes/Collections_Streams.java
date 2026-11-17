package Daywise_classnotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections_Streams {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();
		al.add(42);
		al.add("Hello");
		al.add(30);
		
		List<Integer> num = Arrays.asList(10,20,35,87,44,10,20,35,12);
	List<Integer> op=	num.stream()
		.filter(s -> s% 2 == 0) //filters even nums 10,20,44,10,20,12
		.distinct() // removes duplicate values 10,20,44,12
		.map(n->n*n) // multiples each value 10*10, 20*20
		.collect(Collectors.toCollection(ArrayList::new)); // converts streams to ArrayList
		System.out.println(op);
		
	}

}
