package random.numberProblems;

import java.util.Scanner;

public class FactorialRecursion {
	int result=1;
	public int factorial(int n){
		if(n>0){
			result=n*factorial(n-1);
			System.out.println("in while");
		}
		return result;
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		FactorialRecursion fact=new FactorialRecursion();
		System.out.println(fact.factorial(n));
	}

}
