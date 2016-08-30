package randomInterviewQs.amazons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HighestOccuringWord {
	public static void main(String args[]){
		String test= "Hi how are you Hi im fine are you fine how is boston";
		HighestOccuringWord highest= new HighestOccuringWord();
		ArrayList<Character> list= highest.mostOccuringWord(test);
		for(Character c:list){
			System.out.println(c);
		}
	}
	ArrayList<Character> mostOccuringWord(String test){
		Map<Character,Integer> hm= new HashMap<Character,Integer>();
		ArrayList<Character> list= new ArrayList<Character>();
		int count=0;
		for(int i=0;i<test.length();i++){
			Character c= test.charAt(i);
			if(c==' '){
				continue;
			}
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
			if(hm.get(c)>count){
				count=hm.get(c);
			}
		}
		for(Map.Entry<Character,Integer> entry: hm.entrySet()){
			if(entry.getValue()==count){
				list.add(entry.getKey());
			}
		}
		return list;
	}
}
