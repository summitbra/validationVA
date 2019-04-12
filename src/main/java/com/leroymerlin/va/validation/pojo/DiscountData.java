package com.leroymerlin.va.validation.pojo;

public class DiscountData
{
	private String reason;
	private String type;
	private String value;
	private String percent;
	private String originalPriceInteger;
	private String originalPriceDecimal;
	private String discountPriceInteger;
	private String discountPriceDecimal;
	private String totalOriginalPriceInteger;
	private String totalOriginalPriceDecimal;
	private String totalDiscountPriceInteger;
	private String totalDiscountPriceDecimal;
	private String entryNumber;
	private boolean editableDiscount;
	private String containsDiscount = null;
	private String isComplex = null;
	private String isFidelity = null;
	private String targetDiscountType = null;
	private boolean priceError;
	private String sectionTotalValue;
	private String cartTotalValue = null;
	private String discountOfSpecialPriceValue;

	// Getter Methods

	public String getReason( )
	{
		return reason;
	}

	public String getType( )
	{
		return type;
	}

	public String getValue( )
	{
		return value;
	}

	public String getPercent( )
	{
		return percent;
	}

	public String getOriginalPriceInteger( )
	{
		return originalPriceInteger;
	}

	public String getOriginalPriceDecimal( )
	{
		return originalPriceDecimal;
	}

	public String getDiscountPriceInteger( )
	{
		return discountPriceInteger;
	}

	public String getDiscountPriceDecimal( )
	{
		return discountPriceDecimal;
	}

	public String getTotalOriginalPriceInteger( )
	{
		return totalOriginalPriceInteger;
	}

	public String getTotalOriginalPriceDecimal( )
	{
		return totalOriginalPriceDecimal;
	}

	public String getTotalDiscountPriceInteger( )
	{
		return totalDiscountPriceInteger;
	}

	public String getTotalDiscountPriceDecimal( )
	{
		return totalDiscountPriceDecimal;
	}

	public String getEntryNumber( )
	{
		return entryNumber;
	}

	public boolean getEditableDiscount( )
	{
		return editableDiscount;
	}

	public String getContainsDiscount( )
	{
		return containsDiscount;
	}

	public String getIsComplex( )
	{
		return isComplex;
	}

	public String getIsFidelity( )
	{
		return isFidelity;
	}

	public String getTargetDiscountType( )
	{
		return targetDiscountType;
	}

	public boolean getPriceError( )
	{
		return priceError;
	}

	public String getSectionTotalValue( )
	{
		return sectionTotalValue;
	}

	public String getCartTotalValue( )
	{
		return cartTotalValue;
	}

	public String getDiscountOfSpecialPriceValue( )
	{
		return discountOfSpecialPriceValue;
	}

	// Setter Methods

	public void setReason( String reason )
	{
		this.reason = reason;
	}

	public void setType( String type )
	{
		this.type = type;
	}

	public void setValue( String value )
	{
		this.value = value;
	}

	public void setPercent( String percent )
	{
		this.percent = percent;
	}

	public void setOriginalPriceInteger( String originalPriceInteger )
	{
		this.originalPriceInteger = originalPriceInteger;
	}

	public void setOriginalPriceDecimal( String originalPriceDecimal )
	{
		this.originalPriceDecimal = originalPriceDecimal;
	}

	public void setDiscountPriceInteger( String discountPriceInteger )
	{
		this.discountPriceInteger = discountPriceInteger;
	}

	public void setDiscountPriceDecimal( String discountPriceDecimal )
	{
		this.discountPriceDecimal = discountPriceDecimal;
	}

	public void setTotalOriginalPriceInteger( String totalOriginalPriceInteger )
	{
		this.totalOriginalPriceInteger = totalOriginalPriceInteger;
	}

	public void setTotalOriginalPriceDecimal( String totalOriginalPriceDecimal )
	{
		this.totalOriginalPriceDecimal = totalOriginalPriceDecimal;
	}

	public void setTotalDiscountPriceInteger( String totalDiscountPriceInteger )
	{
		this.totalDiscountPriceInteger = totalDiscountPriceInteger;
	}

	public void setTotalDiscountPriceDecimal( String totalDiscountPriceDecimal )
	{
		this.totalDiscountPriceDecimal = totalDiscountPriceDecimal;
	}

	public void setEntryNumber( String entryNumber )
	{
		this.entryNumber = entryNumber;
	}

	public void setEditableDiscount( boolean editableDiscount )
	{
		this.editableDiscount = editableDiscount;
	}

	public void setContainsDiscount( String containsDiscount )
	{
		this.containsDiscount = containsDiscount;
	}

	public void setIsComplex( String isComplex )
	{
		this.isComplex = isComplex;
	}

	public void setIsFidelity( String isFidelity )
	{
		this.isFidelity = isFidelity;
	}

	public void setTargetDiscountType( String targetDiscountType )
	{
		this.targetDiscountType = targetDiscountType;
	}

	public void setPriceError( boolean priceError )
	{
		this.priceError = priceError;
	}

	public void setSectionTotalValue( String sectionTotalValue )
	{
		this.sectionTotalValue = sectionTotalValue;
	}

	public void setCartTotalValue( String cartTotalValue )
	{
		this.cartTotalValue = cartTotalValue;
	}

	public void setDiscountOfSpecialPriceValue( String discountOfSpecialPriceValue )
	{
		this.discountOfSpecialPriceValue = discountOfSpecialPriceValue;
	}
}