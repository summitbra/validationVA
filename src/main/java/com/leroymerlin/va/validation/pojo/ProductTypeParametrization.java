package com.leroymerlin.va.validation.pojo;

public class ProductTypeParametrization
{
	ProductType ProductTypeObject;
	private String comercializationType;
	private boolean controlStock;
	private boolean isFreightEligible;
	private boolean isEligibleDiscountRatePunctual;
	private String marketingService = null;
	private String billingService;
	private boolean applyFilterByRangeOfValue;
	private boolean isPriceDefinedBackoffice;
	private String iconUrl;
	private String defaultOutgoingFlow = null;
	private String outgoingFlowsRestricteds = null;
	private String textManagementReport;
	private boolean isSendToSap;
	private boolean isScheduled;
	private boolean isMarketplace;
	private boolean ignoreProductCenterData;
	private boolean splitMarketplace;

	// Getter Methods

	public ProductType getProductType( )
	{
		return ProductTypeObject;
	}

	public String getComercializationType( )
	{
		return comercializationType;
	}

	public boolean getControlStock( )
	{
		return controlStock;
	}

	public boolean getIsFreightEligible( )
	{
		return isFreightEligible;
	}

	public boolean getIsEligibleDiscountRatePunctual( )
	{
		return isEligibleDiscountRatePunctual;
	}

	public String getMarketingService( )
	{
		return marketingService;
	}

	public String getBillingService( )
	{
		return billingService;
	}

	public boolean getApplyFilterByRangeOfValue( )
	{
		return applyFilterByRangeOfValue;
	}

	public boolean getIsPriceDefinedBackoffice( )
	{
		return isPriceDefinedBackoffice;
	}

	public String getIconUrl( )
	{
		return iconUrl;
	}

	public String getDefaultOutgoingFlow( )
	{
		return defaultOutgoingFlow;
	}

	public String getOutgoingFlowsRestricteds( )
	{
		return outgoingFlowsRestricteds;
	}

	public String getTextManagementReport( )
	{
		return textManagementReport;
	}

	public boolean getIsSendToSap( )
	{
		return isSendToSap;
	}

	public boolean getIsScheduled( )
	{
		return isScheduled;
	}

	public boolean getIsMarketplace( )
	{
		return isMarketplace;
	}

	public boolean getIgnoreProductCenterData( )
	{
		return ignoreProductCenterData;
	}

	public boolean getSplitMarketplace( )
	{
		return splitMarketplace;
	}

	// Setter Methods

	public void setProductType( ProductType productTypeObject )
	{
		this.ProductTypeObject = productTypeObject;
	}

	public void setComercializationType( String comercializationType )
	{
		this.comercializationType = comercializationType;
	}

	public void setControlStock( boolean controlStock )
	{
		this.controlStock = controlStock;
	}

	public void setIsFreightEligible( boolean isFreightEligible )
	{
		this.isFreightEligible = isFreightEligible;
	}

	public void setIsEligibleDiscountRatePunctual( boolean isEligibleDiscountRatePunctual )
	{
		this.isEligibleDiscountRatePunctual = isEligibleDiscountRatePunctual;
	}

	public void setMarketingService( String marketingService )
	{
		this.marketingService = marketingService;
	}

	public void setBillingService( String billingService )
	{
		this.billingService = billingService;
	}

	public void setApplyFilterByRangeOfValue( boolean applyFilterByRangeOfValue )
	{
		this.applyFilterByRangeOfValue = applyFilterByRangeOfValue;
	}

	public void setIsPriceDefinedBackoffice( boolean isPriceDefinedBackoffice )
	{
		this.isPriceDefinedBackoffice = isPriceDefinedBackoffice;
	}

	public void setIconUrl( String iconUrl )
	{
		this.iconUrl = iconUrl;
	}

	public void setDefaultOutgoingFlow( String defaultOutgoingFlow )
	{
		this.defaultOutgoingFlow = defaultOutgoingFlow;
	}

	public void setOutgoingFlowsRestricteds( String outgoingFlowsRestricteds )
	{
		this.outgoingFlowsRestricteds = outgoingFlowsRestricteds;
	}

	public void setTextManagementReport( String textManagementReport )
	{
		this.textManagementReport = textManagementReport;
	}

	public void setIsSendToSap( boolean isSendToSap )
	{
		this.isSendToSap = isSendToSap;
	}

	public void setIsScheduled( boolean isScheduled )
	{
		this.isScheduled = isScheduled;
	}

	public void setIsMarketplace( boolean isMarketplace )
	{
		this.isMarketplace = isMarketplace;
	}

	public void setIgnoreProductCenterData( boolean ignoreProductCenterData )
	{
		this.ignoreProductCenterData = ignoreProductCenterData;
	}

	public void setSplitMarketplace( boolean splitMarketplace )
	{
		this.splitMarketplace = splitMarketplace;
	}
}

