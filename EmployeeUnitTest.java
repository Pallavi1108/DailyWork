package com.training.twenteight;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.DAO.EmployeeDAO;
import com.cts.training.DAO.EmployeeDAOImpl;
import com.cts.training.bean.Employee;

public class EmployeeUnitTest {
	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
	}
@Ignore
	@Test
	public void test_add_employee_success() {
		Employee emp = new Employee(111, "Mrinal", "Damoh", 23, 12433244L, "Testing", 21700);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}
@Ignore
	@Test
	public void test_get_employee_by_id_success() {
		Employee emp = employeeDAO.getEmployeeById(1);
		assertEquals("nimi", emp.getName());
	}
@Ignore
	@Test
	public void test_get_all_employees_success() {
		List<Employee> list = employeeDAO.getAllEmployees();
		assertEquals("Mrinal", list.get(4).getName());	
	}
	@Test
	public void test_delete_employee_success() {
		Employee emp = employeeDAO.getEmployeeById(111);
		assertEquals(true, employeeDAO.deleteEmployee(emp));
	}
}
