package com.leroymerlin.va.validation.pojo;

public class Country
{
	private String isocode;
	private String name;

	// Getter Methods

	public String getIsocode( )
	{
		return isocode;
	}

	public String getName( )
	{
		return name;
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
}
