package cog.cognizant;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<EmployeeDAOImpl> list = new ArrayList<>();
		addEmployees(list);
		for(EmployeeDAOImpl emp : list) {
		 System.out.println(emp);
		}
	}

	private static void addEmployees(ArrayList<EmployeeDAOImpl> list) {
		// TODO Auto-generated method stub
		EmployeeDAOImpl emp1 = new EmployeeDAOImpl(4234, "Vijay", "Bangalore", "Developer", 20, 41411.89, 7845878L);
		EmployeeDAOImpl emp2 = new EmployeeDAOImpl(2344, "Neeraj", "Mumbai", "oper", 21, 43411.89, 7878787428L);
		EmployeeDAOImpl emp3 = new EmployeeDAOImpl(3444, "Sakshi", "Indore", " javaDeveloper", 19, 23311.89, 78547878L);
		EmployeeDAOImpl emp4 = new EmployeeDAOImpl(4334, "Neha", "Pune", "Devops", 23, 48881.89, 75457878L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}