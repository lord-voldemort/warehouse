package models;

import java.util.ArrayList;
import java.util.List;

import controllers.Products;

public class Product {

	public String ean;
	public String name;
	public String description;
	
	public Product() {}
	
	public Product(String ean, String name, String description){
		this.ean = ean;
		this.name = name;
		this.description = description;
	}
	
	public String toString(){
		return String.format("%s - %s", ean, name);
	}
	
	private static List<Product> products;
	
	static {
		products = new ArrayList<Product> ();
	}
	
}
