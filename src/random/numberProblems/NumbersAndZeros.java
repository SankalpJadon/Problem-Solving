package random.numberProblems;

import java.util.Scanner;

public class NumbersAndZeros {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		int count=0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!='0'){
				System.out.print(input.charAt(i));
			}
			else if(input.charAt(i)=='0'){
				count++;
			}
		}
		for(int j=0;j<count;j++){
			System.out.print(0);
		}
	}
}
