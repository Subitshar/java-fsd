package thread;

public class SingleThread {

	public static void main(String[] args) {
		SingleThread st=new SingleThread();
		st.printvalue();
		
		for(int j=0;j<100;j++) {
			System.out.println("j :"+j);
		}
	}
	
	void printvalue() {
		for(int i=0;i<100;i++) {
			System.out.println("i :"+i);
		}
	}

}
