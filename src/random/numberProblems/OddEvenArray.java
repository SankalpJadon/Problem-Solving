package random.numberProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

//Sort odd on left side, even on right side
public class OddEvenArray {
	static int[] A={1,4,3,6,5,2};
	public void sort(int[] A){
		int len=A.length;
		int i=0;
		int j=len-1;
		while(i!=j){
			if(A[i]%2==0){
				if(A[j]%2==0){
					j--;
				}
				else{
					swap(i,j);
					j--;
				}
			}
			else{
				i++;
			}
		}
		for(int k=0;k<len;k++){
			System.out.println(A[i]);
		}
	}
	public void  swap(int i, int j){
		int temp=A[j];
		A[i]=A[j];
		A[j]=temp;
	}
	public static void main(String args[]){
		OddEvenArray oea=new OddEvenArray();
		oea.sort(A);
	}
}
