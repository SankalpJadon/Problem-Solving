package random.numberProblems;

public class LargestInArray {

	public static void main(String[] args){
		int[] a= new int[]{2,5,3,6,4};
		int largestNo=0;
		for(int i=0;i<a.length;i++){
			if(largestNo<a[i]){
				largestNo=a[i];
			}			
		}
		System.out.println("Largest no. is: "+largestNo);
	}
	
}
