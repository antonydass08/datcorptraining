package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.ProductModel;

public interface ProductRepo extends CrudRepository<ProductModel, Integer> {

}
