public class StringMethods {

	public static void main(String[] args) {
		System.out.println("String Methods\n");
		String str = new String("Hello ");
		// concatenation of two strings
		System.out.println(str = str.concat("world"));
		// index position of character
		System.out.println(str.indexOf("w"));
		// length of string
		System.out.println(str.length());
		// replace the l by d
		String str1 = new String();
		str1 = str.replace("l", "d");
		System.out.println(str1);
		// check equal
		String x = "Welcome to world";
		String y = "WeLcOmE tO WoRLd";
		System.out.println(x.equals(y));
		// sub string
		System.out.println(str.substring(0, 5));
		// to upper case
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// compare the two string
		str1 = str1.replace("d", "l");
		System.out.println(str.compareTo(str));
		// IsEmpty
		String s4 = "";
		System.out.println(s4.isEmpty());
		
		
		// Creating StringBuffer and append method
		StringBuffer s = new StringBuffer("Welcome to world");
		s.append(" Enjoy your life");
		System.out.println(s);

		// insert method
		s.insert(0, ":-) ");
		System.out.println(s);

		// replace method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hE");
		System.out.println(sb);

		// delete method
		sb.delete(0, 1);
		System.out.println(sb);
		//Create the String Buffer
		
		StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append(" world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		


	}
}