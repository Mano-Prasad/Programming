package programmes;

public class Swapping_Variable_Without_Third_Variable {

	public static void main(String[] args) {
		int a= 7;
		
		int b = 5;

		a = a + b;  // a = 7 + 5 = 12
		
		b = a -b;   // b = 12 - 5 = 7
		
		a = a - b;  // a = 12 - 7 = 5
		
		System.out.println("a variable value is " + a );
		
		System.out.println("b variable value is " + b);
	}
	
	
}
