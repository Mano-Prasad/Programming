package programmes;

public class Odd_or_Even {


	public static void main(String[] args) {
		int i=0;
		
		do {
			if (i %2 == 0) {
				System.out.println("Even number is :" + i );
			}
			
			else if(i %2 ==1 ){
				System.out.println(" Odd number is :" + i );
			}
			 i++;
		}
		while(i <=50);
	}
}
