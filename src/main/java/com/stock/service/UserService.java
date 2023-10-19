package com.stock.service;


import com.stock.dao.UserDao;
import com.stock.dto.UserResponse;
import com.stock.model.User;

public class UserService 
{
	UserDao userdao=new UserDao();
   public String resisterUser(User user) throws Exception 
	{  int result=userdao.registerUser(user);
	   if(result>0)
		return "success";
	   else return "fail";
	}
public UserResponse loginUser(User user) throws Exception {
	// TODO Auto-generated method stub
	return userdao.loginUser(user);
}
   

}
