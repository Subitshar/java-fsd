import java.util.ArrayList;
import java.util.Scanner;
public class ValidationEmail {

	public static void main(String[] args) {
		ArrayList <String> email=new ArrayList <String>();
		email.add("xyz@gmail.com");
		email.add("abc@gmail.com");
		email.add("def@gmail.com");
		email.add("ghi@gmail.com");
		email.add("jkl@gmail.com");
		email.add("mno@gmail.com");
		email.add("pqr@gmail.com");
		email.add("stvw@gmail.com");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmailId want to search");
		String Search_email=sc.next();
		
		SearchEmail se=new SearchEmail();
		se.Search(Search_email, email);
		
		
	}

}
