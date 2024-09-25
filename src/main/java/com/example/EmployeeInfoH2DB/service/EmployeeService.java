package com.example.EmployeeInfoH2DB.service;

import com.example.EmployeeInfoH2DB.dto.EmployeeDTO;
import com.example.EmployeeInfoH2DB.exception.EmployeeNotFoundException;
import com.example.EmployeeInfoH2DB.modal.Employee;
import com.example.EmployeeInfoH2DB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements  IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    // add Employee Info in DB
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO){

        Employee employee = new Employee(employeeDTO);
       return mapToDTO(employeeRepository.save(employee));
    }

    // convert to the DTO
    private EmployeeDTO mapToDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpName(employee.getEmpName());
        employeeDTO.setEmpSalary(employee.getEmpSalary());
        employeeDTO.setEmpDOB(employee.getEmpDOB());
        employeeDTO.setEmpGender(employee.getEmpGender());
        employeeDTO.setEmpDepartment(employee.getEmpDepartment());
        employeeDTO.setEmpEmail(employee.getEmpEmail());
        employeeDTO.setRegistrationDate(employee.getRegistrationDate());
        employeeDTO.setEventDate(employee.getEventDate());
        return employeeDTO;
    }


    // Retrive all Employee Info
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    // retrive employee data by Id
    public EmployeeDTO getById(Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
        return mapToDTO(employee);
    }

    // updating Employee Info
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employeeDTO) {
        // Fetch the existing employee entity from the repository using the id
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        // Update the existing employee's details
        existingEmployee.setEmpName(employeeDTO.getEmpName());
        existingEmployee.setEmpSalary(employeeDTO.getEmpSalary());
        existingEmployee.setEmpDOB(employeeDTO.getEmpDOB());
        existingEmployee.setEmpGender(employeeDTO.getEmpGender());
        existingEmployee.setEmpDepartment(employeeDTO.getEmpDepartment());
        existingEmployee.setEmpEmail(employeeDTO.getEmpEmail());
        existingEmployee.setRegistrationDate(employeeDTO.getRegistrationDate());
        existingEmployee.setEventDate(employeeDTO.getEventDate());

        // Save the updated employee entity
        Employee updatedEmployee = employeeRepository.save(existingEmployee);

        // Convert the updated employee entity back to DTO and return it
        return mapToDTO(updatedEmployee);
    }


    public EmployeeDTO deleteEmployee(Long id, EmployeeDTO employeeDTO){

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        // remove the Employee
        employeeRepository.deleteById(id);
        return mapToDTO(existingEmployee);
    }

}
