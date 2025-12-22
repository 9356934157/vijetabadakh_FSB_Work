import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class printer {
	private String fName;
	private String lName;
	private boolean fnameReady = false;
	
	public  synchronized void setFName(String str) {
		while (fnameReady) {
            try { 
            	wait(); 
            } catch (Exception e) {
            	
            }
        }
        this.fName = str;
        fnameReady = true;
        notifyAll();
    }
	
	public synchronized void setLName(String str) {
		  while (!fnameReady) {
	            try { 
	            	wait();
	            } catch (Exception e) {
	            	
	            }
	        }
	        this.lName = str;
	        System.out.println(fName + " " + lName);
	        fnameReady = false;
	        notifyAll();
	    }
	
	public synchronized void setLastName(String str) {
		System.out.println("FirstName");
	}
}

public class Test {
	public static void main(String[] args) {
	
		 printer np = new printer();
		 
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					BufferedReader b1= new BufferedReader(new FileReader("src/fName.txt"));
					String fName= null;
				//	b1.close();
					
						while((fName=b1.readLine())!=null) {
							System.out.println(fName);
							np.setFName(fName);
							
					} 
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					BufferedReader b1= new BufferedReader(new FileReader("src/lName.txt"));
					String lName= null;
					//b1.close();
					
						while((lName=b1.readLine())!=null) {
							System.out.println(lName);	
							np.setLName(lName);
					} 
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
		}).start();
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		FirstName fn = new FirstName();
		fn.start();
		LastName ln= new LastName();
		ln.start();

	}

}
