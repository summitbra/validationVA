package com.leroymerlin.va.validation.pojo;

public class TotalGrossValue
{
	private String currencyIso;
	private float value;
	private String priceType;
	private String formattedValue;
	private String minQuantity = null;
	private String maxQuantity = null;
	private String intValue;
	private String decimalValue;
	private String symbol;

	// Getter Methods

	public String getCurrencyIso( )
	{
		return currencyIso;
	}

	public float getValue( )
	{
		return value;
	}

	public String getPriceType( )
	{
		return priceType;
	}

	public String getFormattedValue( )
	{
		return formattedValue;
	}

	public String getMinQuantity( )
	{
		return minQuantity;
	}

	public String getMaxQuantity( )
	{
		return maxQuantity;
	}

	public String getIntValue( )
	{
		return intValue;
	}

	public String getDecimalValue( )
	{
		return decimalValue;
	}

	public String getSymbol( )
	{
		return symbol;
	}

	// Setter Methods

	public void setCurrencyIso( String currencyIso )
	{
		this.currencyIso = currencyIso;
	}

	public void setValue( float value )
	{
		this.value = value;
	}

	public void setPriceType( String priceType )
	{
		this.priceType = priceType;
	}

	public void setFormattedValue( String formattedValue )
	{
		this.formattedValue = formattedValue;
	}

	public void setMinQuantity( String minQuantity )
	{
		this.minQuantity = minQuantity;
	}

	public void setMaxQuantity( String maxQuantity )
	{
		this.maxQuantity = maxQuantity;
	}

	public void setIntValue( String intValue )
	{
		this.intValue = intValue;
	}

	public void setDecimalValue( String decimalValue )
	{
		this.decimalValue = decimalValue;
	}

	public void setSymbol( String symbol )
	{
		this.symbol = symbol;
	}
}

