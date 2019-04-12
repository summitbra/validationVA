package com.leroymerlin.va.validation.pojo;

public class DeliveryMode
{
	private String code;
	private String name;
	private String description;
	private String deliveryCost = null;

	// Getter Methods

	public String getCode( )
	{
		return code;
	}

	public String getName( )
	{
		return name;
	}

	public String getDescription( )
	{
		return description;
	}

	public String getDeliveryCost( )
	{
		return deliveryCost;
	}

	// Setter Methods

	public void setCode( String code )
	{
		this.code = code;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public void setDeliveryCost( String deliveryCost )
	{
		this.deliveryCost = deliveryCost;
	}
}