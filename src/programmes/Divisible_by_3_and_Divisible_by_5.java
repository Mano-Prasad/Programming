package programmes;

public class Divisible_by_3_and_Divisible_by_5 {

	public static void main(String[] args) {

        int i = 0 ;		
	do {
		if (i %3 == 0) {
			System.out.println("Divible by 3 is : " + i);
			System.out.println();
		}
		
		else if (i%5 ==0) {
			System.out.println("Divisble by 5 is : " + i);
			System.out.println();
		}
		
		i++;
	}
	while(i<=100);
	
	}

}
