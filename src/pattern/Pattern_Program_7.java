package pattern;

public class Pattern_Program_7 {
	
	/*
	  54321
      5432
      543
      54
      5
	 */
	
	
	
public static void main(String[] args) {

	 for (int i = 5; i >= 1; i--) {
         for (int j = 5; j >= i; j--) {
             System.out.print(j);
         }
         System.out.println();
     }
}


}
