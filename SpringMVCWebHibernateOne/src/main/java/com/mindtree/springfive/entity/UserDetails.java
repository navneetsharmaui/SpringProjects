/**
 * 
 */
package com.mindtree.springfive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author M1044357
 *
 */
@Entity
@Table
public class UserDetails {
	@Column
	@Id
	private String userId;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String dateofjoining;
	@Column
	private String email;
	@Column
	private String role;
	private String project;

	public UserDetails() {
	}

	public UserDetails(String userId, String userName, String password, String dateofjoining, String email, String role,
			String project) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.dateofjoining = dateofjoining;
		this.email = email;
		this.role = role;
		this.project = project;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", password=" + password
				+ ", dateofjoining=" + dateofjoining + ", email=" + email + ", role=" + role + ", project=" + project
				+ "]";
	}

}