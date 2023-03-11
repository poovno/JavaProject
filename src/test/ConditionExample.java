package test;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age ;

Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the Age ");
 
 age = scanner.nextInt();
 
if(age<17) {
	System.out.println("you are not eligible for voting");
}else if(age == 17){
	
	System.out.println(" Sorry!!! you are eligible from next year onwards ");	
		
	}
else {
	System.out.println("you are eligible for voting");
}

scanner.close();
}

}
