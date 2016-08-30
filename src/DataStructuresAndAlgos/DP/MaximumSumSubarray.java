//	1, -3, 7, 3, -4, 3, -2, 1 
package DataStructuresAndAlgos.DP;

import java.util.Scanner;

public class MaximumSumSubarray {
	public static void main(String args[]){
		System.out.println("Enter the number of elements in array: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println(findSubArray(arr));
	}
	public static int findSubArray(int[] array){	// 2 -1 7 -3 5 -2 1
		int sum=0,ans=0;
		if(array.length==1){
			return array[0];
		}
		for(int i=0;i<array.length;i++){
			if(sum>0){
				sum=sum+array[i];
			}
			else{
				sum=array[i];
			}
			if(ans<sum){
				ans=sum;
			}
			
			ans= Integer.max(sum,ans);
		}
		return ans;
	}	
}
