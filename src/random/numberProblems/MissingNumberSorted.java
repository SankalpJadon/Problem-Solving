package random.numberProblems;


public class MissingNumberSorted {

	public static void main(String args[]){
		int[] a= new int[10];
		a[0]= 0;
		a[1]= 1;
		a[2]= 2;
		a[3]= 0;
		a[4]= 4;
		a[6]= 6;
		a[7]= 7;
		a[8]= 8;
		a[9]= 9;
		for(int i=0;i<a.length;i++){
			if((i^a[i])!=0){
				System.out.println(i+" is the missing number");
			}
		}
	}
}
