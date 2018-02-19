package com.hibernateapp4.model;

import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Address")
public class AddressBean {

	@Id
	private int addrId;

	private String streetNo;

	private String city;

	@OneToOne(targetEntity = StudentBean.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "stdid", referencedColumnName = "sid")
	private StudentBean studentBean;

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}

	@Override
	public String toString() {
		return "AddressBean [addrId=" + addrId + ", streetNo=" + streetNo + ", city=" + city + ", studentBean="
				+ studentBean + "]";
	}

}
