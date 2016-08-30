package randomInterviewQs.amazons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class WordsInString {
	public static void main(String args[]){
		String a="How are you you are How Well";
		ArrayList<Integer> list=wordsInString(a);
		ListIterator<Integer> itr= list.listIterator();
		System.out.println(list);
	}
	
	public static ArrayList wordsInString(String str){
		HashMap<String,Integer> ht= new HashMap<String,Integer>();
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++){
			 if(ht.containsKey(words[i])){
				 ht.put(words[i],ht.get(words[i])+1);
			 }
			 else{
				 ht.put(words[i], 1);
			 }
		}
		ArrayList<Integer> list= new ArrayList(ht.values());
		Collections.sort(list);
		return list;
	}
}
