package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;


@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@RequestMapping("/student")
	public String displayAll(Model model)
	{
		List<Student>list=service.displayAll();
		model.addAttribute("student", list);
		return "student";
	}
	
	@GetMapping("/student/new")
	public String registerStudent(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "register";
	}
	
	@PostMapping("/students")
	public String  saveStudent( @ModelAttribute("student")Student student)
	{
	
		service.saveStudent(student);
        return "redirect:/student";
	}
	
	@GetMapping("/students/edit/{id}")
	public String getStudentById(@PathVariable int id,Model model)
	{
		Student student=service.getById(id);
		model.addAttribute("student", student);
		return "editstudent";
	}
	
	@PostMapping("/students/{id}")

	public String UpdateStudent(@PathVariable int id,@ModelAttribute("student")Student student,Model model)

	{

		Student existStudent=service.getById(id);

		existStudent.setId(id);

		existStudent.setAddress(student.getAddress());

		existStudent.setFirstname(student.getFirstname());

		existStudent.setLastname(student.getLastname());

		service.saveStudent(existStudent);

		return "redirect:/student";

	}
	
	
	@GetMapping("/students/delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		service.deleteById(id);
		return "redirect:/student";
	}

	
	
	
}
