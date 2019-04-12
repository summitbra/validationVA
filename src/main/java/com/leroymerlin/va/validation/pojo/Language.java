package com.leroymerlin.va.validation.pojo;


public class Language
{
	private String isocode;
	private String name;
	private String nativeName;
	private boolean active;
	private boolean required;
	private String cockpitName = null;

	// Getter Methods

	public String getIsocode( )
	{
		return isocode;
	}

	public String getName( )
	{
		return name;
	}

	public String getNativeName( )
	{
		return nativeName;
	}

	public boolean getActive( )
	{
		return active;
	}

	public boolean getRequired( )
	{
		return required;
	}

	public String getCockpitName( )
	{
		return cockpitName;
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

	public void setNativeName( String nativeName )
	{
		this.nativeName = nativeName;
	}

	public void setActive( boolean active )
	{
		this.active = active;
	}

	public void setRequired( boolean required )
	{
		this.required = required;
	}

	public void setCockpitName( String cockpitName )
	{
		this.cockpitName = cockpitName;
	}
}

