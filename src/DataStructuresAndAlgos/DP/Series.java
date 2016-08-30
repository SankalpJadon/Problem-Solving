package DataStructuresAndAlgos.DP;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first= sc.nextInt();
        int second= sc.nextInt();
        int nth= sc.nextInt();
        nthTerm(first,second,nth);
    }
    
    public static void nthTerm(int f, int s, int n){
    	int[] array= new int[n];
        array[0]=f;
        array[1]=s;
        for(int i=2;i<n;i++){
            array[i]= (array[i-1]*array[i-1])+array[i-2];
        }
        System.out.println(array[(n-1)]);
    }
}
