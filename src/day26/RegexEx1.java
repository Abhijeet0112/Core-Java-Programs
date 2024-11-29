package day26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		Pattern pattern= Pattern.compile("Hello");
		Matcher match= pattern.matcher("Hello");
		System.out.println(match.matches());
		
		System.out.println(Pattern.matches("Hello", "HellO"));

		System.out.println("Regex = .b-> "+Pattern.matches(".b", "bb"));
		System.out.println("Regex = .b-> "+Pattern.matches(".b", "mb"));
		System.out.println("Regex = .b-> "+Pattern.matches(".b", "kmt"));
		System.out.println("Regex = .b-> "+Pattern.matches(".b", "pmpml"));
		
		//Character Regex - here one character is checked 

		System.out.println("Regex = [abc]-> "+Pattern.matches("[abc]", "b"));
		System.out.println("Regex = [abc]-> "+Pattern.matches("[abc]", "bb"));
		System.out.println("Regex = [^abc]-> "+Pattern.matches("[^abc]", "b"));
		System.out.println("Regex = [^abc]-> "+Pattern.matches("[^abc]", "d"));
		System.out.println("Regex = [a-z]-> "+Pattern.matches("[a-z]", "A"));
		System.out.println("Regex = [a-z A-Z 0-9]-> "+Pattern.matches("[a-z A-Z 0-9]", "9"));
		System.out.println("Regex = [_-]-> "+Pattern.matches("[_-]", "-"));
		
		//Quantifiers
		
		
		System.out.println("Regex = [abc]?-> "+Pattern.matches("[abc]?", "a")); //X?= X occurs once or not at all
		System.out.println("Regex = [abc]+-> "+Pattern.matches("[abc]+", "aacababcbc")); //X+= X occurs once or more times
		System.out.println("Regex = [abc]{3}-> "+Pattern.matches("[abc]{3}", "aab")); //X{n}= X occurs n times only
		
		//Meta Character
		System.out.println("Regex = \\d-> "+Pattern.matches("\\d", "9"));//\\d:Any digits, short of [0-9]
		System.out.println("Regex = \\d-> "+Pattern.matches("\\d", "9345"));
		System.out.println("Regex = \\d+-> "+Pattern.matches("\\d+", "9993451233214331"));
		
		
		
		
		
	}

}
