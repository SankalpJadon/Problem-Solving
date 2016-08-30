package random.numberProblems;

import java.util.Arrays;

public class ThirdLargestInArray {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 3, 3, 5, 3, 7, 4 };
		int[] result = new int[3];
		int largest = 0;
		int j = 0;
		largest = 0;
		do {
			for (int i = 0; i < a.length; i++) {
				if (largest <= a[i]) {
					largest = a[i];
				}
			a[i]= 0;	
			}
			result[j] = largest;
			j++;
		} while (j < 3);
		
		System.out.println("Third largest no. is: " + Arrays.toString(result));
	}

}
