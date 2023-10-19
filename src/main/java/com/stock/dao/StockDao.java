package com.stock.dao;

import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.stock.Util.StockUtil;
import com.stock.model.Stock;

public class StockDao {
	PreparedStatement ps=null; 

	public int registerStock(Stock stock) throws Exception{
	ps=StockUtil.getConnection().prepareStatement("insert into stockdetails(stockname,symbol,currentprice)values(?,?,?)");
		ps.setString(1,stock.getStockname());
		ps.setString(2,stock.getSymbol());
		ps.setFloat(3,stock.getCurrentprice());
 
		 int row=ps.executeUpdate();
         return row;
	}

}
  