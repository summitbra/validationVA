package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class B2bCustomerData
{
	private String uid;
	private String name;
	private String defaultBillingAddress = null;
	private String defaultShippingAddress = null;
	private String titleCode = null;
	private String firstName;
	private String lastName;
	Currency CurrencyObject;
	Language LanguageObject;
	private String displayUid;
	private String customerId = null;
	private String deactivationDate = null;
	private String defaultAddress = null;
	private String latestCartId = null;
	private String profilePicture = null;
	private String normalizedUid = null;
	Unit UnitObject;
	private String email = null;
	private String contactNumber = null;
	private boolean active;
	private boolean selected;
	ArrayList<Object> roles = new ArrayList<Object>( );
	private String displayRoles = null;
	ArrayList<Object> permissionGroups = new ArrayList<Object>( );
	ArrayList<Object> approvers = new ArrayList<Object>( );
	private String approverGroups = null;
	private String permissions = null;
	private String ldap;
	private String needCheck;
	private String formattedDocumentNumber = null;
	private String phoneDefault = null;
	private float entryPendingRSS;
	private float qtyOrdersSeparationError;
	private float pendingEntries;
	private String ordersToExpiry = null;
	private String channel;
	private String storeNumber;
	private String departmentCode;
	ArrayList<Object> atvGroups = new ArrayList<Object>( );
	private String loginInternet = null;
	private String birthDate = null;
	private String cpf = null;
	private String passport = null;
	private String documentNumber = null;
	private String documentType = null;
	private String registration = null;
	private String cardCelebrate = null;
	private String defaultAddressBuc = null;
	private String gender = null;
	private String bucCode = null;
	private String contact = null;
	private String address = null;
	private String foreignCustomer = null;
	private String propertytype = null;
	private String legalPerson = null;
	private String cnpj = null;
	private String companyName = null;
	private String stateRegistration = null;
	private String municipalRegistration = null;
	private String fantasyName = null;
	private String department = null;
	private boolean defaultContact;
	private boolean aceptyNotifyme;
	private boolean nfe;
	private boolean exception;
	private String profissao = null;
	private String estadoCivil = null;
	private String portadorDeficiencia = null;
	private String lojaPreferencia = null;
	private String cartaoFidelidade = null;
	private String hybrisCode = null;
	private String parceiro = null;
	private String inscEstadual = null;
	private String title = null;

	// Getter Methods

	public String getUid( )
	{
		return uid;
	}

	public String getName( )
	{
		return name;
	}

	public String getDefaultBillingAddress( )
	{
		return defaultBillingAddress;
	}

	public String getDefaultShippingAddress( )
	{
		return defaultShippingAddress;
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

	public Currency getCurrency( )
	{
		return CurrencyObject;
	}

	public Language getLanguage( )
	{
		return LanguageObject;
	}

	public String getDisplayUid( )
	{
		return displayUid;
	}

	public String getCustomerId( )
	{
		return customerId;
	}

	public String getDeactivationDate( )
	{
		return deactivationDate;
	}

	public String getDefaultAddress( )
	{
		return defaultAddress;
	}

	public String getLatestCartId( )
	{
		return latestCartId;
	}

	public String getProfilePicture( )
	{
		return profilePicture;
	}

	public String getNormalizedUid( )
	{
		return normalizedUid;
	}

	public Unit getUnit( )
	{
		return UnitObject;
	}

	public String getEmail( )
	{
		return email;
	}

	public String getContactNumber( )
	{
		return contactNumber;
	}

	public boolean getActive( )
	{
		return active;
	}

	public boolean getSelected( )
	{
		return selected;
	}

	public String getDisplayRoles( )
	{
		return displayRoles;
	}

	public String getApproverGroups( )
	{
		return approverGroups;
	}

	public String getPermissions( )
	{
		return permissions;
	}

	public String getLdap( )
	{
		return ldap;
	}

	public String getNeedCheck( )
	{
		return needCheck;
	}

	public String getFormattedDocumentNumber( )
	{
		return formattedDocumentNumber;
	}

	public String getPhoneDefault( )
	{
		return phoneDefault;
	}

	public float getEntryPendingRSS( )
	{
		return entryPendingRSS;
	}

	public float getQtyOrdersSeparationError( )
	{
		return qtyOrdersSeparationError;
	}

	public float getPendingEntries( )
	{
		return pendingEntries;
	}

	public String getOrdersToExpiry( )
	{
		return ordersToExpiry;
	}

	public String getChannel( )
	{
		return channel;
	}

	public String getStoreNumber( )
	{
		return storeNumber;
	}

	public String getDepartmentCode( )
	{
		return departmentCode;
	}

	public String getLoginInternet( )
	{
		return loginInternet;
	}

	public String getBirthDate( )
	{
		return birthDate;
	}

	public String getCpf( )
	{
		return cpf;
	}

	public String getPassport( )
	{
		return passport;
	}

	public String getDocumentNumber( )
	{
		return documentNumber;
	}

	public String getDocumentType( )
	{
		return documentType;
	}

	public String getRegistration( )
	{
		return registration;
	}

	public String getCardCelebrate( )
	{
		return cardCelebrate;
	}

	public String getDefaultAddressBuc( )
	{
		return defaultAddressBuc;
	}

	public String getGender( )
	{
		return gender;
	}

	public String getBucCode( )
	{
		return bucCode;
	}

	public String getContact( )
	{
		return contact;
	}

	public String getAddress( )
	{
		return address;
	}

	public String getForeignCustomer( )
	{
		return foreignCustomer;
	}

	public String getPropertytype( )
	{
		return propertytype;
	}

	public String getLegalPerson( )
	{
		return legalPerson;
	}

	public String getCnpj( )
	{
		return cnpj;
	}

	public String getCompanyName( )
	{
		return companyName;
	}

	public String getStateRegistration( )
	{
		return stateRegistration;
	}

	public String getMunicipalRegistration( )
	{
		return municipalRegistration;
	}

	public String getFantasyName( )
	{
		return fantasyName;
	}

	public String getDepartment( )
	{
		return department;
	}

	public boolean getDefaultContact( )
	{
		return defaultContact;
	}

	public boolean getAceptyNotifyme( )
	{
		return aceptyNotifyme;
	}

	public boolean getNfe( )
	{
		return nfe;
	}

	public boolean getException( )
	{
		return exception;
	}

	public String getProfissao( )
	{
		return profissao;
	}

	public String getEstadoCivil( )
	{
		return estadoCivil;
	}

	public String getPortadorDeficiencia( )
	{
		return portadorDeficiencia;
	}

	public String getLojaPreferencia( )
	{
		return lojaPreferencia;
	}

	public String getCartaoFidelidade( )
	{
		return cartaoFidelidade;
	}

	public String getHybrisCode( )
	{
		return hybrisCode;
	}

	public String getParceiro( )
	{
		return parceiro;
	}

	public String getInscEstadual( )
	{
		return inscEstadual;
	}

	public String getTitle( )
	{
		return title;
	}

	// Setter Methods

	public void setUid( String uid )
	{
		this.uid = uid;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public void setDefaultBillingAddress( String defaultBillingAddress )
	{
		this.defaultBillingAddress = defaultBillingAddress;
	}

	public void setDefaultShippingAddress( String defaultShippingAddress )
	{
		this.defaultShippingAddress = defaultShippingAddress;
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

	public void setCurrency( Currency currencyObject )
	{
		this.CurrencyObject = currencyObject;
	}

	public void setLanguage( Language languageObject )
	{
		this.LanguageObject = languageObject;
	}

	public void setDisplayUid( String displayUid )
	{
		this.displayUid = displayUid;
	}

	public void setCustomerId( String customerId )
	{
		this.customerId = customerId;
	}

	public void setDeactivationDate( String deactivationDate )
	{
		this.deactivationDate = deactivationDate;
	}

	public void setDefaultAddress( String defaultAddress )
	{
		this.defaultAddress = defaultAddress;
	}

	public void setLatestCartId( String latestCartId )
	{
		this.latestCartId = latestCartId;
	}

	public void setProfilePicture( String profilePicture )
	{
		this.profilePicture = profilePicture;
	}

	public void setNormalizedUid( String normalizedUid )
	{
		this.normalizedUid = normalizedUid;
	}

	public void setUnit( Unit unitObject )
	{
		this.UnitObject = unitObject;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public void setContactNumber( String contactNumber )
	{
		this.contactNumber = contactNumber;
	}

	public void setActive( boolean active )
	{
		this.active = active;
	}

	public void setSelected( boolean selected )
	{
		this.selected = selected;
	}

	public void setDisplayRoles( String displayRoles )
	{
		this.displayRoles = displayRoles;
	}

	public void setApproverGroups( String approverGroups )
	{
		this.approverGroups = approverGroups;
	}

	public void setPermissions( String permissions )
	{
		this.permissions = permissions;
	}

	public void setLdap( String ldap )
	{
		this.ldap = ldap;
	}

	public void setNeedCheck( String needCheck )
	{
		this.needCheck = needCheck;
	}

	public void setFormattedDocumentNumber( String formattedDocumentNumber )
	{
		this.formattedDocumentNumber = formattedDocumentNumber;
	}

	public void setPhoneDefault( String phoneDefault )
	{
		this.phoneDefault = phoneDefault;
	}

	public void setEntryPendingRSS( float entryPendingRSS )
	{
		this.entryPendingRSS = entryPendingRSS;
	}

	public void setQtyOrdersSeparationError( float qtyOrdersSeparationError )
	{
		this.qtyOrdersSeparationError = qtyOrdersSeparationError;
	}

	public void setPendingEntries( float pendingEntries )
	{
		this.pendingEntries = pendingEntries;
	}

	public void setOrdersToExpiry( String ordersToExpiry )
	{
		this.ordersToExpiry = ordersToExpiry;
	}

	public void setChannel( String channel )
	{
		this.channel = channel;
	}

	public void setStoreNumber( String storeNumber )
	{
		this.storeNumber = storeNumber;
	}

	public void setDepartmentCode( String departmentCode )
	{
		this.departmentCode = departmentCode;
	}

	public void setLoginInternet( String loginInternet )
	{
		this.loginInternet = loginInternet;
	}

	public void setBirthDate( String birthDate )
	{
		this.birthDate = birthDate;
	}

	public void setCpf( String cpf )
	{
		this.cpf = cpf;
	}

	public void setPassport( String passport )
	{
		this.passport = passport;
	}

	public void setDocumentNumber( String documentNumber )
	{
		this.documentNumber = documentNumber;
	}

	public void setDocumentType( String documentType )
	{
		this.documentType = documentType;
	}

	public void setRegistration( String registration )
	{
		this.registration = registration;
	}

	public void setCardCelebrate( String cardCelebrate )
	{
		this.cardCelebrate = cardCelebrate;
	}

	public void setDefaultAddressBuc( String defaultAddressBuc )
	{
		this.defaultAddressBuc = defaultAddressBuc;
	}

	public void setGender( String gender )
	{
		this.gender = gender;
	}

	public void setBucCode( String bucCode )
	{
		this.bucCode = bucCode;
	}

	public void setContact( String contact )
	{
		this.contact = contact;
	}

	public void setAddress( String address )
	{
		this.address = address;
	}

	public void setForeignCustomer( String foreignCustomer )
	{
		this.foreignCustomer = foreignCustomer;
	}

	public void setPropertytype( String propertytype )
	{
		this.propertytype = propertytype;
	}

	public void setLegalPerson( String legalPerson )
	{
		this.legalPerson = legalPerson;
	}

	public void setCnpj( String cnpj )
	{
		this.cnpj = cnpj;
	}

	public void setCompanyName( String companyName )
	{
		this.companyName = companyName;
	}

	public void setStateRegistration( String stateRegistration )
	{
		this.stateRegistration = stateRegistration;
	}

	public void setMunicipalRegistration( String municipalRegistration )
	{
		this.municipalRegistration = municipalRegistration;
	}

	public void setFantasyName( String fantasyName )
	{
		this.fantasyName = fantasyName;
	}

	public void setDepartment( String department )
	{
		this.department = department;
	}

	public void setDefaultContact( boolean defaultContact )
	{
		this.defaultContact = defaultContact;
	}

	public void setAceptyNotifyme( boolean aceptyNotifyme )
	{
		this.aceptyNotifyme = aceptyNotifyme;
	}

	public void setNfe( boolean nfe )
	{
		this.nfe = nfe;
	}

	public void setException( boolean exception )
	{
		this.exception = exception;
	}

	public void setProfissao( String profissao )
	{
		this.profissao = profissao;
	}

	public void setEstadoCivil( String estadoCivil )
	{
		this.estadoCivil = estadoCivil;
	}

	public void setPortadorDeficiencia( String portadorDeficiencia )
	{
		this.portadorDeficiencia = portadorDeficiencia;
	}

	public void setLojaPreferencia( String lojaPreferencia )
	{
		this.lojaPreferencia = lojaPreferencia;
	}

	public void setCartaoFidelidade( String cartaoFidelidade )
	{
		this.cartaoFidelidade = cartaoFidelidade;
	}

	public void setHybrisCode( String hybrisCode )
	{
		this.hybrisCode = hybrisCode;
	}

	public void setParceiro( String parceiro )
	{
		this.parceiro = parceiro;
	}

	public void setInscEstadual( String inscEstadual )
	{
		this.inscEstadual = inscEstadual;
	}

	public void setTitle( String title )
	{
		this.title = title;
	}
}
