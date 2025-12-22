package Controller;

import Model.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO {
	ArrayList<Employee> emplist=new ArrayList<Employee>();

	public EmployeeDAO() {
	    loadFromFile();
	}

	
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emplist.add(e);
		saveToFile();
		
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		for (Employee e : emplist) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;

		
		
	}

	public boolean updateEmployee(int id,double salary) {
		// TODO Auto-generated method stub
		for (Employee e:emplist) {
            if (e.getId() == id) {
            	e.setSalary(salary);
                return true;
            }
            
        }
		return false;
		
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		for (Employee e:emplist) {
            if (e.getId() == id) {
                emplist.remove(e);
                return true;
            }
        }
        return false;
		
	}

	public ArrayList<Employee> displayAll() {
	    return emplist;
	}

	
	public void saveToFile() {
	    try {
	    	 BufferedWriter bw=new BufferedWriter(new FileWriter("Employee.txt"));
	    	 bw.write("TYPE,ID,NAME,SALARY,EXTRA\n");

	         for(Employee e : emplist) {

	             String type = e.getClass().getSimpleName();
	             String extra = "";

	             if(e instanceof HR) {
	                 HR h = (HR)e;
	                 extra = "Commission:" + h.getCommission();
	             }
	             else if(e instanceof Admin) {
	                 Admin a = (Admin)e;
	                 extra = "Allowance:" + a.getAllowance();
	             }
	             else if(e instanceof SalesManager) {
	                 SalesManager s = (SalesManager)e;
	                 extra = "Target:" + s.getTarget() + ",Incentive:" + s.getIncentive();
	             }

	             bw.write(type + "," + e.getId() + "," + e.getName() + "," +
	                      e.getSalary() + "," + extra + "\n");
	         }
	    		 bw.close();
	    } catch (Exception ex) {
	        System.out.println("Error saving file: " + ex);
	    }
	}

	 void loadFromFile() {
	    try {
	        File f = new File("Employee.txt");
	        if (!f.exists()) 
	        {
	        	System.out.println("File not found");
	        	return;
	        }
	        BufferedReader br = new BufferedReader(new FileReader(f));
	        String line = br.readLine(); 
	        while ((line = br.readLine()) != null) {

	            String[] parts = line.split(",");

	            String type = parts[0];
	            int id = Integer.parseInt(parts[1]);
	            String name = parts[2];
	            double salary = Double.parseDouble(parts[3]);
	           String extra = parts[4];

	            Employee emp = null;

	            if (type.equals("HR")) {
	                double commission = Double.parseDouble(extra.split(":")[1]);
	                emp = new HR(id, name, salary, commission);
	            }
	            else if (type.equals("Admin")) {
	                double allowance = Double.parseDouble(extra.split(":")[1]);
	                emp = new Admin(id, name, salary, allowance);
	            }
	            else if (type.equals("SalesManager")) {
	                String[] arr = extra.split(",");
	                int target = Integer.parseInt(arr[0].split(":")[1]);
	                double incentive = Double.parseDouble(arr[1].split(":")[1]);

	                emp = new SalesManager(id, name, salary, target, incentive);
	            }

	            emplist.add(emp);
	        }


	        br.close();

	    } catch (Exception ex) {
	        System.out.println("Error loading file: " + ex);
	    }
	}


}