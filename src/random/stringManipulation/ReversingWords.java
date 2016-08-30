// Reversing the string like- How are you--> you are How
package random.stringManipulation;

import java.util.Scanner;

public class ReversingWords {

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);	
		String line= sc.nextLine();
		System.out.println("The regular string is: "+line);
		reverseWords(line);
	}
	
	public static void reverseWords(String s) {
	    int count=0;
	    for(int i=0;i<s.length()-1;i++){
	    	char ch= s.charAt(i);
	    	if(ch==' '){
	    		count++;
	    	}
	    }
	    String[] array= new String[count];
	    array= s.split(" ");
	    for(int i=array.length-1;i>=0;i--){
	    	System.out.print(array[i]+' ');
	    }
	}
}
