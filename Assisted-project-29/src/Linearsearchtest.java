import java.util.Scanner;

public class Linearsearchtest {

	public static void main(String[] args) {
		int n,k;
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements...");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key element");
		k=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		LinearSearch ls=new LinearSearch();
		ls.linearsearch(arr, k);
	}

}
