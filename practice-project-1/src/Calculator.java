 
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Addition of Two number");
		Addition obj = new Addition();
		obj.add(100,206.5);
		obj.add(100,22);
		obj.add(100.88,33.56);
		
		System.out.println("\nSubtraction of Two number");
		Subtraction obj1= new Subtraction();
		obj1.sub(1000,206.5);
		obj1.sub(100,22);
		obj1.sub(90.88,33.56);
		
		System.out.println("\nMultiplication of Two number");
		Multiplication obj2= new Multiplication();
		obj2.mul(10,206.5);
		obj2.mul(10,22);
		obj2.mul(10.88,33.56);
		
		System.out.println("Division of Two number");
		Division obj3= new Division();
		obj3.div(1000,206.5);
		obj3.div(100,22);
		obj3.div(10.38,33.56);
		
	}

}
