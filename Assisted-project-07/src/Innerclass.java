
public class Innerclass {
	private String str="Hello people,";
	class Inner{
		public void display() {
			System.out.println(str+" Welcome to java world.");
		}
	}

	public static void main(String[] args) {
		Innerclass Ic=new Innerclass();
		Innerclass.Inner i=Ic.new Inner();
		i.display();
	}

}
