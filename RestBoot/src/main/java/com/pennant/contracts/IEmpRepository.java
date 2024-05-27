package com.pennant.contracts;

import java.util.List;

import com.pennant.Model.Employee;

public interface IEmpRepository {
	public List<Employee> getAllEmployees();

	public Employee getEmployeeByEmpNo(int eno);

	public void addEmployee(Employee e);

	public void deleteEmployee(int empno);

	public void updateEmployee(Employee emp);
}