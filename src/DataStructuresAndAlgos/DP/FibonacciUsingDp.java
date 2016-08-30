package DataStructuresAndAlgos.DP;

public class FibonacciUsingDp {
	
	public static void main(String args[]){
		int n=6;
		fibonacci(n);
	}

	public static void fibonacci(int n){
		int[] array= new int[n+1];
		for(int i=0;i<array.length;i++){
			if(i==0){
				array[i]=0;
			}
			else if(i==1){
				array[i]=1;
			}
			else{
				array[i]=array[i-2]+array[i-1];
			}
		}
		System.out.println(String.valueOf(array[n]));
	}
}
