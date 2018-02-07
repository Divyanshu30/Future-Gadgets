package com.niit.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Authority implements Serializable
{
	@Id
	private long authorityId;
	private String rollName;
	private String userName;
	
	public Authority() {
		// TODO Auto-generated constructor stub
	}

	public long getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(long authorityId) {
		this.authorityId = authorityId;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
