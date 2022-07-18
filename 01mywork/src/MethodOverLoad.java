
public class MethodOverLoad {
	public void add() {
		int a=4,b=100;
		int sum=a+b;
		System.out.println("Adding two numbers:"+sum);
	}
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Adding two numbers :"+sum);
	}
	
	public void add(double a,double b) {
		double sum=a+b;
		System.out.println("Adding two numbers:"+sum);
	}
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum of three values:"+sum);
	}

}
