package com.example.EmployeeInfoH2DB.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    @NotEmpty(message="Emploee Name should not be empty")
    private String empName;

    @NotNull(message = "Employee salary should not be null")
    private long empSalary;

    @Past(message = "Employee birth date must be past")
    private LocalDate empDOB;

    @NotEmpty(message = "Gender should not be empty")
    private String empGender;

    @NotEmpty(message = "Emploee Department name should not be empty")
    private String empDepartment;

    @Email(message = "Incorrect mail")
    private String empEmail;

    @PastOrPresent(message = "Registration date must be past or present")
    private LocalDate registrationDate;

    @Future
    private LocalDate eventDate;

}
