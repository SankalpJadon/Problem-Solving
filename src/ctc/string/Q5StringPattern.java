//Implement a method to perform basic string compression using the counts of
//repeated characters. For example, the string aabcccccaaa would become
//a2blc5a3. If the "compressed" string would not become smaller than the original
//string, your method should return the original string.

package ctc.string;
import java.util.Scanner;
public class Q5StringPattern {

	public static void main(String args[]) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb= new StringBuffer();
		char ch= str.charAt(0);
		int count=1;
		for(int i=1;i<str.length()-1;i++){
			if(str.charAt(i)==ch){
				count++;
			}
			else{
				sb.append(Character.toString(ch)+count);
				ch=str.charAt(i);
				count=1;
			}
		}
		sb.append(Character.toString(ch)+count);
		System.out.println(sb);
	}
}
