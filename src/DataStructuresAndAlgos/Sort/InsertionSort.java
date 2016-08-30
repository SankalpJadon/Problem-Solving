package DataStructuresAndAlgos.Sort;

public class InsertionSort {
	public static void main(String[] args) {
				
		int[] abc={1,2,7,3,9,9,3,5};
		int[] sortedarray= sort(abc);
		for(int i=0;i<abc.length;i++){
			System.out.println(sortedarray[i]);
		}
	}
	public static int[] sort(int[] input) {
        int len = input.length;
        if (len == 1) {
            return input;
        } 
        else {
            for (int i = 1; i < len; i++) {
               int j=i;
                if(input[i]>=input[i-1]){
                    j--;
                }
                else{
                    while(j>0){
                        if(input[j]>input[j-1]){
                            break;
                        }
                        else{
                            input=swap(input,j,j-1);
                            j--;
                        }
                    }
                } 
            }
        }
        return input;
    }

    public static int[] swap(int[] array, int j, int i) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
