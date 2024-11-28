package day1;

/* WAP to print pattern 
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	
*/
public class Pattern4 {

	public static void main(String[] args) {
		int i, j, n=5;
		//for rows
		for(i=1;i<=n;i++) {
			//for columns
			for(j=1;j<=(n-i+1);j++) {
				System.out.print("*\t");
			}
			//for newline
			System.out.println();
		}
	}

}
