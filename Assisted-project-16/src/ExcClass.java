
public class ExcClass extends Exception {
	String str;
	ExcClass(String str){
		this.str=str;
	}
	
	public String toString() {
		return("My exception occured :"+str);
	}
}
