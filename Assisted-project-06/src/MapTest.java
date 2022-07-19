import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,Integer> H=new HashMap<String,Integer>();
		H.put("idly", 25);
		H.put("pongal", 20);
		H.put("boori",15);
		H.put("Dosai",35);
		H.put("Magi",20);
		System.out.println("\nThe elements of HashMap are"+H);
		System.out.println("The value of key:"+ H.get("Dosai"));
		System.out.println("The size of Hash Map:"+H.size());
		
		LinkedHashMap <Integer,String> lm =new LinkedHashMap <Integer,String>();
		System.out.println(lm);
		lm.put(1, "subi");
		lm.put(2,"suba");
		lm.put(3,"siva");
		
		System.out.println("\nThe elements of LinkedHashMap are:"+lm);
		System.out.println(lm.containsValue("subi"));
		lm.clear();
		
		TreeMap <String,Integer> tm=new TreeMap <String,Integer>();
		tm.putAll(H);
		System.out.println("\nThe elements of TreeHash are"+tm);
		
		Hashtable <Integer,String> ht=new Hashtable <Integer,String>();
		ht.put(1, "Raja");
		ht.put(2, "Rani");
		ht.put(3, "Raja");
		ht.put(4, "usha");
		
		System.out.println("\nThe elements of HashTable are "+ht);  
	      
	}
}
