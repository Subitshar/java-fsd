package polymarphism;

public class Compiletime {
	public static void main(String args[]) {
	Compiletime C=new Compiletime();
	C.add(5,7);
	C.add();
	
	}
	 void add(int a,int b) {
		int result=a+b;
		System.out.println(result);
	}
	
	void add(){
		int a=5,b=9;
		int result=a+b;
		System.out.println(result);
	}
	}

