
import java.util.Scanner;

public class Arithmetic {
public static void main(String[] args) {
				Scanner scanner =new Scanner (System.in);
				int a, b,c,d;
				try {
				System.out.println("Enter the two numbers:");
				a=scanner.nextInt();
				b=scanner.nextInt();
				c=a/b;
				d=a%b;
				System.out.println(a+"/"+b+"="+c+", Remainder "+d);
				}
				catch(ArithmeticException e) {
					System.out.println("Divinding by zero error");
				}
				
				System.out.println("Other programming logic continous below... ");
				
				
			}
}
