package randomInterviewQs.amazons;

public class AmazonLocker {
	  public static void main(String args[]){
		  int cityWidth=3;
		  int cityLength=5;
		  int[] xCordinates ={1};
		  int[] yCordinates={1};
		  int[][] resCoordinates= printMatrix(cityWidth,cityLength,xCordinates,yCordinates);
		  for(int i=0;i<cityLength;i++){
			  for(int j=0;j<cityWidth;j++){
				  System.out.print(resCoordinates[i][j]);
			  }
			  System.out.println();
		  }
	  }
	  public static int[][] printMatrix(int cityWidth,int cityLength,int[] xCo,int[] yCo){
		  int[][] result= new int[cityLength][cityWidth];
		  for(int i=0;i<cityLength;i++){
			  for(int j=0;j<cityWidth;j++){
				  result[i][j]= getDistance(i,j,xCo,yCo);
			  }
		  }
		  return result;
	  }
	  public static int getDistance(int i,int j,int[] xCo,int[] yCo){
		  int distance=Integer.MAX_VALUE;
		  int totalLockers= xCo.length;
		  for(int k=0;k<totalLockers;k++){
			  int x=xCo[k];
			  int y=yCo[k];
			  int tempDist=Math.abs(x-i-1)+Math.abs(y-j-1);
			  if(tempDist<distance){
				  distance=tempDist;
			  }
		  }
		  return distance;		  
	  }
}
