package Daywise_classnotes;

public class Array_3d {
	public static void main(String[]args) {
		int[][][] num = new int [2][2][2];
		num[0][0][0] = 25;
		num[0][0][1]  = 10;
		num[0][1][0] = 64;
		num[0][1][1] = 13;
		num[1][0][0] = 9;
		num[1][1][0] = 8;
		for(int i[][]: num) {
			for(int j[] : i) {
				for(int k : j) {
					System.out.println(k);
				}
			}
			
		}

			
		
		
		
		
		}
	}


