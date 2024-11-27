package day1;

/* WAP to print pattern 
* * * * *
  * * * *
    * * *
      * *
        *
 */
public class Pattern7 {

	public static void main(String[] args) {
		int rows = 5; // Number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
	}

}
