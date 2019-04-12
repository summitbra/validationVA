package com.leroymerlin.va.validation.pojo;

public class DefaultOrderOutgoingFlow
{
	private String code;
	private String value = null;
	private String description;
	private boolean cashierPayment;
	private String outgoingFlowType;
	private String withdrawType;
	private String scheduleType;
	private String textOutgoigFlow = null;

	// Getter Methods

	public String getCode( )
	{
		return code;
	}

	public String getValue( )
	{
		return value;
	}

	public String getDescription( )
	{
		return description;
	}

	public boolean getCashierPayment( )
	{
		return cashierPayment;
	}

	public String getOutgoingFlowType( )
	{
		return outgoingFlowType;
	}

	public String getWithdrawType( )
	{
		return withdrawType;
	}

	public String getScheduleType( )
	{
		return scheduleType;
	}

	public String getTextOutgoigFlow( )
	{
		return textOutgoigFlow;
	}

	// Setter Methods

	public void setCode( String code )
	{
		this.code = code;
	}

	public void setValue( String value )
	{
		this.value = value;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public void setCashierPayment( boolean cashierPayment )
	{
		this.cashierPayment = cashierPayment;
	}

	public void setOutgoingFlowType( String outgoingFlowType )
	{
		this.outgoingFlowType = outgoingFlowType;
	}

	public void setWithdrawType( String withdrawType )
	{
		this.withdrawType = withdrawType;
	}

	public void setScheduleType( String scheduleType )
	{
		this.scheduleType = scheduleType;
	}

	public void setTextOutgoigFlow( String textOutgoigFlow )
	{
		this.textOutgoigFlow = textOutgoigFlow;
	}
}
