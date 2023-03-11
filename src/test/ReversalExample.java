package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Nitin";
		
		String result = "";
		for (int i=str.length()-1;i>=0;i--) {

			
			 result = result + str.charAt(i);
			 
		
		}
		System.out.println("Reversed String is " + result);
if(str.equalsIgnoreCase(result)) {
	
	System.out.println("The given string is palindrome");
}else {
	System.out.println(" The given string is not palindrome");
}
		


String str2 = "David meets John and Lilly";

String[]arr = str2.split(" ");
String result1= "" ;

for (int i=arr.length-1;i>=0;i--) {
	result1=result1+arr[i]+ " ";
}
System.out.println("The result is " + result1.trim());

	}

}
