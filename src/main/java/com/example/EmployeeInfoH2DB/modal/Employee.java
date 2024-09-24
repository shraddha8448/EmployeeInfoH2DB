package com.example.EmployeeInfoH2DB.modal;

import com.example.EmployeeInfoH2DB.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Employee_Table")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue
    private long empId;
    private String empName;
    private long empSalary;
    private String empDOB;
    private String empGender;
    private String empDepartment;

    public Employee(){

    }

    public Employee(EmployeeDTO employeeDTO){
        this.empName = employeeDTO.getEmpName();
        this.empSalary = employeeDTO.getEmpSalary();
        this.empDOB = employeeDTO.getEmpDOB();
        this.empGender = employeeDTO.getEmpGender();
        this.empDepartment = employeeDTO.getEmpDepartment();
    }

}


