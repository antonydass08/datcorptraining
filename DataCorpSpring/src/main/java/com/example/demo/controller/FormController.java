package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Form;
import com.example.demo.repo.FormRepo;

@Controller
public class FormController 
{
  
	@Autowired
	FormRepo repo;
	
	@RequestMapping("showform")
	public String showForm()
	{
		return "form.jsp";
	}
	
	@RequestMapping("addForm")
	public String addForm(Form form)
	{
		repo.save(form);
		return "form1.jsp";
	}
	
	@ResponseBody
	@RequestMapping("getOneUser")
	public Optional<Form> getUser(int id)
	{
		return repo.findById(id);
	}
	
	@ResponseBody
	@RequestMapping("displayAll")
	public List<Form> displayAll()
	{
		return (List<Form>)repo.findAll();
	}
	
	
	
	
	
}
