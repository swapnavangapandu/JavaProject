package Daywise_classnotes;

public class Array_programs {
	public static void main (String[]args) {
		
 //print even index values 
		int [] num = {75,96,11,32,45,61,28};
		System.out.println("Even index numbers : ");
		for(int i=0; i<num.length; i++) { 
			if(i % 2 == 0) { 
				
				System.out.print(num[i] + " ");
				
				} }
		System.out.println();
		//count even numbers
		int count = 0;
		for(int i : num) {
			if(i%2==0) {
				count++;
			}
			
		}
		System.out.println("Count of even numbers : " +count);
		//count odd numbers
		int count1 = 0;
		for(int i : num) {
			if(!(i%2==0)) {
				count1++;
			}
			
		}
		System.out.println("Count of odd number : " +count1);
//print odd index values
		  int [] num1 = {75,96,11,33,45,61,28}; 
		  System.out.println("odd index numbers : ");
		  for(int i=0; i<num1.length; i++) {
			  if(!(i % 2 == 0)) {
				  System.out.println(num1[i]+ "/t"); 
				  } }
		 

//Print array in reverse order
	
	int[] value = {45,2,3,11,55,6,76};
	System.out.println("Array reverse numbers : ");
	for(int i=value.length-1; i>=0; i--) {
		System.out.print(value[i] + " ");		
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
	int largest = value[0]; //45
	for(int i : value) {
	if(i > largest) {
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
	int elem = 32;
	for (int i =0; i<num.length; i++) {
	
		if(num[i]==elem) {	
			System.out.println("Element "+ elem + " "  +" is  found at index" + i);
	}	
		
	}
			
//Print the first occurrence of an element
	
	 int [] arr = {10, 30, 50, 40, 10, 40, 60}; 
		int search = 10;
		
		for(int i=0; i<arr.length ; i++) {
			if (arr[i] == search) {
				System.out.println("The first occurence of element " + search + " is at index " + i );
				break;
				
			}
		
		}
	
		
//Print the last occurence of an element; 
		int ele = 40; 
		int index  = -1;
		for(int i=0; i<arr.length ; i++) {
			if (arr[i] == ele) {
			
		index = 	i;
			}
			
			
		}
		System.out.println("The last occurence of element " + ele + " is at index " + index );
		
		
//Swap first and last elements
		int[] arr1 = {10, 20, 30, 40, 50};
		System.out.print("Original Array : ");
		 for(int i = 0; i<arr1.length; i++) {
			 System.out.print(arr1[i] + " ");
		 }
		
		 System.out.println();
		
		int  temp = arr1[0];
		arr1[0] = arr1 [arr1.length-1];
		 arr1 [arr1.length-1] = temp;
		 System.out.print("After Swapping first and last numbers Array : ");
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			
		}
		System.out.println();
		
//Move all zeros to the end
	 int[] a = {0, 1, 0, 3, 12}; // 1, 3, 12, 0, 0
	 int nz;
	 int z;
	 

//Given String is palindrome	 
String s  = "mom";
String rv = "";
for(int i=s.length()-1 ; i>=0; i--) {
	rv+= s.charAt(i);
}
System.out.println(rv);
if(rv.equals(s)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}


//Reverse a Sentence
String S = "hello I am Java";
String rs = "";

for(int i=S.length()-1; i>=0; i--) {
	rs+=S.charAt(i); // rs = rs+S.charAt(i)
}
 System.out.println(rs);

 
 //Reverse words  
String[] words =  S.split(" "); // split word by space
String rw = "";
for(String word : words) {
	for(int i=word.length()-1; i>=0; i--) {
        rw+= word.charAt(i);
  
	}	
  rw+=" "; 
}
System.out.println(rw);

	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


