
public class Subtraction {
	public void sub(int a,int b) {    //Subtraction of two integer values
		int Sub=a-b;
		System.out.println("Subtraction of Two Integer :"+Sub);		
	}
	public void sub(double a,double b) {    //Subtraction of two double values
		double Sub=a-b;
		System.out.println("Subtraction of two Double value :"+String.format("%.2f",Sub));
	}
	public void sub(int a,double b) {
		double Sub=a-b;
		System.out.println("Subtraction of value :"+String.format("%.2f",Sub));
	}
}
