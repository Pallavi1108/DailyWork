package cog.cognizant;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeeList {

	public static void main(String[] args) {

		ArrayList<Employeee> list = new ArrayList<>();
		addEmployees(list);
//		Collections.sort(list, new SortById());
	// 	SortById sbi = new SortById();
//		Collections.sort(list, sbi);
		//Collections.sort(list, new SortByName());
		Collections.sort(list, new SortByDesignation());
		for(Employeee emp : list) {
		 System.out.println(emp);
		}
	}

	private static void addEmployees(ArrayList<Employeee> list) {
		// TODO Auto-generated method stub
		Employeee emp1 = new Employeee(4234, "Vijay", "Bangalore", "Developer", 20, 41411.89, 7845878L);
		Employeee emp2 = new Employeee(2344, "Neeraj", "Mumbai", "oper", 21, 43411.89, 7878787428L);
		Employeee emp3 = new Employeee(3444, "Sakshi", "Indore", "javaDeveloper", 19, 23311.89, 78547878L);
		Employeee emp4 = new Employeee(4334, "Neha", "Pune", "Devops", 23, 48881.89, 75457878L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}