package random.numberProblems;


public class Swap {

	public static void main(String[] args){
		int a[]= new int[2];
		a[0]= 3;
		a[1]= 7;
		System.out.println("Before sorting: "+a[0]+" "+a[1]);
		a[0]= a[0]+a[1];
		a[1]= a[0]-a[1];
		a[0]= a[0]-a[1];
		System.out.println("After sorting: "+a[0]+" "+a[1]);
	}
	
}
 