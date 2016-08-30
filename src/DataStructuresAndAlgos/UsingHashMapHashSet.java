package DataStructuresAndAlgos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UsingHashMapHashSet {

	public static void main(String args[]) {
		HashSet<String> hs=new HashSet<>();
		ArrayList<String> al=new ArrayList<>();
		al.add("1");
		hs.add("How");
		hs.add("Hi");
		hs.add("Are");
		hs.add("How");
		hs.addAll(al);
		for(String s: hs){
			System.out.println(s);
		}
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Hi", 1);
		hm.put("Hello",2);
		System.out.println(hm.containsKey("hi"));
		System.out.println(hm.containsValue(1));
		for(String str: hm.keySet()){
			System.out.println(str);
		}
		hm.clear();
		System.out.println(hm);
	}
}
