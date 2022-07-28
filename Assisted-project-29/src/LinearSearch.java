
public class LinearSearch {
	public void linearsearch(int arr[], int key) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("\nThe search element found at position " + i);
				break;
			}
		}
		if (i == arr.length) {
			System.out.println("\nThe search element not found.");
		}
	}
}
