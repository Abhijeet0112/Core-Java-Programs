package day1;

/* WAP to print pattern 
         *
       * *
     * * *
   * * * *
 * * * * *
 */
public class Pattern5 {

	public static void main(String[] args) {
		int i, j, n=5, sp;
		//for rows
		for(i=1;i<=n;i++) {
			//spaces
			for(sp=1;sp<=(n-i);sp++) {
				System.out.print("  ");
			}
			//for columns
			for(j=1;j<=i;j++) {
				System.out.print(" *");
			}
			//for newline
			System.out.println();
		}
	}

}
