//Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
package random.numberProblems;

import java.util.Arrays;

public class CommonIn3Arrays {

	
	public static void main(String args[]){
		String a="1356";
		String b="23679";
		String c="3678";
		char[] arr1= a.toCharArray();
		char[] arr2= b.toCharArray();
		char[] arr3= c.toCharArray();
		int len= Math.max(Math.max(a.length(),b.length()),c.length());
		String result=new String();
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length&&k<arr3.length){
			if(arr1[i]==arr2[j]){
				if(arr2[j]==arr3[k]){
					System.out.print(arr2[j]+" ");
					k++;
				}
				else if(arr2[j]>arr3[k]){
					k++;
				}
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j]){
				j++;
			}
			else if(arr1[i]<arr2[j]){
				i++;
			}
		}
	}
}
