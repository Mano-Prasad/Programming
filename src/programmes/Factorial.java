package programmes;

import java.util.Scanner;

public class Factorial {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int factorial = 1;
		
		System.out.print("Enter any number : " );
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial number is : "+ factorial);
	}
}
