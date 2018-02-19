package com.hibernateapp4.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("corporate")
@Table(name="Corporate")
@PrimaryKeyJoinColumn(name="cor_id")
public class CorporateCustomer extends Customer {

	@Column(name="org_name")
	private String organizationName;

	private String salary;

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
