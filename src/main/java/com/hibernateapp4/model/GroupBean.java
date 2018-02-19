package com.hibernateapp4.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Groups")
public class GroupBean {

	@Id
	private int gid;

	private String gname;

	@OneToMany(mappedBy = "groupBean")
	private Set<UserGroupBean> userGroupBeans;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public Set<UserGroupBean> getUserGroupBeans() {
		return userGroupBeans;
	}

	public void setUserGroupBeans(Set<UserGroupBean> userGroupBeans) {
		this.userGroupBeans = userGroupBeans;
	}

}
