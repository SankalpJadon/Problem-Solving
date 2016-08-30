package DataStructuresAndAlgos.Search;

public class BinarySearch {
	boolean result= false;
	boolean search(int num, int[] arr, int beg,int end){
		int mid= beg+(end-beg)/2;
		if(num!=arr[mid]){
			while(arr[mid]!=num){
				if(num<arr[mid]){
					end=mid;
					search(num,arr,beg,end);
					break;
				} 
				else{
					beg=mid+1;
					search(num,arr,beg,end);
				}
				result= false;
				break;
			}		
		}
		else{
		  result= true;
		}
		return result;
	}
	public static void main(String args[]){
		int[] array= new int[]{3,6,7,9,10,12,15,20};
		int element= 3;
		int beg=0;
		int end= array.length-1;
		BinarySearch bs= new BinarySearch();
		boolean result= bs.search(element, array, beg, end);
		System.out.println("The result is: "+result);
	}	
}
