package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bat;
import com.example.demo.repository.BatRepository;

@Service
public class BatService
{
	@Autowired
  private BatRepository repo;
	
	public List<Bat> getAllBats()
	{
		return repo.findAll();
	}
	
	public Bat saveBats(Bat bat)
	{
		return  repo.save(bat);
	}
	
	public Bat getBatById(int id)
	{
		return repo.findById(id).get();
		
	}
	
	public Bat saveEditedBat(Bat bat)
	{
		return repo.save(bat);
	}
	
	public void deleteBat(int id)
	{
		repo.deleteById(id);
	}
}
