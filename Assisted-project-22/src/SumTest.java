import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		int arr[]= {23,45,65,43,87,96,33,22,45};
		int length=arr.length;
		int l,r;
		Sumofrange S=new Sumofrange();
		System.out.println("Enter the range between 1 to "+length);
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		r=sc.nextInt();
		int results=S.sum(arr, l, r);
		System.out.println("The sum of given array with in the range "+results);
	}

}
