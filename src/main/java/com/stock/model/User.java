package com.stock.model;

public class User 
{ private String name;
  private String password;
  private String email;
  private String birthdate;

  public User(String name, String password, String email, String birthdate) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.birthdate = birthdate;
}
  
public User(String email, String password) {
	super();
	this.password = password;
	this.email = email;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getBirthdate() {
	return birthdate;
}
public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}

@Override
public String toString() {
	return "User [name=" + name + ", password=" + password + ", email=" + email + ", birthdate=" + birthdate + "]";
}

public User() {
	super();
}
  
  
 }
