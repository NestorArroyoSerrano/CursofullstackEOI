package com.nestor.entidades;

import java.util.Objects;

public class Product {
	
	private int id;
	private String reference;
	private String name;
	private double price;
	private int category;
	

	
	public Product() {
		
	}



	public Product(int id, String reference, String name, double price, int category) {
		super();
		this.id = id;
		this.reference = reference;
		this.name = name;
		this.price = price;
		this.category = category;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getReference() {
		return reference;
	}



	public void setReference(String reference) {
		this.reference = reference;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getCategory() {
		return category;
	}



	public void setCategory(int category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", reference=" + reference + ", name=" + name + ", price=" + price + ", category="
				+ category + ", getId()=" + getId() + ", getReference()=" + getReference() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, reference);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(reference, other.reference);
	}
	
}
