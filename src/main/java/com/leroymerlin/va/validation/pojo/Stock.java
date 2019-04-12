package com.leroymerlin.va.validation.pojo;

public class Stock
{
	StockLevelStatus StockLevelStatusObject;
	private float stockLevel;
	private String stockThreshold = null;

	// Getter Methods

	public StockLevelStatus getStockLevelStatus( )
	{
		return StockLevelStatusObject;
	}

	public float getStockLevel( )
	{
		return stockLevel;
	}

	public String getStockThreshold( )
	{
		return stockThreshold;
	}

	// Setter Methods

	public void setStockLevelStatus( StockLevelStatus stockLevelStatusObject )
	{
		this.StockLevelStatusObject = stockLevelStatusObject;
	}

	public void setStockLevel( float stockLevel )
	{
		this.stockLevel = stockLevel;
	}

	public void setStockThreshold( String stockThreshold )
	{
		this.stockThreshold = stockThreshold;
	}
}

