package pattern;

public class Pattern_Program_9 {
	
	/* 
	 a
     ab
     abc
     abcd
     abcde
     
     abcde
     abcd
     abc
     ab
     a
	 
	 edcba
     dcba
     cba
     ba
     a

	 */

	public static void main(String[] args) {

		
		for (int i = 1; i <= 5 ; i++) {
			for (char ch = 'a'; ch < 'a'+i;  ch++) {
				System.out.print(ch);
			}
			System.out.println();
		
		}
		
		System.out.println();
		
		for (int i = 5; i >= 1; i--) {
			for (char j = 'a'; j < 'a' + i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		 for (char i = 'e'; i >= 'a'; i--) {
	            for (char j = i; j >= 'a'; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
		
		}
		
		
	}

