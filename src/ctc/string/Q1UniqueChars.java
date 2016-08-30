
package ctc.string;

import java.util.Arrays;
import java.util.Scanner;

//Implement an algorithm to determine if a string has all unique characters. What
//if you cannot use additional data structures?

public class Q1UniqueChars {

	public static void main (String args[])
    {
		boolean flag=true;
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the string:");
		String input= sc.nextLine();
		if(input.length()>256)				// 1. Check if the length of string>256 as there 
			flag=false;		  				// are only 256 unique characters.
		boolean[] array= new boolean[256];  // 2. A new boolean array is always false by default
		for(int i=0;i<input.length();i++){
			char a=input.charAt(i);
			if(array[a]){
				flag=false;
				break;
			}
			else{
				array[a]=true;
			}
		}
		if(flag==false)
			System.out.println("Contains duplicates");
		else
			System.out.println("Contains unique");
    }
}
