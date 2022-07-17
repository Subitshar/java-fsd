
public class Multiplication {
	public void mul(int a,int b) {    //Multiplication of two integer values
		int Mul=a*b;
		System.out.println("Multiplication of Two Integer :"+Mul);		
	}
	public void mul(double a,double b) {    //Multiplication of two double values
		double Mul=a*b;
		System.out.println("Multiplication of two Double value :"+String.format("%.2f",Mul));
	}
	public void mul(int a,double b) {
		double Mul=a*b;
		System.out.println("Multiplication of value :"+String.format("%.2f",Mul));
	}

}
