package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class ExpeditionCenterInfo
{
	ArrayList<Object> availableValues = new ArrayList<Object>( );
	DefaultValue DefaultValueObject;
	private String selectedValue = null;

	// Getter Methods

	public DefaultValue getDefaultValue( )
	{
		return DefaultValueObject;
	}

	public String getSelectedValue( )
	{
		return selectedValue;
	}

	// Setter Methods

	public void setDefaultValue( DefaultValue defaultValueObject )
	{
		this.DefaultValueObject = defaultValueObject;
	}

	public void setSelectedValue( String selectedValue )
	{
		this.selectedValue = selectedValue;
	}
}
