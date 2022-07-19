import java.util.ArrayList;
public class SearchEmail {
	public void Search(String str,ArrayList <String> email){
		if(email.contains(str)) {
			System.out.println("The email is found and it's index position is: "+email.indexOf(str));
		}
		else {
			System.out.println("The email does not found.");
		}
	}

}
