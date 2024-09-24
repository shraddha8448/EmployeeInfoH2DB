package com.example.EmployeeInfoH2DB.service;

import com.example.EmployeeInfoH2DB.dto.EmployeeDTO;
import com.example.EmployeeInfoH2DB.modal.Employee;

import java.util.List;

public interface IEmployeeService {

    EmployeeDTO addEmployee(EmployeeDTO employee);

    List<Employee> getAllEmployee();

    EmployeeDTO getById(Long id);

    EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO);

    EmployeeDTO deleteEmployee(Long id, EmployeeDTO employeeDTO);
}
