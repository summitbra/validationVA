package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class Contact
{
	private String email = null;
	private String acceptDirectMail = null;
	private String acceptSMS = null;
	private String receiveOfferByPhone = null;
	private String aceptyNotifyme = null;
	ArrayList<Object> phones = new ArrayList<Object>( );
	private String fax = null;

	// Getter Methods

	public String getEmail( )
	{
		return email;
	}

	public String getAcceptDirectMail( )
	{
		return acceptDirectMail;
	}

	public String getAcceptSMS( )
	{
		return acceptSMS;
	}

	public String getReceiveOfferByPhone( )
	{
		return receiveOfferByPhone;
	}

	public String getAceptyNotifyme( )
	{
		return aceptyNotifyme;
	}

	public String getFax( )
	{
		return fax;
	}

	// Setter Methods

	public void setEmail( String email )
	{
		this.email = email;
	}

	public void setAcceptDirectMail( String acceptDirectMail )
	{
		this.acceptDirectMail = acceptDirectMail;
	}

	public void setAcceptSMS( String acceptSMS )
	{
		this.acceptSMS = acceptSMS;
	}

	public void setReceiveOfferByPhone( String receiveOfferByPhone )
	{
		this.receiveOfferByPhone = receiveOfferByPhone;
	}

	public void setAceptyNotifyme( String aceptyNotifyme )
	{
		this.aceptyNotifyme = aceptyNotifyme;
	}

	public void setFax( String fax )
	{
		this.fax = fax;
	}
}
