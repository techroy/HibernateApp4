package com.hibernateapp4.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Phone")
public class PhoneBean {

	@Id
	@Column(name = "ph_id")
	private int phId;

	@Column(name = "phn_number")
	private String phonNumber;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "stu_id", referencedColumnName = "sid")
	private StudentBean studentBean;

	public int getPhId() {
		return phId;
	}

	public void setPhId(int phId) {
		this.phId = phId;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}

	@Override
	public String toString() {
		return "PhoneBean [phId=" + phId + ", phonNumber=" + phonNumber + "]";
	}

}
