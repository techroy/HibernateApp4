package com.hibernateapp4.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserGroup")
public class UserGroupBean {

	@Id
	private int userGroupId;

	private String status;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName="uid")
	private UserBean userBean;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "group_id",referencedColumnName="gid")
	private GroupBean groupBean;

	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public GroupBean getGroupBean() {
		return groupBean;
	}

	public void setGroupBean(GroupBean groupBean) {
		this.groupBean = groupBean;
	}
	
	

}
