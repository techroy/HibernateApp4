package com.hibernateapp4.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "customer_type", length = 10, discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "customer")
/*****************************************/

@Inheritance(strategy=InheritanceType.JOINED)
public class Customer {

	@Column(name = "cid")
	@Id
	private int id;

	@Column(name = "cname")
	private String name;

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

}
