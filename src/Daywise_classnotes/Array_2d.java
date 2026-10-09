package Daywise_classnotes;

public class Array_2d {
	public static void main (String[]args) {
		// occupies more m/m spaces as it is created separate array list each time to overcome we use 2d array
		int[] s = {7,78,96,2};
		double[] s1 = {2.5,88,7,9};
		int []s2 = {6,7,11,5};
		int []s3 = {66,81,25,999};
		
		// 2d array
		int [][] num =  {
				{7,78,96,2},  {2,88,7,9}, {6,7,11,5}, {66,81,25,999} };
		
				
		for (int i =0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
			}
			
	}

}
