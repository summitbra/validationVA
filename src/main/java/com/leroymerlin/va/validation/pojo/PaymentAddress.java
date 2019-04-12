package com.leroymerlin.va.validation.pojo;

public class PaymentAddress
{
	private String id;
	private String title = null;
	private String titleCode = null;
	private String firstName = null;
	private String lastName = null;
	private String companyName = null;
	private String line1;
	private String line2;
	private String town;
	Region RegionObject;
	private String postalCode;
	private String phone = null;
	private String email = null;
	Country CountryObject;
	private boolean shippingAddress;
	private boolean billingAddress;
	private boolean defaultAddress;
	private boolean visibleInAddressBook;
	private String formattedAddress;
	private boolean editable;
	private String bucCode = null;
	private String number = null;
	private String reference = null;
	private String type;
	private String district;
	private String complement = null;
	private String codIBGE = null;
	private String standardAddress = null;
	private String bucActive = null;
	private String realtyType;
	private String tipoResidencia = null;
	private String qtdBanheiros = null;
	private String possuiJardim = null;
	private String possuiPiscina = null;
	private String index = null;

	// Getter Methods

	public String getId( )
	{
		return id;
	}

	public String getTitle( )
	{
		return title;
	}

	public String getTitleCode( )
	{
		return titleCode;
	}

	public String getFirstName( )
	{
		return firstName;
	}

	public String getLastName( )
	{
		return lastName;
	}

	public String getCompanyName( )
	{
		return companyName;
	}

	public String getLine1( )
	{
		return line1;
	}

	public String getLine2( )
	{
		return line2;
	}

	public String getTown( )
	{
		return town;
	}

	public Region getRegion( )
	{
		return RegionObject;
	}

	public String getPostalCode( )
	{
		return postalCode;
	}

	public String getPhone( )
	{
		return phone;
	}

	public String getEmail( )
	{
		return email;
	}

	public Country getCountry( )
	{
		return CountryObject;
	}

	public boolean getShippingAddress( )
	{
		return shippingAddress;
	}

	public boolean getBillingAddress( )
	{
		return billingAddress;
	}

	public boolean getDefaultAddress( )
	{
		return defaultAddress;
	}

	public boolean getVisibleInAddressBook( )
	{
		return visibleInAddressBook;
	}

	public String getFormattedAddress( )
	{
		return formattedAddress;
	}

	public boolean getEditable( )
	{
		return editable;
	}

	public String getBucCode( )
	{
		return bucCode;
	}

	public String getNumber( )
	{
		return number;
	}

	public String getReference( )
	{
		return reference;
	}

	public String getType( )
	{
		return type;
	}

	public String getDistrict( )
	{
		return district;
	}

	public String getComplement( )
	{
		return complement;
	}

	public String getCodIBGE( )
	{
		return codIBGE;
	}

	public String getStandardAddress( )
	{
		return standardAddress;
	}

	public String getBucActive( )
	{
		return bucActive;
	}

	public String getRealtyType( )
	{
		return realtyType;
	}

	public String getTipoResidencia( )
	{
		return tipoResidencia;
	}

	public String getQtdBanheiros( )
	{
		return qtdBanheiros;
	}

	public String getPossuiJardim( )
	{
		return possuiJardim;
	}

	public String getPossuiPiscina( )
	{
		return possuiPiscina;
	}

	public String getIndex( )
	{
		return index;
	}

	// Setter Methods

	public void setId( String id )
	{
		this.id = id;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}

	public void setTitleCode( String titleCode )
	{
		this.titleCode = titleCode;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

	public void setCompanyName( String companyName )
	{
		this.companyName = companyName;
	}

	public void setLine1( String line1 )
	{
		this.line1 = line1;
	}

	public void setLine2( String line2 )
	{
		this.line2 = line2;
	}

	public void setTown( String town )
	{
		this.town = town;
	}

	public void setRegion( Region regionObject )
	{
		this.RegionObject = regionObject;
	}

	public void setPostalCode( String postalCode )
	{
		this.postalCode = postalCode;
	}

	public void setPhone( String phone )
	{
		this.phone = phone;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public void setCountry( Country countryObject )
	{
		this.CountryObject = countryObject;
	}

	public void setShippingAddress( boolean shippingAddress )
	{
		this.shippingAddress = shippingAddress;
	}

	public void setBillingAddress( boolean billingAddress )
	{
		this.billingAddress = billingAddress;
	}

	public void setDefaultAddress( boolean defaultAddress )
	{
		this.defaultAddress = defaultAddress;
	}

	public void setVisibleInAddressBook( boolean visibleInAddressBook )
	{
		this.visibleInAddressBook = visibleInAddressBook;
	}

	public void setFormattedAddress( String formattedAddress )
	{
		this.formattedAddress = formattedAddress;
	}

	public void setEditable( boolean editable )
	{
		this.editable = editable;
	}

	public void setBucCode( String bucCode )
	{
		this.bucCode = bucCode;
	}

	public void setNumber( String number )
	{
		this.number = number;
	}

	public void setReference( String reference )
	{
		this.reference = reference;
	}

	public void setType( String type )
	{
		this.type = type;
	}

	public void setDistrict( String district )
	{
		this.district = district;
	}

	public void setComplement( String complement )
	{
		this.complement = complement;
	}

	public void setCodIBGE( String codIBGE )
	{
		this.codIBGE = codIBGE;
	}

	public void setStandardAddress( String standardAddress )
	{
		this.standardAddress = standardAddress;
	}

	public void setBucActive( String bucActive )
	{
		this.bucActive = bucActive;
	}

	public void setRealtyType( String realtyType )
	{
		this.realtyType = realtyType;
	}

	public void setTipoResidencia( String tipoResidencia )
	{
		this.tipoResidencia = tipoResidencia;
	}

	public void setQtdBanheiros( String qtdBanheiros )
	{
		this.qtdBanheiros = qtdBanheiros;
	}

	public void setPossuiJardim( String possuiJardim )
	{
		this.possuiJardim = possuiJardim;
	}

	public void setPossuiPiscina( String possuiPiscina )
	{
		this.possuiPiscina = possuiPiscina;
	}

	public void setIndex( String index )
	{
		this.index = index;
	}
}