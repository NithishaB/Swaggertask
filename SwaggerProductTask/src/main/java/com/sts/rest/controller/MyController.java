package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Product;
import com.sts.rest.service.ProductServices;
@RestController
public class MyController 
{
	@Autowired
	private  ProductServices service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product prod)
	{
		this.service.addProduct(prod);
	}
	@PutMapping("/product/{prodid}")
	public void updateProduct(@PathVariable String prodid,@RequestBody Product prod)
	{
		this.service.updateProduct(Integer.parseInt(prodid), prod);
	}
	@DeleteMapping("delproduct/{prodid}")
	public void deleteProduct(@PathVariable int prodid)
	{
		this.service.deleteProduct(prodid);
	}
}
