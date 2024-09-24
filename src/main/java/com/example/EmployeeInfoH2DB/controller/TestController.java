package com.example.EmployeeInfoH2DB.controller;

import com.example.EmployeeInfoH2DB.dto.EmployeeDTO;
import com.example.EmployeeInfoH2DB.modal.Employee;
import com.example.EmployeeInfoH2DB.service.EmployeeService;
import com.example.EmployeeInfoH2DB.service.IEmployeeService;
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
    public EmployeeDTO add(@RequestBody EmployeeDTO employeeDTO){

        return employeeService.addEmployee(employeeDTO);
    }

//    @GetMapping("/get")
//    public List<Employee> getAll(){
//         return employeeService.getAllEmployee();
//    }

    //@GetMapping("/getall")
    @RequestMapping(value = "/get all",method = RequestMethod.GET)
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO){


        return employeeService.updateEmployee(id,employeeDTO);
    }

    @DeleteMapping("/{id}")
    public EmployeeDTO deleteUser(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO){

        return employeeService.deleteEmployee(id,employeeDTO);
    }

}
