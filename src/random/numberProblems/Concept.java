package random.numberProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Concept {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.print(new String(str).replace("\0", "hi"));
	}
}

/*for (int i = 9; i >= 0; i--) {
	System.out.print(new String(str).replace("\0", String.valueOf(i)));
}
*/