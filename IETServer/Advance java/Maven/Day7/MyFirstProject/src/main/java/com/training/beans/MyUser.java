package com.training.beans;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MyUserTab")
public class MyUser {
	@Id
	private int id;
	private String name;
	private String mobile;
	private String email;
	
	public MyUser() {
		super();
	}

	public MyUser(int id, String name, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}

	
}
