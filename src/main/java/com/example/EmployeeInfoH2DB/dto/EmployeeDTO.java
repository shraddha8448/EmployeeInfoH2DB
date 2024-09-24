package com.example.EmployeeInfoH2DB.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private String empName;
    private long empSalary;
    private String empDOB;
    private String empGender;
    private String empDepartment;


}
