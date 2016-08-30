package random.stringManipulation;

import java.util.Arrays;

public class StringPattern2 {

	public static void main(String args[]){
		String str= "Thisismagic";
		
		int j=0;
		boolean down=true;	
		char[] result1= new char[str.length()];
		char[] result2= new char[str.length()];
		for(int i=0;i<str.length();i++){
				if(down){
					result1[j]=str.charAt(i);
					down=false;
					j++;
				}
				else if(!down){
					result2[j]=str.charAt(i);
					j++;
					down=true;
				}
		}
		for(int k=0;k<str.length();k++){
			if(result1[k]!=0){
				System.out.print(result1[k]);
			}
		}
		for(int l=0;l<str.length();l++){
			if(result2[l]!=0){
				System.out.print(result2[l]);
			}
		}
			

	}
}
