package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
   StudentRepository repo;
	
	public List<Student> displayAll()
	{
		return repo.findAll();
	}
	
	public Student saveStudent(Student student)
	{
		return repo.save(student);
	}
	
	public Student getById(int id)
	{
		 return repo.findById(id).get();
	}
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}

   
}
