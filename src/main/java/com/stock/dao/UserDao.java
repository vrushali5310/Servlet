package com.stock.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stock.Util.StockUtil;
import com.stock.dto.UserResponse;
import com.stock.model.User;


public class UserDao 
{
	PreparedStatement ps=null;
	public int registerUser(User user) throws Exception
	{
	 ps=StockUtil.getConnection().prepareStatement("insert into user(name,password,email,birthdate)values(?,?,?,?)");
	 ps.setString(1,user.getName());
	 ps.setString(2,user.getPassword());
	 ps.setString(3,user.getEmail());
	 ps.setString(4,user.getBirthdate());
	 int row=ps.executeUpdate();
	 return row;
	 
	}
	public UserResponse loginUser(User user) throws Exception 
	{
		ps=StockUtil.getConnection().prepareStatement("select * from user where email=? and password=?");
		ps.setString(1,user.getEmail());
		ps.setString(2,user.getPassword());
		
		ResultSet rs=ps.executeQuery();
		UserResponse userResponse=new UserResponse();
		User userresp=new User();
		while(rs.next()) {
			userresp.setEmail(rs.getString("email"));
			userresp.setPassword(rs.getString("password"));
			userresp.setName(rs.getString("name"));
			userresp.setBirthdate(rs.getString("birthdate"));
			
		}
		System.out.println(user);
		if(user.getEmail().equalsIgnoreCase(userresp.getEmail())&&user.getPassword().equals(userresp.getPassword())) {
			userResponse.setUser(userresp);
			userResponse.setStatus("success");
			return userResponse;	
		}
		else {
			userResponse.setUser(null);
			userResponse.setStatus("Fail");
			return userResponse;
		}
		
	}


		
	}
 

