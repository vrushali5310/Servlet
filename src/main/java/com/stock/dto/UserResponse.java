package com.stock.dto;

import com.stock.model.User;

public class UserResponse 
{ 
	private User user;
  private String status;

  public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "UserResponse [user=" + user + ", status=" + status + "]";
}
  
  

}
