package com.example.EmployeeInfoH2DB.modal;

import com.example.EmployeeInfoH2DB.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Employee_Table")
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue
    private long empId;
    private String empName;
    private long empSalary;
    private LocalDate empDOB;
    private String empGender;
    private String empDepartment;
    private String empEmail;
    private LocalDate registrationDate;
    private LocalDate eventDate;

    @ElementCollection
    @CollectionTable(name = "phone_data", joinColumns = @JoinColumn(name = "id"))
    private List<String> phoneNo;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Address> address;


    public Employee(EmployeeDTO employeeDTO){
        this.empName = employeeDTO.getEmpName();
        this.empSalary = employeeDTO.getEmpSalary();
        this.empDOB = employeeDTO.getEmpDOB();
        this.empGender = employeeDTO.getEmpGender();
        this.empDepartment = employeeDTO.getEmpDepartment();
        this.empEmail = employeeDTO.getEmpEmail();
        this.registrationDate = employeeDTO.getRegistrationDate();
        this.eventDate = employeeDTO.getEventDate();
    }

}


