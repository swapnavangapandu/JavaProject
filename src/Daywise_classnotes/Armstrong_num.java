package Daywise_classnotes;

public class Armstrong_num {
	//Armstrong - power of a number is multiplied to each digit. ex: 153 ; 1*3 + 5 * 3 + 3 * 3 = 153
	
	public static void main (String[]args) {
	
		//step 1: Get the count of a number
	int num = 370;  
    int count = 0;
    int temp = num;
while(temp>0) {
	temp = temp/10;
	count ++;
}
	System.out.println("Count : " + count);	
	
// Step 2 : reverse the number and power 
	int ov = 0;
	int temp1 = num;
	
	 while(temp1>0) {
		 int l = temp1 % 10;
			temp1 = temp1 /10 ;
			 int  p = 1;
	 for (int i = 1; i <= count; i++) {
		 p = p * l;
	 }
	 ov = ov + p;
	}
// Compare two numbers	
	if (ov == num) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not Armstrong");
	}

}}
