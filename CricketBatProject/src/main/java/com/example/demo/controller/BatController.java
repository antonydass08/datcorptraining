package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Bat;
import com.example.demo.service.BatService;

@Controller
public class BatController
{

	@Autowired
	private BatService service;
	
	@GetMapping("/bats")
	public String getAllBats(Model model)
	{
		List<Bat> list=service.getAllBats();
		model.addAttribute("bats", list);
		return "bat";
	}
	
	@GetMapping("/students/new")
	public String registerBat(Model model)
	{
		//creating Bat Object to hold the data
		Bat bat=new Bat();
		model.addAttribute("bat", bat);
		return "batregister";
		
		
	}
	
	@PostMapping("/students")
	public String saveBats(Bat bat)
	{
		service.saveBats(bat);
		return "redirect:/bats";
	}
	
	@GetMapping("/bats/edit/{id}")
	public String getBatById(@PathVariable("id") int id,Model model)
	{
		Bat bat=service.getBatById(id);
		model.addAttribute("bat", bat);
		return "editbat";
	}
	
	@PostMapping("/bats/{id}")
	public String saveEditedBat(@PathVariable("id") int id,@ModelAttribute("bat")Bat bat,Model model)
	{
		Bat existingbat=service.getBatById(id);
		existingbat.setPrice(bat.getPrice());
		existingbat.setName(bat.getName());
		existingbat.setWillow(bat.getWillow());
		service.saveBats(existingbat);
		return "redirect:/bats";
	}
	
	@RequestMapping("/bats/{id}")
	public String deleteBat(@PathVariable("id") int id)
	{
		service.deleteBat(id);
		return "redirect:/bats";
	}
			
		
}
