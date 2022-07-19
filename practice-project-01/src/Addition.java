
public class Addition {
	
	public void add(int a,int b) {    //add two integer values
		int Sum=a+b;
		System.out.println("Sum of Two Integer :"+Sum);		
	}
	public void add(double a,double b) {    //add two double values
		double Sum=a+b;
		System.out.println("Sum of two Double value :"+String.format("%.2f",Sum));
	}
	public void add(int a,double b) {
		double Sum=a+b;
		System.out.println("Sum of value :"+String.format("%.2f",Sum));
	}
	

}
