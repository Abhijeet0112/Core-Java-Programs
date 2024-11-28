package day1;

/* WAP to print pattern 
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * */
public class Pattern2 {

	public static void main(String[] args) {
		int i, j, n=5;
		//for rows
		for(i=1;i<=n;i++) {
			//for columns
			for(j=1;j<=n;j++) {
				System.out.print("*\t");
			}
			//for newline
			System.out.println();
		}

	}

}
