package com.example.mongoassignment.controller;


import com.example.mongoassignment.entity.Employee;
import com.example.mongoassignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/displayAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/display/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }


}
