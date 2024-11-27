package pattern;

public class Star {

	public static void main(String[] args) {
		for(int i=0; i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j>i) {
					System.out.print(" ");
				}
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
