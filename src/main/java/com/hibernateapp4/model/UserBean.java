package com.hibernateapp4.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class UserBean {

	@Id
	private int uid;

	private String uname;

	@OneToMany(mappedBy = "userBean")
	private Set<UserGroupBean> userGroupBeans;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set<UserGroupBean> getUserGroupBeans() {
		return userGroupBeans;
	}

	public void setUserGroupBeans(Set<UserGroupBean> userGroupBeans) {
		this.userGroupBeans = userGroupBeans;
	}

}
