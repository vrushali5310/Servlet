package com.stock.model;

public class Stock 
{
	private String stockname;
	private String symbol;
	private float currentprice;
	
	
	public Stock(String stockname, String symbol, float currentprice) {
		super();
		this.stockname = stockname;
		this.symbol = symbol;
		this.currentprice = currentprice;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(float currentprice) {
		this.currentprice = currentprice;
	}
	@Override
	public String toString() {
		return "Stock [stockname=" + stockname + ", symbol=" + symbol + ", currentprice=" + currentprice + "]";
	}
	public Stock() {
		super();
	}
	
	
	}
