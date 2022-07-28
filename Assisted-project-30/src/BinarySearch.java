public class BinarySearch {

	public int binarySearch(int arr[], int l, int h, int x) {
		if (h >= l) {
			int mid = l + (h - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, h, x);
		}
		return -1;
	}

}
