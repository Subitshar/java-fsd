import java.util.*;
//import java.util.Scanner;
public class Collection {

	public static void main(String[] args) {
		ArrayList <Integer> alist=new ArrayList<Integer>();
		alist.add(100);
		alist.add(103);
		alist.add(105);
		for(int i=3;i<=15;i++) {
			alist.add(i*6);
		}
		System.out.println(alist);
		System.out.println("Changed value:"+alist.set(4, 103));
		System.out.println(alist);
		
		LinkedList <String> ll=new LinkedList <String>();
		ll.add("Subitsha");
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			ll.add(sc.nextLine());
		}
		System.out.println(ll);
		System.out.println(ll.get(4));
		System.out.println(ll.set(4, "doni"));
		System.out.println(ll);
		
		Queue <Integer> Q=new LinkedList <Integer>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=10;i++) {
			Q.add(s.nextInt());
		}
		System.out.println(Q); 
		
		PriorityQueue <Integer> Q1=new PriorityQueue <Integer>();
		Scanner Sc=new Scanner(System.in);
		for(int i=0;i<=5;i++) {
			Q1.add(Sc.nextInt());
		}
		System.out.println(Q1);
		System.out.println(Q1.contains(100));
		System.out.println(Q1.poll());
		
		HashSet <String> H=new HashSet <String>();
		H.add("Subi");
		H.add("Suba");
		H.add("Suda");
		H.add("Siva");
		System.out.println(H);
		
		TreeSet <String> T=new TreeSet <String>();
		T.add("Subi");
		T.add("Suba");
		T.add("Suda");
		T.add("Siva");
		System.out.println(T);
		
		
		
	
	}

}
