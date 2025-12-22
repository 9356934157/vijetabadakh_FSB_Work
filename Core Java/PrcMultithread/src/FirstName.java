import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FirstName extends Thread {
	public void run() {
		try {
			BufferedReader b1= new BufferedReader(new FileReader("src/fName.txt"));
			String fName= null;
		//	b1.close();
			
				while((fName=b1.readLine())!=null) {
					System.out.println(fName);
					
			} 
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
