package com.stock.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.dto.StockDto;
import com.stock.model.Stock;
import com.stock.service.StockService;
import com.stock.validation.InvalidDatabaseCredentials;

@WebServlet("/stockdetails")
public class StockDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StockDetailsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Success Values Added in: ").append(request.getContextPath());
	
		StockDto stockdto=new StockDto();
		Stock stock= stockdto.resister(request);
		StockService stockservice=new StockService();
		
		try {
			String status=stockservice.resisterUser(stock);
			if(status.equalsIgnoreCase("fail"))
				throw new InvalidDatabaseCredentials("please check your database credentials");
			else {
				  response.sendRedirect("stockadd.html");
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
