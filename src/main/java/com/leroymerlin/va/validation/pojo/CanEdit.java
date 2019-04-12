package com.leroymerlin.va.validation.pojo;

public class CanEdit
{
	private boolean isEditable;
	private String description;

	// Getter Methods

	public boolean getIsEditable( )
	{
		return isEditable;
	}

	public String getDescription( )
	{
		return description;
	}

	// Setter Methods

	public void setIsEditable( boolean isEditable )
	{
		this.isEditable = isEditable;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}
}
