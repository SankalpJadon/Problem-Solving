//Given two strings, write a method to decide if one is a permutation of the other.

package ctc.string;

import java.util.Arrays;
import java.util.Scanner;

public class Q3Permutation {

	static boolean permutationOrNot(String str1,String str2){
		if(str1.length()!=str2.length())
			return false;
		
		int[] array= new int[58]; //Assuming that the string will contain only char values
		
		for(int i=0;i<str1.length();i++){
			char c= (char) (str1.charAt(i) - 65);
			array[c]++;
		}
		
		for(int i=0;i<str2.length();i++){
			char c=(char)(str2.charAt(i)-65);
			array[c]--;
			if(array[c]<0)
				return false;
			else 
				continue;
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1= sc.nextLine();
		System.out.println("Enter second string: ");
		String str2= sc.nextLine();
		boolean result=permutationOrNot(str1, str2);
		if(result){
			System.out.println("Permutation of each other");
		}
		else{
			System.out.println("Not a permuation of each other");
		}
		sc.close();
	}

}
