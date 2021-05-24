package com.iamschingie.EmployeeManagementSystemAPI.EmployeeRepository;

import com.iamschingie.EmployeeManagementSystemAPI.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
