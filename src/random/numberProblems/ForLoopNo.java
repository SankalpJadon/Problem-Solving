package random.numberProblems;

public class ForLoopNo {

	public static void main(String[] args) {
			
			int[][] mat1 = new int[5][5];
			int[][] mat2 = new int[5][5];
			for (int ii = 0; ii < 5; ii++) {
				for (int j = 0; j <5; j++) {
					mat1[ii][j] = (int) Math.floor(Math.random() * (1 - 5 + 1)) + 1;
					mat2[ii][j] = (int) Math.floor(Math.random() * (1 - 5 + 1)) + 1;
				}
			}
			System.out.println("----------------------------------------------------------------------------");
			int[][] c = new int[5][5];						
			for (int i = 0; i < 5; i++) {			     //1+(n+1)+(m+1)
			System.out.println(" ");		
			for (int j = 0; j < 5; j++) {		     //n(1+(n+1)+(m+1))
			c[i][j] = (mat1[i][j]) + (mat2[i][j]);   //n(1*m	
			System.out.println("a");
			System.out.print(c[i][j] + " ");		
			}
			System.out.println(" ");
			}
			System.out.println(" ");
		}
}
