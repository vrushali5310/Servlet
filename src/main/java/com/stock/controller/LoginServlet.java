package com.stock.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stock.dto.UserDto;
import com.stock.dto.UserResponse;
import com.stock.service.UserService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		UserDto userdto=new UserDto();
	 UserService userservice=new UserService();
	 
	try {
		UserResponse status=userservice.loginUser(userdto.getUser(request));
		HttpSession  session=request.getSession();
		if(status.getStatus().equalsIgnoreCase("success"))
			response.sendRedirect("profile.html");
			else
				response.sendRedirect("error.html");

		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
