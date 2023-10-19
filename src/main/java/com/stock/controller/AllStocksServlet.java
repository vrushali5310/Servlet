package com.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.Util.StockUtil;

@WebServlet("/allstocks")
public class AllStocksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public AllStocksServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  

	  try {
		    response.setContentType("text/html");
		   
            PreparedStatement ps=StockUtil.getConnection().prepareStatement("select *from stockdetails");
             ResultSet rs=ps.executeQuery();
       	  PrintWriter pw=response.getWriter();
             pw.println("<html>");
             pw.println("<body>");
             pw.println("<table border='1'>");
             pw.println("<h1>Stock List</h1>");
             pw.println("<tr>");
             pw.println("<th>stockname</th>");
             pw.println("<th>symbol</th>");
             pw.println("<th>currentprice</th>");
             pw.println("<th>Add To Watchlist</th>");
             pw.println("</tr>");
             
             
             while(rs.next()) {
            	pw.println("<tr>");
            	pw.println("<td>"+rs.getString(1)+"</td>");
            	pw.println("<td>"+rs.getString(2)+"</td>");
            	pw.println("<td>"+rs.getFloat(3)+"</td>");
            	//pw.println("<td><a href='addwatchlist?")
            	//pw.print("<td>"+"<input type='button' value='Add'>"+"</td>");
            	pw.println("</tr>");


            	 }
               pw.println("</table></body></html>");
                }catch(SQLException e) {
			  e.printStackTrace();
		  } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
