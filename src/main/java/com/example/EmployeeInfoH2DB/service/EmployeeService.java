package com.example.EmployeeInfoH2DB.service;

import com.example.EmployeeInfoH2DB.modal.Employee;
import com.example.EmployeeInfoH2DB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){

       return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getById(Long id){
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee Id Not Found"));

    }

    public Employee updateEmployee(Long id, Employee employee){
        Employee emp_data = getById(id);
        if(emp_data != null){
            emp_data.setEmpName(employee.getEmpName());
            emp_data.setEmpSalary(employee.getEmpSalary());
            emp_data.setEmpDOB(employee.getEmpDOB());

            return employeeRepository.save(emp_data);
        }
        return null;
    }

    public Employee deleteEmployee(Long id, Employee employee){
        Employee emp_data = getById(id);
        if(emp_data != null){
            employeeRepository.deleteById(id);
            return emp_data;
        }
        return null;
    }

}
