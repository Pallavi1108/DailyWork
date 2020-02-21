package cog.clas.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EmployeeController {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
		
		int continue_loop = 1;
	
		
		
		EmployeeDAOImpl eObj = new EmployeeDAOImpl();
		List<Employee> list = eObj.getAllEmployees();
	
		System.out.println("-----Employee Management-----");
		System.out.println("Operations:");
		
	
		
	
		System.out.println("Press 1 to Add Employee");
		System.out.println("Press 2 to Update");
		System.out.println("Press 3 to Remove");
		System.out.println("Press 4 to Get Employee By Id");
		System.out.println("Press 5 to Display All Employees");
		System.out.println("Press 6 to Exit");
		
		int i = Integer.parseInt(buf.readLine());
		
		switch(i) {
		case 1 : 
			System.out.println("Enter Employee Id:");
			int id = Integer.parseInt(buf.readLine());
			System.out.println("Enter Employee Name:");
			String nm = buf.readLine(); 
			System.out.println("Enter Employee Address:");
			String ad = buf.readLine();
			System.out.println("Enter Designation:");
			String ds = buf.readLine();
			System.out.println("Enter Employee Age:");
			int ag = Integer.parseInt(buf.readLine());
			System.out.println("Enter Employee Salary:");
			double sal = Double.parseDouble(buf.readLine());
			System.out.println("Enter Employee Phone Number:");
			long ph = Long.parseLong(buf.readLine());
			
			
			Employee ep = new Employee(id,nm,ad,ds,ag,sal,ph);
			eObj.addEmployee(ep);
			System.out.println("Do you want to continue press 1 else 0");
			int p = Integer.parseInt(buf.readLine());
			if(p == 1) { 
				continue_loop = 1;
			}
			else
				continue_loop = 0;
			break;
				
			
		}
	}
}
	
	



