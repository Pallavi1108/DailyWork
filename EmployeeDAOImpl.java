package cog.clas.practice;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDAOImpl {
	static ArrayList<Employee> employees = null;
	static {
		employees = new ArrayList<>();
		Employee emp1 = new Employee(101,"Abhinav", "Indore", "Digital Marketing", 23, 50000, 7000505030L);
		Employee emp2 = new Employee(102,"Pallavi", "Rewa", "Java Developer", 22, 25000, 7000505040L);
		Employee emp3 = new Employee(103,"Nikhil", "Jabalpur", "Phython Developer", 21, 30000, 7000404030L);
		Employee emp4 = new Employee(104,"Satyam", "Hoshangabad", "Java Developer", 24, 28000, 7000505060L);
		Employee emp5 = new Employee(105,"Mrinal", "Damoh", "Testing", 24, 20000, 7000705030L);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		}
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	public void deleteEmployee(Employee emp) {
		employees.remove(emp);
	}
	public void updateEmployee(Employee emp) {
		emp.setName(emp.name);
	}
	public Employee getEmployeeById(int id) {
		for(Employee e : employees) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null; 
	}
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}
	

	}

