package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
    @Autowired
	EmployeeRepository repo;
    
    public List<Employee>getAllEmployee()
    {
    	return repo.findAll();
    }
    
    public Employee saveEmployee(Employee employee)
    {
    	return repo.save(employee);
    }
    
    public Employee editEmployee(int id)
    {
    	return repo.findById(id).get();
    }
    
    public Employee save(Employee employee)
    {
    	return repo.save(employee);
    }
}
