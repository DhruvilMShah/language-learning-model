package com.bits.wilp.fsa.langLearnModel.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

	public Users(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Users() {
	}
}
