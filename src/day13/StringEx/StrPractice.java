package day13.StringEx;

public class StrPractice {

	public static void main(String[] args) {
		String s1 = "Hello ";
		String s4 = "hello ";
		String s2 = "World";
		String s3 =new String ("Hello");
		System.out.println("S1=S2-> "+s1==s2);
		System.out.println("S1=S3-> "+s1==s3);
		System.out.println("S2=S3-> "+s2==s3);
		String message = "Today I am Learning JAVA String";
		char alp = message.charAt(15);
		System.out.println("Alphabet at index position 15 is : "+alp);
		int indxno = message.length();
		System.out.println("Lenth of the String : "+indxno);
		System.out.println("Last index position is : "+message.charAt(indxno-1));
		String s= s1.concat(s2).concat(" I am Abhijeet");
		System.out.println(s);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		String email="abhijeet1@gmail.com";
		System.out.println(email.contains("@gmail"));
		System.out.println("Find the index number of n char : "+message.lastIndexOf("n"));
		System.out.println("Comparing s1 with s4 : "+s1.compareTo(s4));// jo pahila charactor wrong milel tyacha no te ASCII value sobt compaie karun return karte
		System.out.println("Comparing s1 with s4 : "+s1.compareToIgnoreCase(s3));
		System.out.println("Is Empty or not : "+s1.isEmpty());
		System.out.println("Is Blank or not : "+s1.isBlank());
		String part = message.substring(11, 15);
		System.out.println("SubString is : "+part);
		String newPart = message.substring(20);
		System.out.println("New SubString : "+newPart);
		
		String replaceString =message.replace("a", "@");
		System.out.println("After Replace new String : "+replaceString);
		String replaceStringAll =message.replaceAll("JAVA", "Python");
		System.out.println("After Replace new String : "+replaceStringAll);
		System.out.println("Uppercase : "+message.toUpperCase());
		System.out.println("Lowercase : "+message.toLowerCase());
		System.out.println(message.toCharArray());
	}


}
