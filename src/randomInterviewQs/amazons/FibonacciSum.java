// find the sum in fibonacci series till nth term.
// 0 1 1 2 3 5 8 13 21 34 ==> n= 7
// sum= 20
package randomInterviewQs.amazons;

import java.util.Scanner;

public class FibonacciSum {

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the fibonacci index: ");
		int n= sc.nextInt();
		System.out.println(findSum(n));
	}
	
	public static int findSum(int n){
		int sum=0;
		int i=0;
		int j=1;
		int temp=0;
		int count=2;
		while(count<n){	// 6
			temp=i+j;
			i=j;
			j=temp;
			sum=sum+temp;
			count++;
		}
		return sum;
	}
}
