package randomInterviewQs.amazons;

import java.util.Scanner;

public class StaircaseProblem {
	public static void main(String args[]){
		System.out.println("Enter the staircase size:");
		Scanner sc= new Scanner(System.in);
		int input= sc.nextInt();
		printStairCase(input);
	}
	public static void printStairCase(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i+j)>n)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
