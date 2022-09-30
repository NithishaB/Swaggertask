package com.sts.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Product;
import com.sts.rest.repository.ProductRepository;


@Service
public class ProductServices 
{
	@Autowired
	private ProductRepository serviceRepo;
	public List<Product> getAllProducts()
	{
		List<Product> list = new ArrayList<Product>();
		this.serviceRepo.findAll().forEach(list::add);//:: is a reference method
		return list;
		
	}
	public void addProduct(Product prod)
	{
		this.serviceRepo.save(prod);
		
	}
	public void updateProduct(Integer id,Product prod)
	{
		this.serviceRepo.save(prod);
	}
	public void deleteProduct(Integer id)
	{
		this.serviceRepo.deleteById(id);
	}
	
}


