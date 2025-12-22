package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Model.Employee;

public class EmployeeController {
	
	EmployeeDAO ed=new EmployeeDAO();
	
//	public EmployeeController() {
//	    ed.loadFromFile();
//	}
//	
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		ed.addEmployee(e);
		
	}

	public Employee searchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e1=ed.searchEmployee(id);
		if(e1!=null) {
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		if(ed.updateEmployee(id,salary)) {
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(ed.deleteEmployee(id)) {
			return true;
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.displayAll();
		
	}
	public void saveToFile() {
        ed.saveToFile();
    }

    public void loadFromFile() {
        ed.loadFromFile();
    
    	}

    }

	


