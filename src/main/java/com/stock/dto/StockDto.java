package com.stock.dto;
import javax.servlet.http.HttpServletRequest;

import com.stock.model.*;

public class StockDto 
{
  public Stock resister(HttpServletRequest request) {
	  
	  Stock stock = new Stock();
    stock.setStockname(request.getParameter("stockname"));
    stock.setSymbol(request.getParameter("symbol"));
    stock.setCurrentprice(Float.parseFloat(request.getParameter("currentprice")));
    return stock;
}
}