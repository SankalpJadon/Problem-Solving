package random.numberProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeOptimalSol {
	boolean result=false;
	int count=0;
	ArrayList al= new ArrayList();	
	public boolean primeOrNot(int n){
		int sq=(int) Math.sqrt(n);
		for(int i=1;i<=sq;i++){
			if(n%i==0){
				count++;
				al.add(i);
			}
		}
		if(count>1){
			result=false;
		}
		else{
			result=true;
		}
		return result;
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList numbers= new ArrayList<>();
		PrimeOptimalSol res= new PrimeOptimalSol();
		System.out.println("Is the number prime? "+res.primeOrNot(n));
		System.out.println(n+" is divisible by "+res.al);

		
	}
}
