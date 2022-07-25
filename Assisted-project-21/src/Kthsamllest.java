
public class Kthsamllest {
	public void sort(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			int temp=0;
			for(int j=i;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
		public int  findsmallest(int arr[],int k) {
			sort(arr);
			return(arr[k-1]);
		}
	}


