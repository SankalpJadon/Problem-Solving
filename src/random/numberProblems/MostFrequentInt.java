package random.numberProblems;

public class MostFrequentInt {
	
	public static void main(String args[]){
		int num;
		int count=0;
		int[] result= new int[2];
		int[] arr= new int[]{1,4,4,2,2,2,2,5,1,7,6,3,5,7,3,4,6};
		
			for(int i=0;i<arr.length;i++){
				num= arr[i];
				count=0;
				 for(int j=0;j<arr.length;j++){
					 if(num==arr[j]){
						 count++;
					 }
				 }
				  for(int x=0;x<arr.length;x++){
					  if(count>result[1]){
						result[0]=num;
						result[1]=count;
					  } 
				  }
			}	
		System.out.println(result[0]+" "+result[1]);
	}
	
}
