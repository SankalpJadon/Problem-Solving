package random.fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLastLineOfFile {
public static void main(String[] ooo) throws IOException {
		
		String s = null,t=null;
		
		FileReader file = new FileReader("c:\\ok.txt");
		
		BufferedReader re = new BufferedReader(file);
		
		while((s = re.readLine()) != null )
		
		t = s;
		
		System.out.println(t);
		
		re.close();
	}
}
