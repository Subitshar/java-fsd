
public class Rotate {
	public void rotate(int arr[], int n) {
		if (n > arr.length) {
			n = n % arr.length;
		}
		for (int i = 0; i < n; i++) {
			int j, last;
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
        }   
	}
}