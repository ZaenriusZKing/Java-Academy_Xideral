package com.hospitalApp.service;

import com.hospitalApp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee findEmployeeById(int id);
    void saveEmployee(Employee employee);
    boolean deleteEmployeeById(int id);
}
