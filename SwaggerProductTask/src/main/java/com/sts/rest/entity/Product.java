package com.sts.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	private int productId;
	private String productCategory;
	private String productName;
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int productId, String productCategory, String productName, double price) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productName = productName;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCategory=" + productCategory + ", productName="
				+ productName + ", price=" + price + "]";
	}
	
}
