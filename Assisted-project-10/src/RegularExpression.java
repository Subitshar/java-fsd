
import java.util.regex.*;

public class RegularExpression {
	public static void main(String args[]) {
		String Str="[a-z]+";
		String Str1="Hello world";
		Pattern p=Pattern.compile(Str);
		Matcher m=p.matcher(Str1);
		
		while(m.find()) {
			System.out.println(Str1.substring(m.start(),m.end()));
		}
		
	}
}
