package com.example.EmployeeInfoH2DB.dto;

import com.example.EmployeeInfoH2DB.modal.Address;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;


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


    private List<String> phoneNo;
    private List<Address> address;
}
