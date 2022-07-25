
public class Sumofrange {
	public int sum(int arr[],int L,int R) {
		int sum=0;
		for(int i=L;i<=R;i++) {
			sum+=arr[i];
		}
		return(sum);
	}

}
