package programmes;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int end = 100;
		
		for (int start = 1; start <= end; start++) {
		
			boolean isPrime = true;
			for(int i=2; i<=start/2; i++)
			{
				if (start % i == 0) {
					isPrime = false;
					break;		
				}
				
			}

			if (isPrime && start > 1) { 
                System.out.println(start);
            }
			
		}
		
	}

}
