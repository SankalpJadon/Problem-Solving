// Find the continuous elements in the array that are equal to the sum.
package randomInterviewQs.arrays;

import java.util.Scanner;

public class SumOfElementsInArray {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of values in the array: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum: ");
		int sum= sc.nextInt();
		int tempsum=0;
		int start=0,end=0;
		int i=0;
		while(start<n){
			if(tempsum<sum){
				tempsum=tempsum+arr[end];
				if(tempsum==sum){
					break;
				}
				end++;
			}
			else{
				tempsum=tempsum-arr[start];
				start++;
				if(tempsum==sum){
					break;
				}
			}
		}
		System.out.println("Starting index is: "+start);
		System.out.println("End index is: "+end);
	}
	
}
