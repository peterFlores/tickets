package com.umg.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 631331153675308321L;

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	
	@Column(name = "USER_RED")
	private String userRed;
	
	@Column(name = "USER_CODE")
	private String userCode;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_PASS")
	private String userPass;
	
	@Column(name = "USER_STATUS")
	private String userStatus;
	
	@ManyToOne
	@JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
	private Role role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getUserRed() {
		return userRed;
	}

	public void setUserRed(String userRed) {
		this.userRed = userRed;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
}
