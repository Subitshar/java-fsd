
import java.util.Scanner;

public class Myclass {
	
	private static int a,b,sum;

	public static void main(String[] args) {
		Myclass mc=new Myclass();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the a and b values:");
		mc.a=scanner.nextInt();
		mc.b=scanner.nextInt();
		mc.sum=mc.a+mc.b;
		System.out.println("Sum of two values:"+mc.sum);
		

	}

}
