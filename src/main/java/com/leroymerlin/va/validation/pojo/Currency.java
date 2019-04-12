package com.leroymerlin.va.validation.pojo;

public class Currency
{
	private String isocode;
	private String name = null;
	private boolean active;
	private String symbol;

	// Getter Methods

	public String getIsocode( )
	{
		return isocode;
	}

	public String getName( )
	{
		return name;
	}

	public boolean getActive( )
	{
		return active;
	}

	public String getSymbol( )
	{
		return symbol;
	}

	// Setter Methods

	public void setIsocode( String isocode )
	{
		this.isocode = isocode;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public void setActive( boolean active )
	{
		this.active = active;
	}

	public void setSymbol( String symbol )
	{
		this.symbol = symbol;
	}
}
