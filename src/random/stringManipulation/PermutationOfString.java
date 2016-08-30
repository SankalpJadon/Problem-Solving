package random.stringManipulation;

import java.util.Arrays;
//Given two strings, write a method to decide if one is a permutation of the other.
//Solution1: Sort two strings and compare.
//Solution2: Count the character count.
public class PermutationOfString {
	
	static char[] array;
	
	public static void stringSort(String a){
		array= a.toCharArray();
		int len= array.length;
		sort(0,len-1);
	}
	
	public static void sort(int low, int high){
		int i=low;
		int j=high;
		int pivot= array[low+(high-low)/2];
		while(array[i]<pivot){
			i++;
		}
		while(array[j]>pivot){
			j--;
		}
		if(array[i]>array[j]){
			swap(i,j);
		}
		sort(0,pivot-1);
		sort(pivot+1,high);
	}
	
	public static void swap(int i, int j){
		char temp;;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void main(String args[]){
		String a="hi hello";
		String b="hello hi";
		stringSort(a);
		System.out.println(Arrays.toString(array));
	}
}
