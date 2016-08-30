package random.fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadLast3LinesOfFile {

	public static void main(String[] ooo) throws IOException {/*
		String s;		
		int count=0;
		ArrayList< String > arr = new ArrayList<String>();
		FileReader file = new FileReader("c:\\ok.txt");
		BufferedReader re = new BufferedReader(file);		
		while((s = re.readLine()) != null )	
			if(arr.size()<=3){			
				arr.set(count, s);			
				count++;				
			}		
			else{	
				arr.set(0, null);
				for(int i=0;i<3;i++){					
					String next= arr.get(i);					
					arr.set(i+1, next);
				}				
				arr.set(count, s);
			}		
			System.out.println(arr);	
			re.close();
	 */
		//More enhanced version of the solution
		FileReader file = new FileReader("c:\\ok.txt");
		BufferedReader bufferedReader = new BufferedReader(file);		
		String[] lines = new String[3];
		int count = 0;
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			lines[count % lines.length] = line;
			count++;
		}
		System.out.println(Arrays.toString(lines));
	}
}
