package com.dwaith.a2zgoogleapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a2zgoogle")
public class A2zgoogle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	
	@Column(name = "email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="confirmpassword")
	private String confirmpassword;
	
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "usr_ctr")
	private String catagory;
	
	
	  public A2zgoogle() {
	  
	  }
	 
	public A2zgoogle(String firstName, String password,String confirmpassword, String email,String url,String catagory) {
		super();
		this.firstName = firstName;
		this.password= password;
		this.confirmpassword=confirmpassword;
		this.email = email;
		this.url=url;
		this.catagory=catagory;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	

	
	
}
