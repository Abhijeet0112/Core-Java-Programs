package day1;

/* WAP to print pattern 
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 * */
public class Pattern1 {

	public static void main(String[] args) {
		int i, j, n=5;
		//for rows
		for(i=1;i<=n;i++) {
			//for columns
			for(j=1;j<=n;j++) {
				System.out.print(i+"\t");
			}
			//for newline
			System.out.println();
		}

	}

}
