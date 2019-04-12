package com.leroymerlin.va.validation.pojo;

public class PaymentType
{
	private String code;
	private String displayName;

	// Getter Methods

	public String getCode( )
	{
		return code;
	}

	public String getDisplayName( )
	{
		return displayName;
	}

	// Setter Methods

	public void setCode( String code )
	{
		this.code = code;
	}

	public void setDisplayName( String displayName )
	{
		this.displayName = displayName;
	}
}
