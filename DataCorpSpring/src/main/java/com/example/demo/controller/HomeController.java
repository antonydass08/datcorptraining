package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ProductModel;
import com.example.demo.repo.ProductRepo;


@Controller
public class HomeController 
{
	@Autowired
	ProductRepo repo;
	
	@RequestMapping("/home")
	public String dispaly()
	{
		return "index1.jsp";
	}
	

	@RequestMapping("/putUsers")
	public String putUsers(ProductModel product)
	{
		repo.save(product);
		return "index1.jsp";
	}
	
	@ResponseBody
	@RequestMapping("displayUsers")
	public List<ProductModel> displayUsers()
	{
		return (List<ProductModel>) repo.findAll();
	}
	
    @ResponseBody
	@RequestMapping("getUsers")
	public Optional<ProductModel> displayOneId( int id)
	{
		return repo.findById(id);
	}
    
    @RequestMapping("modifyUsers")
    public String modifyUsers(int id)
    {
    	repo.deleteById(id);
    	return "showUsers.jsp";
    }
    
    @RequestMapping("deleteUser")
    public String deleteUser(int id)
    {
    	repo.deleteById(id);
    	return "deleteUser.jsp";
    }
	

	

}
