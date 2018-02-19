package com.hibernateapp4.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Pen")
public class Pen extends Product {

	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
