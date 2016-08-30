package randomInterviewQs.amazons;

import java.util.HashMap;
import java.util.Map;

public class OddTimesInArray {
	public static void main(String args[]){
		int[] arr= {1,1,4,4,4,5,5,6,6};
		System.out.println(findOdd(arr));
	}
	public static int findOdd(int[] arr){
		int result=0;
		for(int i=0;i<arr.length;i++){
			result= result^arr[i];
		}
	return result;
	}
}
