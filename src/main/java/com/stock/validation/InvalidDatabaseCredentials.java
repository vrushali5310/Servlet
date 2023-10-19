package com.stock.validation;

public class InvalidDatabaseCredentials extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDatabaseCredentials(String string) 
	{
		super(string);
	}
  
}
