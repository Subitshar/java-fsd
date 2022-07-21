

public class Stringdemo {
	public static void main(String[] args) {
		try {
		String str=args[0];
		System.out.println("Input vcalue:"+str);
		int n=Integer.parseInt(str);
		System.out.println("Output value:"+n);
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Give Input");
		}catch(NumberFormatException ec){
			System.out.println("Give number as input");
		}
		
		System.out.println("Program continue...");
	}

}
