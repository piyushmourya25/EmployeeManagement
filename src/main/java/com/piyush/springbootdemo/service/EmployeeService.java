package com.piyush.springbootdemo.service;

import java.util.List;

import com.piyush.springbootdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> retriveEmployees();

	public Employee getEmployee(Long employeeId);

	public void saveEmployee(Employee employee);

	public void deleteEmployee(Long employeeId);

	public void updateEmployee(Employee employee);

}
