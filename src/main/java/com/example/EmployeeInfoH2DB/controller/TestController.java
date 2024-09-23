package com.example.EmployeeInfoH2DB.controller;

import com.example.EmployeeInfoH2DB.modal.Employee;
import com.example.EmployeeInfoH2DB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
//@ResponceBody
public class TestController {

    @Autowired
    private EmployeeService employeeService;

    //@RequestMapping(value = "/add",method = RequestMethod.POST)
    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
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
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){

        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/{id}")
    public Employee deleteUser(@PathVariable Long id, @RequestBody Employee employee){

        return employeeService.deleteEmployee(id,employee);
    }

}
