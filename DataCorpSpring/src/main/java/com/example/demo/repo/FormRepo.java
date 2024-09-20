package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Form;

public interface FormRepo extends CrudRepository<Form, Integer>
{

}
