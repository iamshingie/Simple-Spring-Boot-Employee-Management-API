package com.iamschingie.EmployeeManagementSystemAPI.EmployeeService;

import com.iamschingie.EmployeeManagementSystemAPI.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);

}
