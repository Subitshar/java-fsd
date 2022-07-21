

public class ArrayException {
			public static void main(String[] args) {
				int arr[]= {10,20,30};
				System.out.println("Length of array:"+arr.length);
				System.out.println("Array Elements");
				try {
				for(int i=0;i <=arr.length;i++) {
					System.out.println(arr[i]+" ");
				}
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array index is out of boundary");
				}
				System.out.println("Array values are printed....");
			}

	
	}


