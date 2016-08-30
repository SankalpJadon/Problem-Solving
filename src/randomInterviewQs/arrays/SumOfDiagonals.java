package randomInterviewQs.arrays;

import java.io.*;
import java.util.*;

public class SumOfDiagonals {

    public static void main(String[] args) {    	
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the array size: ");
        int n= sc.nextInt();
        int sum1=0;
        int sum2=0;
        int diff=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            	int element=sc.nextInt();
            	if(i==j){
            		sum1=sum1+element;
            	}
            	if((i+j)==(n-1)){
            		sum2=sum2+element;
            	}
            }
        }
        diff= Math.abs(sum2-sum1);
    	System.out.print(diff);
    }
}