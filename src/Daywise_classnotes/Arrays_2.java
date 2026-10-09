package Daywise_classnotes;

public class Arrays_2 {
	public static void main (String[]args) {
		//creating array first and adding the values later
		//datatype [] var_name = new datatype[size];
		String [] emp_Name = new String[8];
// adding the value 
		//var_name[index_num] = value;
	emp_Name[0] = "santhu";
	emp_Name[1] ="Josh";
	emp_Name[5] = "Saen";
		for(int i = 1 ; i<emp_Name.length; i++) {
			System.out.println(emp_Name[i]);
		}
		
		System.out.println("**************************");
		for(String i : emp_Name) {
			if(!(i== null))
			System.out.println(i);
		}
		
		//get the square of a number
		
		int[] num = new int[10];
		for (int i = 1; i<num.length ; i++) {
			num[i] = i * i;
			System.out.println(num[i]);
		}
		
	}

}
