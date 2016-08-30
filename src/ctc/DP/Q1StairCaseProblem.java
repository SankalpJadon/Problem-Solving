/*A child is running up a staircase with n steps, and can hop either 1 step, 2 steps,
or 3 steps at a time. Implement a method to count how many possible ways the
child can run up the stairs. */

package ctc.DP;

import java.util.Map;
import java.util.TreeMap;

public class Q1StairCaseProblem{
	public static void main(String args[]){
			TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
			tm.put(1,"Sankalp");
			tm.put(2,"Naveen");
			tm.put(3,"Akshay");
			char a= 'A';
			System.out.println((int)a);
			for(Map.Entry e: tm.entrySet()){
				System.out.println(e.getKey()+"-"+e.getValue());
			}
	}
}
