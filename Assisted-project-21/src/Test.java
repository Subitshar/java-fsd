
public class Test {

	public static void main(String[] args) {
		int arr[]= {23,76,45,97,22,67,44,88,65};
		Kthsamllest k=new Kthsamllest();
		int m=k.findsmallest(arr, 4);
		System.out.println("The smallest 4 th number"+m);
	}

}
