package com.stock.dto;

import javax.servlet.http.HttpServletRequest;

import com.stock.model.User;

public class UserDto 
{

	public User register(HttpServletRequest request) 
	{
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		user.setEmail(request.getParameter("email"));
		user.setBirthdate(request.getParameter("birthdate"));
         return user;
    }

   	public User getUser(HttpServletRequest request) {
    User user=new User(request.getParameter("email"),request.getParameter("password"));
		return user;
	}
 
}
