package Daywise_classnotes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Collections_Queue {

	public static void main(String[] args) {
		//PriorityQueue pq = new PriorityQueue(); // 1. doesnt allow null values 2. it allows only one type of data 
		ArrayDeque pq = new ArrayDeque(); // 1. allows any type of data  2. Stores data in order
		pq.add(45);
		pq.add(10);
		pq.add(30);
		pq.add(10);
		pq.add("hello");
		//pq.add(null); // NullPOinterException
		//pq.add(45.96); // ClassCastException
		System.out.println(pq);
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(45);
pq.addAll(al);
System.out.println(pq);
pq.retainAll(al);
System.out.println(pq);
	}

}
