package com.hibernateapp4.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("regular")
@Table(name="Regular")
@PrimaryKeyJoinColumn(name="reg_id")
public class RegularCustomer extends Customer{

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
