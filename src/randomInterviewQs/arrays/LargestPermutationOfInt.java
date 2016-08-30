// Given an integer, find the maximum integer that can be generated?
// 152 -->  521
package randomInterviewQs.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPermutationOfInt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = String.valueOf(n);
		int[] arr = new int[10];

		while (n > 0) {
			arr[n % 10]++;
			n = n / 10;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 9; i >= 0; i--) {
			System.out.print(new String(new char[arr[i]]).replace("\0", String.valueOf(i)));
		}

	}
}
