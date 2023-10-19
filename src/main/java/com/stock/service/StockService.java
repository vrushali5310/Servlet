package com.stock.service;

import com.stock.dao.StockDao;
import com.stock.model.Stock;

public class StockService {
	StockDao stockdao=new StockDao();

	public String resisterUser(Stock stock) throws Exception{
		
		int result= stockdao.registerStock(stock);
		if(result>0)
			return "success";
		else
			return "fail";
				
		
	
	}

}
