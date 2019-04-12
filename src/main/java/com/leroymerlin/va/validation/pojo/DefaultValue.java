package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class DefaultValue
{
	private String code;
	private boolean isDefault;
	private String url;
	private String consignments = null;
	ArrayList<Object> pointsOfServices = new ArrayList<Object>( );
	private String priority = null;
	private String deliveryModes = null;
	private boolean external;
	private String displayName;
	private String available = null;

	// Getter Methods

	public String getCode( )
	{
		return code;
	}

	public boolean getIsDefault( )
	{
		return isDefault;
	}

	public String getUrl( )
	{
		return url;
	}

	public String getConsignments( )
	{
		return consignments;
	}

	public String getPriority( )
	{
		return priority;
	}

	public String getDeliveryModes( )
	{
		return deliveryModes;
	}

	public boolean getExternal( )
	{
		return external;
	}

	public String getDisplayName( )
	{
		return displayName;
	}

	public String getAvailable( )
	{
		return available;
	}

	// Setter Methods

	public void setCode( String code )
	{
		this.code = code;
	}

	public void setIsDefault( boolean isDefault )
	{
		this.isDefault = isDefault;
	}

	public void setUrl( String url )
	{
		this.url = url;
	}

	public void setConsignments( String consignments )
	{
		this.consignments = consignments;
	}

	public void setPriority( String priority )
	{
		this.priority = priority;
	}

	public void setDeliveryModes( String deliveryModes )
	{
		this.deliveryModes = deliveryModes;
	}

	public void setExternal( boolean external )
	{
		this.external = external;
	}

	public void setDisplayName( String displayName )
	{
		this.displayName = displayName;
	}

	public void setAvailable( String available )
	{
		this.available = available;
	}
}
