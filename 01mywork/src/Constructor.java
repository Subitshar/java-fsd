
public class Constructor {
	
	public Constructor(int a,int b) {
		System.out.println("parameter constructor have the values:"+a+" and "+b);
	}

	public static void main(String[] args) {
		Constructor obj1=new Constructor(5,9); //Parameterized constructor
		EmpDetails obj2=new EmpDetails();	//Non Argument constructor
		obj2.display();
	}

}
