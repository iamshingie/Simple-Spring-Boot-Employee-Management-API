package com.iamschingie.EmployeeManagementSystemAPI.EmployeeServiceImpl;

import com.iamschingie.EmployeeManagementSystemAPI.EmployeeRepository.EmployeeRepo;
import com.iamschingie.EmployeeManagementSystemAPI.EmployeeService.EmployeeService;
import com.iamschingie.EmployeeManagementSystemAPI.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeId(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
    }
}
