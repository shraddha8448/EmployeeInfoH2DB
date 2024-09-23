package com.example.EmployeeInfoH2DB.modal;

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

public class Employee {
    @Id
    @GeneratedValue
    private long empId;
    private String empName;
    private long empSalary;
    private String empDOB;
    private String empGender;
    private String empDepartment;

    public Employee(long empId, String empName, long empSalary, String empDOB, String empGender, String empDepartment) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDOB = empDOB;
        this.empGender = empGender;
        this.empDepartment = empDepartment;
    }

    public Employee() {
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(String empDOB) {
        this.empDOB = empDOB;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }
}


