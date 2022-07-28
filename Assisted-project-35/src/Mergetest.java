
public class Mergetest {

		void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            int m =l+ (r-l)/2;
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	            MergeSort ms=new MergeSort();
	            ms.merge(arr, l, m, r);
	        }
	    }
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	        int arr[] = { 12, 11, 13, 5, 6, 7 };
	 
	        System.out.println("Given Array");
	        printArray(arr);
	 
	        Mergetest ob = new Mergetest();
	        ob.sort(arr, 0, arr.length - 1);
	 
	        System.out.println("\nSorted array");
	        printArray(arr);
	    }

	}


