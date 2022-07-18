
public class Method {

	public static void main(String[] args) {
		CallByValue obj1= new CallByValue();
		int a=3,b=5;
		System.out.println("Value before call by value a="+a+" and b="+b);
		obj1.swap(a, b);
		System.out.println("Value After call by value a="+a+" and b="+b);
		
		CallByReferance obj=new CallByReferance();
		System.out.println("\nValue before call by value a="+obj.a+" and b="+obj.b);
		obj.swap(obj);
		System.out.println("Value After call by value a="+obj.a+" and b="+obj.b+"\n");
		
		MethodOverLoad obj2=new MethodOverLoad();
		obj2.add();
		obj2.add(102.0, 13.88);
		obj2.add(12, 189);
		obj2.add(100, 200, 300);
		
		
	}

}
