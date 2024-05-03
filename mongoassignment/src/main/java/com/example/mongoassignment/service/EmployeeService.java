package com.example.mongoassignment.service;


import com.example.mongoassignment.entity.Employee;
import com.example.mongoassignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        employee.setId(ThreadLocalRandom.current().nextInt(1, 501)); // Generates a random integer between 1 and 500 (inclusive)
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }

}
