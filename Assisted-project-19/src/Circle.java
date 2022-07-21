
public class Circle implements CircleArea1, CircleArea2 {
	public void calculateArea() {
		System.out.println(CircleArea2.pi*2*2);
		
	}

	@Override
	public void calculateArea(int radius) {
		System.out.println(CircleArea2.pi*(radius*radius));
				
	}
	
	public static void main(String args[]) {
		Circle C=new Circle();
		C.calculateArea();
		C.calculateArea(4);
	}

}
