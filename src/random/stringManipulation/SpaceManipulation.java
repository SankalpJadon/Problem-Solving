// Manipulate the spaces like- How are you--> __Howareyou
package random.stringManipulation;

import java.util.Scanner;

public class SpaceManipulation {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);	
		String line= sc.nextLine();
		System.out.println("The string is: "+line);
		System.out.println("The output string is: ");
		char[] array= new char[line.length()];
		for(int i=0;i<line.length();i++){
			System.out.println(array[i]);
		}
	}
	static char[] manipulate(String line){
		int count=0;
		char[] array= new char[line.length()];
		for(int i=0;i<line.length()-1;i++){
			if(line.charAt(i)==' '){
				count++;
				array[count]=' ';
			}
		}
		for(int j=count+1;j<line.length()-1;j++){
			if(!(line.charAt(j)==' ')){
				array[j]=line.charAt(j);
			}
		}
		return array;
	}
}
