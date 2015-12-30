package com.practice;

import java.util.ArrayList;

class Product{
	String name;
	double price;
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
}

public class PriceOfProducts {

	static ArrayList<Product> productlist = new ArrayList<>();
	public static void main(String[] args) {
		Product p1 = new Product("Suger", 100);
		productlist.add(p1);
		Product p2 = new Product("Rice", 110.50);
		productlist.add(p2);
		Product p3 = new Product("Milk powder", 350);
		productlist.add(p3);
		
		for (int i = 0; i < productlist.size(); i++) {
			System.out.println(productlist.get(i).name+"   "+productlist.get(i).price);
		}

	}
	

}
