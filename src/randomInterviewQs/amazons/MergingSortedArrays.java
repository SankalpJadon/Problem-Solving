//Given two sorted array, merge them into a sorted array in complexity- O(n)

package randomInterviewQs.amazons;
import java.util.Scanner;

public class MergingSortedArrays {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int size1= sc.nextInt();
		int size2= sc.nextInt();
		int[] arr1= new int[size1];
		int[] arr2= new int[size2];
		for(int i=0;i<size1;i++){
			arr1[i]= sc.nextInt();
		}
		for(int i=0;i<size2;i++){
			arr2[i]= sc.nextInt();
		}
		merge(arr1,arr2);
	}
	
	public static void merge(int[] arr1, int[] arr2){
		int[] arr= new int[arr1.length+arr2.length];
			int loopSize= arr1.length+arr2.length;
			int i=0,j=0,k=0;
			while(i<arr1.length&&j<arr2.length){
				if(arr1[i]>arr2[j]){
					arr[k]=arr2[j];
					++j;
				}
				else{
					arr[k]=arr1[i];
					++i;
				}
				k++;
			}
			while(i<arr1.length){
				arr[k]=arr1[i];
				k++;
				i++;
			}
			while(j<arr2.length){
				arr[k]= arr2[j];
				j++;
				k++;
			}
			for(int l=0;l<loopSize;l++){
				System.out.println(arr[l]+" ");
			}
	}
}
