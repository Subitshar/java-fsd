
public class CallByReferance {
	public int a=3,b=5;
	public void swap(CallByReferance obj) {
		int temp;
		temp=a;
		a=b;
		b=temp;
	}

}
