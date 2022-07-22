
public class Test {

	public static void main(String[] args) {
		try{
			System.out.println("Starting of try block");
			throw new ExcClass("This is My error Message");
		}
		catch(ExcClass exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}

	}

}
