
public class TypeCastingImplicit {

	public static void main(String[] args) {
		System.out.println("Implicit TypeCasting\n");
		byte a=103;
		
		System.out.println("Byte to short type casting");
		short b=a;
		System.out.println("b value : "+b+"\n");
		
		System.out.println("Short to integer type casting");
		int c=b;
		System.out.println("c value : "+c+"\n");
		
		System.out.println("Integer to long type casting");
		long d=c;
		System.out.println("d value : "+d+"\n");
		
		float e=d;
		System.out.println("Long to float type casting");
		System.out.println("Print the value of "+e+"\n");
		
		double f=e;
		System.out.println("Float to double type casting");
		System.out.println("Print the value of "+f+"\n");
		
		char g=68;
		System.out.println("Integer to Char casting");
		System.out.println("Print the value of "+g+"\n");

	}

}
