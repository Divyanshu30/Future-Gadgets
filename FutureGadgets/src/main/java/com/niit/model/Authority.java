package com.niit.model;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Authority implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorityId;
	private String roleName;
	private String userName;
	
	public Authority() {
		// TODO Auto-generated constructor stub
	}

	public int getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String userName() {
		return userName;
	}

	public void setUserName(String userPhNo) {
		this.userName = userPhNo;
	}
	
	
}
