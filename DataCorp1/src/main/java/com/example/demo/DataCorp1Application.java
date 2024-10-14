package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@SpringBootApplication
public class DataCorp1Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(DataCorp1Application.class, args);
	}
	
	@Autowired
    StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
		Student s1=new Student(1,"mettur","lee","antony");
		repo.save(s1);
		
		Student s2=new Student(2,"ammapettai","sri","kabilan");
		repo.save(s2);
	} 

}
