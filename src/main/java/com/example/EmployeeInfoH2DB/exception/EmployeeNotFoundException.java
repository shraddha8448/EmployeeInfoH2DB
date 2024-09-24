package com.example.EmployeeInfoH2DB.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Employee with ID " + id + " not found");
    }
}
