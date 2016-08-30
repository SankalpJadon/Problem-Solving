package random.stringManipulation;

import java.util.Scanner;

public class NoOfStringEdit {
	String name1, name2;
	NoOfStringEdit(String a,String b) {
	name1= a;
	name2=b;	
	}
	
	public static void main(String args[]){
		String name1= new String();
		String name2= new String();
		Scanner sc= new Scanner(System.in);
		name1= sc.nextLine();
		name2= sc.nextLine();
		NoOfStringEdit nose= new NoOfStringEdit(name1,name2);
		
		
	}
}
