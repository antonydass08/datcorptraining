package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController
{

	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
	public String getAllEmployee(Model model)
	{
		List<Employee>list=service.getAllEmployee();
		model.addAttribute("employee", list);
		return "Employee";
		
	}
	
	@GetMapping("/employee/new")
	public String newEmployee(Model model)
	{
		//creating employee object to store dummy values
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "employeelist";
	}
	
	@PostMapping("/employees")
	public String saveEmployees(Employee employee)
	{
		service.saveEmployee(employee);
		return "redirect:/employee";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployees(@PathVariable int id,Model model)
	{
		Employee employee=service.editEmployee(id);
		model.addAttribute("employee", employee);
		return "editEmployee";
		
	}
	

	@PostMapping("/employees/{id}")
	public String saveEditedBat(@PathVariable("id") int id,@ModelAttribute("employee")Employee employee,Model model)
	{
		Employee existingemp=service.editEmployee(id);
		existingemp.setEmail(employee.getEmail());
		existingemp.setFirstname(employee.getFirstname());
		existingemp.setLastname(employee.getLastname());
		service.saveEmployee(existingemp);
		return "redirect:/employee";
	}
	
}
