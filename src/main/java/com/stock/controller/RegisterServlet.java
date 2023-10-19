package com.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.dto.UserDto;
import com.stock.model.User;
import com.stock.service.UserService;
import com.stock.validation.InvalidDatabaseCredentials;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
           }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserDto userdto=new UserDto();
		User user = userdto.register(request);
		UserService userservice=new UserService();
		
		try {
			String status=userservice.resisterUser(user);
			if(status.equalsIgnoreCase("fail"))
				throw new InvalidDatabaseCredentials("please check your database credentials");
			else {
				  response.sendRedirect("login.html");
			     }
		    }catch(Exception e)
		{
		    	e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}