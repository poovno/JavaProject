package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =3;
		boolean flag = true;
		for (int i=2;i<=num/2;i++) {
			int rem = num%i;
			if(rem==0) {
				
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Num is prime num");
		}else {
			System.out.println("Num is not a prime number");
		}
		
		
		
	}

}
