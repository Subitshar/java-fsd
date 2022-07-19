
public class TypeCastingExplicit {

	public static void main(String[] args) {
		double a=130.99;
		
		float b=(float)a;
		System.out.println("Double to Float Type Casting");
		System.out.println("Print the value of "+b+"\n");
		
		long c=(long)b;
		System.out.println("Double to Long Type Casting");
		System.out.println("b value :"+c+"\n");
		
		int d=(int)c;
		System.out.println("Long to Integer Type Casting");
		System.out.println("c value :"+d+"\n");
		
		short e=(short)d;
		System.out.println("Integer to Short Type Casting");
		System.out.println("d value :"+e+"\n");

	}

}
