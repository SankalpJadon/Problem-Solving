package randomInterviewQs.amazons;

import java.util.Collections;
import java.util.PriorityQueue;

public class ArrayPairsSumK {
	public static void main(String args[]){
		PriorityQueue<Integer> p= new PriorityQueue<Integer>( Collections.reverseOrder());
		p.add(5);
		p.add(3);
		p.add(9);
		p.add(1);
		p.add(0);
		
		while(!p.isEmpty()){
			System.out.println(p.poll());
		}
	}
}
