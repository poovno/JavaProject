package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr1 = {10,20,30,40,50 };
		System.out.println("Length of the array is "+ arr1.length);
		System.out.println("First value inside the array is " +arr1[0]);
		System.out.println("First value inside the array is " +arr1[arr1.length-1]);
 String [] arr2 = {"Mon","Tue","Wed","Thu","Fri"};
 System.out.println("Value at third position is " +arr2[2] );
 System.out.println("Value at third position is " +arr2[arr2.length-1] );
 
 
 String str = "Clean world green World happy world";
 String[] arr3 = str.split(" ");
 System.out.println("Total no of words inside the string is " + arr3.length );
	}
}
