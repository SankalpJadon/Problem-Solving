package DataStructuresAndAlgos.Sort;


import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[]= new int[]{4,2,7,6,9,1,3,8,5};
		quickSort(a, 0, 8);
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]);
		}
		
	}
	
	public static void quickSort(int a[], int start, int end){
		if(start<end){
			int partitionIndex= partition(a,start,end);
			quickSort(a,partitionIndex+1,end);
			quickSort(a, start, partitionIndex-1);
		}
	}

	public static int partition(int a[], int start, int end){
		int pivot= a[end];
		int pIndex= start;
		for(int i=start;i<end;i++){
			if(a[i]<=pivot){
				swap(a, i, pIndex);
				pIndex= pIndex+1;
			}
		}
		swap(a,pIndex,end);
		//System.out.println(Arrays.toString(a));
	return pIndex;
	}

	private static void swap(int a[], int i, int pIndex) {
		int temp;
		temp=a[i];
		a[i]=a[pIndex];
		a[pIndex]=temp;
	}
}
