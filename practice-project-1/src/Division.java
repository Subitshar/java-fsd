
public class Division {
	public void div(int a,int b) {    //Division of two integer values
		int div=a/b;
		System.out.println("Division of Two Integer :"+div);		
	}
	public void div(double a,double b) {    //Division of two double values
		double div=a/b;
		System.out.println("Division of two Double value :"+String.format("%.2f",div));
	}
	public void div(int a,double b) {
		double div=a/b;
		System.out.println("Division of value :"+String.format("%.2f",div));
	}
}
