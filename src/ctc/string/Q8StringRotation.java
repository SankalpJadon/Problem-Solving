//Assume you have a method isSubstring which checks if one word is a substring
//of another. Given two strings, si and s2, write code to check Ifs2 is a rotation of si
//using only onecalltoisSubstring (e.g., "waterbottLe" is a rotation of "erbottLewat").

package ctc.string;

import java.util.Scanner;

public class Q8StringRotation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1= sc.nextLine();
		System.out.println("Enter second string: ");
		String str2= sc.nextLine();
		rotation(str1,str2);
		sc.close();
	}
	public static void rotation(String str1,String str2){
		if(str1.length()==str2.length()&&str1!=null){
			String str1str1= str1.concat(str1);
			if(str1str1.contains(str2))
				System.out.println("Rotation");
			else
				System.out.println("Not Rotation");
		}
		else{
			System.out.println("Not Rotation");
		}
	}
}
