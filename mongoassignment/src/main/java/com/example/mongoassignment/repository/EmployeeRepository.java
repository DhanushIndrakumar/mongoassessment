package com.example.mongoassignment.repository;

import com.example.mongoassignment.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
