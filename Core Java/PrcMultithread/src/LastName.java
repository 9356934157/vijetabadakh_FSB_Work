import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LastName extends Thread {
	public void run() {
		try {
			BufferedReader b1= new BufferedReader(new FileReader("src/lName.txt"));
			String lName= null;
			//b1.close();
			
				while((lName=b1.readLine())!=null) {
					System.out.println(lName);	
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
