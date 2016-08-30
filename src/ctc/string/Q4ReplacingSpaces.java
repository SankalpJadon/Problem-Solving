//Replace space in a string by %20

package ctc.string;

import java.util.Arrays;
import java.util.Scanner;
public class Q4ReplacingSpaces {

	public static void main(String args[]){
		System.out.println("Enter the string: ");
		Scanner sc= new Scanner(System.in);
		String a= sc.nextLine();
		System.out.println(Arrays.toString(replaceSpace(a)));
		
	}
	public static char[] replaceSpace(String a){
		int count=0;
		char[] oldArray= a.toCharArray();
		int len=oldArray.length;
		for(int i=0;i<len;i++){
			if(oldArray[i]== 32){
				count++;
			}
		}
		int newLen= len+count*2;
		int j=0;
		char[] newArray= new char[newLen];
		for(int i=0;i<len;i++){
			if(oldArray[i]==32){
				newArray[j]='%';
				newArray[j+1]='2';
				newArray[j+2]='0';
				j=j+3;
			}
			else{
				newArray[j]=oldArray[i];
				j++;
			}
			
		}
		return newArray;
	}
}
