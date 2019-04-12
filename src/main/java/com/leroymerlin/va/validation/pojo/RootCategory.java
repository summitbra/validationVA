package com.leroymerlin.va.validation.pojo;

public class RootCategory
{
	private String code;
	private String name;
	private String url;
	private String description = null;
	private String image = null;
	private String parentCategoryName = null;
	private float sequence;
	private String leftOverCalculatorType = null;

	// Getter Methods

	public String getCode( )
	{
		return code;
	}

	public String getName( )
	{
		return name;
	}

	public String getUrl( )
	{
		return url;
	}

	public String getDescription( )
	{
		return description;
	}

	public String getImage( )
	{
		return image;
	}

	public String getParentCategoryName( )
	{
		return parentCategoryName;
	}

	public float getSequence( )
	{
		return sequence;
	}

	public String getLeftOverCalculatorType( )
	{
		return leftOverCalculatorType;
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

	public void setUrl( String url )
	{
		this.url = url;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public void setImage( String image )
	{
		this.image = image;
	}

	public void setParentCategoryName( String parentCategoryName )
	{
		this.parentCategoryName = parentCategoryName;
	}

	public void setSequence( float sequence )
	{
		this.sequence = sequence;
	}

	public void setLeftOverCalculatorType( String leftOverCalculatorType )
	{
		this.leftOverCalculatorType = leftOverCalculatorType;
	}
}

