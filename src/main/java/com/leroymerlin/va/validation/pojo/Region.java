package com.leroymerlin.va.validation.pojo;


public class Region
{
	private String isocode;
	private String isocodeShort;
	private String countryIso;
	private String name;

	// Getter Methods

	public String getIsocode( )
	{
		return isocode;
	}

	public String getIsocodeShort( )
	{
		return isocodeShort;
	}

	public String getCountryIso( )
	{
		return countryIso;
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

	public void setIsocodeShort( String isocodeShort )
	{
		this.isocodeShort = isocodeShort;
	}

	public void setCountryIso( String countryIso )
	{
		this.countryIso = countryIso;
	}

	public void setName( String name )
	{
		this.name = name;
	}
}
