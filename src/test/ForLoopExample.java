package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int num=1;num<11;num++) {
			
			System.out.println(num);
		}
		
		System.out.println("End of for loop");
		
		for(int num1=10;num1>0;num1-=2) {
			
			System.out.println(num1);
			
		}
		System.out.println("End of second for loop");
		
		int[] arr1 = {2,3,4,5,8,9};
		
		for (int i=0;i<arr1.length;i++) {
			System.out.println("Element value is " +arr1[i]);
		
		}

		for (int val:arr1) {
			System.out.println("Value is " + val);
		
		}
		String str1 ="John from USA";
		for (int i=0;i<str1.length();i++) {
			System.out.println("Char value is " + str1.charAt(i));
		}

	
	}
	
	

}

