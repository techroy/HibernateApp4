package com.hibernateapp4.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop extends Product {

	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
