package capsule;

public class Test {
	public static void main(String args[]) {
		// no encapsulation
				Student student = new Student();
				student.id = 1;
				student.name = "RK";
				student.course = "JAVAFSD";
				student.printdetails();
				
				// writeonly object
				BankAccount acc = new BankAccount();
				acc.SetName("XYZ");
				acc.SetAccountNumber(-2);
				acc.Printdetails();
				
				// readonly object
				prodect product = new prodect(1, "Phone", 50000);
				int id = product.getId();
				System.out.println("Product Id: " + id);
	}

}
