package com.example.EmployeeInfoH2DB.controller;

import com.example.EmployeeInfoH2DB.dto.EmployeeDTO;
import com.example.EmployeeInfoH2DB.modal.Employee;
import com.example.EmployeeInfoH2DB.service.EmployeeService;
import com.example.EmployeeInfoH2DB.service.IEmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
//@ResponceBody
public class TestController {

    @Autowired
    private IEmployeeService employeeService;

    //@RequestMapping(value = "/add",method = RequestMethod.POST)
    @PostMapping("/add")
    public EmployeeDTO add(@Valid @RequestBody EmployeeDTO employeeDTO){

        return employeeService.addEmployee(employeeDTO);
    }


    //@GetMapping("/getall")
    @RequestMapping(value = "/get all",method = RequestMethod.GET)
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/get/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PutMapping("/update/{id}")
    public EmployeeDTO updateEmployee( @PathVariable Long id, @Valid @RequestBody EmployeeDTO employeeDTO){


        return employeeService.updateEmployee(id,employeeDTO);
    }

    @DeleteMapping("/remove/{id}")
    public EmployeeDTO deleteUser(@PathVariable Long id, @Valid @RequestBody EmployeeDTO employeeDTO){

        return employeeService.deleteEmployee(id,employeeDTO);
    }

}
