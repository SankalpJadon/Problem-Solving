package random.numberProblems;


public class MissingNumberUnsorted {

	public static void main(String args[]){
		int A[]= new int[]{1,7,4,9,6,3,5,8,2};
		
		qsort(A,0,8);
		
	}
	
	public static void qsort(int[] a, int si, int ei){
	    //base case
	    if(ei<=si || si>=ei){}

	    else{ 
	        int pivot = a[si]; 
	        int i = si+1; int tmp; 

	        //partition array 
	        for(int j = si+1; j<= ei; j++){
	            if(pivot > a[j]){
	                tmp = a[j]; 
	                a[j] = a[i]; 
	                a[i] = tmp; 

	                i++; 
	            }
	        }

	        //put pivot in right position
	        a[si] = a[i-1]; 
	        a[i-1] = pivot; 
	        System.out.println(a[si]);
	        //call qsort on right and left sides of pivot
	        qsort(a, si, i-2); 
	        qsort(a, i, ei); 
	    }
	}
	
}
