package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bat 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String name;
   private String willow;
   private int price;
public Bat() {
	super();
}
public Bat(String name, String willow, int price) {
	super();
	this.name = name;
	this.willow = willow;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWillow() {
	return willow;
}
public void setWillow(String willow) {
	this.willow = willow;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
   
   
   
}
