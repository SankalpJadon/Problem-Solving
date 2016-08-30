package DataStructuresAndAlgos.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	Scanner sc= new Scanner(System.in);
	int[] arr;
	int len=0;
	int mid=0;
	
	public MergeSort(int n){
		len=n;
		arr= new int[n];
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		merge(arr);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void merge(int[] arr){
		mid=len/2;
		
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n= sc.nextInt();
		MergeSort ms= new MergeSort(n);
	}
}
