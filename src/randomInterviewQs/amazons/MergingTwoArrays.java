// Merge two unsorted arrays into one array in O(n) complexity
// arr1= 6,2,4 
// arr2= 8,1,3,4
// arr = 1,2,3,4,4,6,8
package randomInterviewQs.amazons;
import java.util.Scanner;

public class MergingTwoArrays {
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
		int size= arr1.length+arr2.length;
		int[] arr= new int[size];
		for(int i=0;i<size;i++){
			
		}
		
	}
}
