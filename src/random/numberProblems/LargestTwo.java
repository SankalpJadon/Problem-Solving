package random.numberProblems;


import java.util.Scanner;

public class LargestTwo {
	
	public static void main(String args[]){
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++)
	    {
	    	Scanner input = new Scanner(System.in);
	        System.out.println("Please enter number");
	        numbers[i] = input.nextInt();
	    }
		int num1= numbers[0];//4
		int num2= numbers[1];//3
			for(int k=2;k<numbers.length;k++){//4 3 6 9 1
				
				if(num1<numbers[k]){
					num1=numbers[k];
				}
				if(num2<numbers[k-1]){
					num2=numbers[k-1];
				}
						
			}
			
		
		
		System.out.println(num1+" "+num2);
		

	}
}
