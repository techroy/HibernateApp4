package com.hibernateapp4.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentBean {

	@Id
	private int sid;

	private String sname;

	private int roll;

	@OneToMany(targetEntity = PhoneBean.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name = "stu_id", referencedColumnName = "sid")
	private Set<PhoneBean> phoneBeans;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Set<PhoneBean> getPhoneBeans() {
		return phoneBeans;
	}

	public void setPhoneBeans(Set<PhoneBean> phoneBeans) {
		this.phoneBeans = phoneBeans;
	}

	@Override
	public String toString() {
		return "StudentBean [sid=" + sid + ", sname=" + sname + ", roll=" + roll + ", phoneBeans=" + phoneBeans + "]";
	}



}
