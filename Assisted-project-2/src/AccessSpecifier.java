
public class AccessSpecifier {

	public static void main(String[] args) {
		A obj=new A();
		B obj1=new B();
		
		System.out.println("Public variable :" +obj.a);
		obj.display();
		
		System.out.println("public variable :"+obj1.b);
		System.out.println("protected variable :"+obj1.a); //Access protected variable and method by using the derived class object
		obj1.display1();
		obj1.display();
		
		//System.out.println("private variable :"+obj1.c); //compile time Error: Unresolved compilation problem: The field B.c is not visible

		System.out.println("Default variable :"+ obj1.d);
		
		
		

	}

}
