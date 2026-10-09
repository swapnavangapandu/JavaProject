package Daywise_classnotes;

public class Array_programs {
	public static void main (String[]args) {
		
 //print even index values 
		int [] num = {75,96,11,32,45,61,28};
		for(int i=0; i<num.length; i++) { 
			if(i % 2 == 0) { 
				System.out.println(num[i]);
				} }
		//count even numbers
		int count = 0;
		for(int i : num) {
			if(i%2==0) {
				count++;
			}
			
		}
		System.out.println("Count : " +count);
		//count odd numbers
		int count1 = 0;
		for(int i : num) {
			if(!(i%2==0)) {
				count1++;
			}
			
		}
		System.out.println("Count : " +count1);
//print odd index values
		  int [] num1 = {75,96,11,33,45,61,28}; 
		  for(int i=0; i<num1.length; i++) {
			  if(!(i % 2 == 0)) {
				  System.out.println(num1[i]); 
				  } }
		 

//Print array in reverse order
	
	int[] value = {45,2,3,11,55,6,76};
	for(int i=value.length-1; i>=0; i--) {
		System.out.println(value[i]);		
	}
	
//Find the sum of all elements
	int sum = 0;
	for(int i : value) {
		sum = i + sum ;
	}
	System.out.println("Sum of all the numbers is " + sum);
//print the average of number
	int avg = sum/value.length;
	System.out.println("Average : " + avg);
	
	
//Find the largest element	
	int largest = 0;
	for(int i : value) {
	if(i>largest) {
		largest =  i;
		
	}
	}
	System.out.println("Largest number in an array is :" + largest);
	
//Find the smallest element	
	int smallest = num[0];
	for(int i : num) {
		if(i<smallest) {
			 smallest = i;		
		}
		
	}
	System.out.println("smallest number in an array is :" + smallest);
	
	
//Count negative numbers
	int[] numb = {4, -15,7,35,-6,-9,3,-8,-5};
	int count11 = 0;
	for(int i : numb) {
		if(i<0) {
			count11++;
			System.out.println(i);
			
		}
		
	}
	System.out.println("Negative Numbers Count :" +count11);
	
	//Count positive Numbers
	int count2 = 0;
	for(int i : numb) {
		if(i>0) {
			System.out.println(i);
			count2++;
		}
	}
	System.out.println("Positive Numbers Count :" + count2);
	
//Search for an element and print the index of that element
	for (int i =0; i<num.length; i++) {
		if(num[i]==61) {
			System.out.println("Element found");
			System.out.println(i);
		}	
	}
	 
	
	
	
	
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


