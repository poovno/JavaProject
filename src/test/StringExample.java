package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String name = "Shivam";
		String name1 = "John ";
		
		System.out.println("Num of chars in first string is "+ name .length());
		
		System.out.println("the last char of the string is "+ name1.charAt(name1.length()-1));
		System.out.println("The string in upper case is "+ name1.toUpperCase());
		System.out.println("The string in Lower case is "+ name1.toLowerCase());
	}

}
