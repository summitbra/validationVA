package com.leroymerlin.va.validation.pojo;

import com.leroymerlin.va.validation.pojo.*;

import java.util.ArrayList;

public class Order
{
	private String code;
	private String name = null;
	private String description = null;
	private String expirationTime = null;
	private boolean net;
	TotalPriceWithTax TotalPriceWithTaxObject;
	TotalPrice TotalPriceObject;
	TotalTax TotalTaxObject;
	SubTotal SubTotalObject;
	SubTotalWithoutQuoteDiscounts SubTotalWithoutQuoteDiscountsObject;
	DeliveryCost DeliveryCostObject;
	ArrayList<Object> entries = new ArrayList<Object>( );
	private float totalItems;
	private String deliveryMode = null;
	DeliveryAddress DeliveryAddressObject;
	private String paymentInfo = null;
	ArrayList<Object> appliedOrderPromotions = new ArrayList<Object>( );
	ArrayList<Object> appliedProductPromotions = new ArrayList<Object>( );
	ProductDiscounts ProductDiscountsObject;
	OrderDiscounts OrderDiscountsObject;
	QuoteDiscounts QuoteDiscountsObject;
	private float quoteDiscountsRate;
	private String quoteDiscountsType;
	TotalDiscounts TotalDiscountsObject;
	TotalDiscountsWithQuoteDiscounts TotalDiscountsWithQuoteDiscountsObject;
	private String subTotalWithDiscounts = null;
	private String site;
	private String store;
	private String guid = null;
	private boolean calculated;
	ArrayList<Object> appliedVouchers = new ArrayList<Object>( );
	private String user = null;
	ArrayList<Object> pickupOrderGroups = new ArrayList<Object>( );
	ArrayList<Object> deliveryOrderGroups = new ArrayList<Object>( );
	private float pickupItemsQuantity;
	private float deliveryItemsQuantity;
	private float totalUnitCount;
	ArrayList<Object> comments = new ArrayList<Object>( );
	ArrayList<Object> rootGroups = new ArrayList<Object>( );
	private String appliedDiscounts = null;
	private String appliedDiscountsSection = null;
	private String discountData = null;
	private String priceTotals = null;
	private String orderCardNumber = null;
	private String totalDiscountsValue = null;
	TotalGrossValue TotalGrossValueObject;
	private String expiryDate = null;
	Buyer BuyerObject;
	private String selectedDiscountReason = null;
	private String appliedDiscountReasons = null;
	private String discountReasons = null;
	ArrayList<Object> sectionCategory = new ArrayList<Object>( );
	private String commercialApprovalLogs = null;
	ArrayList<Object> potentialOrderPromotions = new ArrayList<Object>( );
	ArrayList<Object> potentialProductPromotions = new ArrayList<Object>( );
	private String saveTime = null;
	private String savedBy = null;
	private String quoteData = null;
	private String importStatus = null;
	private String costCenter = null;
	PaymentType PaymentTypeObject;
	private String purchaseOrderNumber = null;
	private String b2BComment = null;
	B2bCustomerData B2bCustomerDataObject;
	private boolean quoteAllowed;
	private boolean isCelebre;
	private boolean isBNDES;
	private boolean buyerIsPJ;
	private String isCurrent = null;
	private float data;
	private float totalWeight;
	Status StatusObject;
	private String orderType;
	EntriesForOutgoingFlows EntriesForOutgoingFlowsObject;
	ArrayList<Object> transactions = new ArrayList<Object>( );
	private String linkedOldCartCode = null;
	private boolean isRedeliveryOrCollect;
	private boolean showModalRedeliveryOrCollect;
	private boolean ignoreFraud;
	private String antiFraudReasonRefuse = null;
	private String antiFraudSolicitation = null;
	ArrayList<Object> paymentTransactions = new ArrayList<Object>( );
	CanEdit CanEditObject;
	PaymentAddress PaymentAddressObject;
	private String lastAntiFraudLog = null;
	ProductQuantityHash ProductQuantityHashObject;
	private String storeName;
	private String elegibleMessage = null;
	private String dateEliminatedOrder = null;
	private String userEdit = null;
	private String davNumber = null;
	private String preSaleNumber = null;
	private boolean userPartialApproverPermission;
	LastStatus LastStatusObject;
	private String comApprovalWeightedMargin = null;
	private String canEditCart = null;
	private String note;
	private String invoiceObservation = null;
	private String editStatus = null;
	private String canRelease = null;
	private String release = null;
	private String commercialApprovalType;
	private String cartName = null;
	private boolean isAvailableBndes;
	private String channel;
	private String comercialApprovalDate = null;
	private String followUpReason = null;
	private float creationtime;
	AntiFraudApprovalUser AntiFraudApprovalUserObject;
	private String antiFraudApprovalDate = null;
	private String isWarrantyProductService = null;
	private String isWarrantyServiceIncrease = null;
	private String isWarrantyServiceDecrease = null;

	// Getter Methods

	public String getCode( )
	{
		return code;
	}

	public String getName( )
	{
		return name;
	}

	public String getDescription( )
	{
		return description;
	}

	public String getExpirationTime( )
	{
		return expirationTime;
	}

	public boolean getNet( )
	{
		return net;
	}

	public TotalPriceWithTax getTotalPriceWithTax( )
	{
		return TotalPriceWithTaxObject;
	}

	public TotalPrice getTotalPrice( )
	{
		return TotalPriceObject;
	}

	public TotalTax getTotalTax( )
	{
		return TotalTaxObject;
	}

	public SubTotal getSubTotal( )
	{
		return SubTotalObject;
	}

	public SubTotalWithoutQuoteDiscounts getSubTotalWithoutQuoteDiscounts( )
	{
		return SubTotalWithoutQuoteDiscountsObject;
	}

	public DeliveryCost getDeliveryCost( )
	{
		return DeliveryCostObject;
	}

	public float getTotalItems( )
	{
		return totalItems;
	}

	public String getDeliveryMode( )
	{
		return deliveryMode;
	}

	public DeliveryAddress getDeliveryAddress( )
	{
		return DeliveryAddressObject;
	}

	public String getPaymentInfo( )
	{
		return paymentInfo;
	}

	public ProductDiscounts getProductDiscounts( )
	{
		return ProductDiscountsObject;
	}

	public OrderDiscounts getOrderDiscounts( )
	{
		return OrderDiscountsObject;
	}

	public QuoteDiscounts getQuoteDiscounts( )
	{
		return QuoteDiscountsObject;
	}

	public float getQuoteDiscountsRate( )
	{
		return quoteDiscountsRate;
	}

	public String getQuoteDiscountsType( )
	{
		return quoteDiscountsType;
	}

	public TotalDiscounts getTotalDiscounts( )
	{
		return TotalDiscountsObject;
	}

	public TotalDiscountsWithQuoteDiscounts getTotalDiscountsWithQuoteDiscounts( )
	{
		return TotalDiscountsWithQuoteDiscountsObject;
	}

	public String getSubTotalWithDiscounts( )
	{
		return subTotalWithDiscounts;
	}

	public String getSite( )
	{
		return site;
	}

	public String getStore( )
	{
		return store;
	}

	public String getGuid( )
	{
		return guid;
	}

	public boolean getCalculated( )
	{
		return calculated;
	}

	public String getUser( )
	{
		return user;
	}

	public float getPickupItemsQuantity( )
	{
		return pickupItemsQuantity;
	}

	public float getDeliveryItemsQuantity( )
	{
		return deliveryItemsQuantity;
	}

	public float getTotalUnitCount( )
	{
		return totalUnitCount;
	}

	public String getAppliedDiscounts( )
	{
		return appliedDiscounts;
	}

	public String getAppliedDiscountsSection( )
	{
		return appliedDiscountsSection;
	}

	public String getDiscountData( )
	{
		return discountData;
	}

	public String getPriceTotals( )
	{
		return priceTotals;
	}

	public String getOrderCardNumber( )
	{
		return orderCardNumber;
	}

	public String getTotalDiscountsValue( )
	{
		return totalDiscountsValue;
	}

	public TotalGrossValue getTotalGrossValue( )
	{
		return TotalGrossValueObject;
	}

	public String getExpiryDate( )
	{
		return expiryDate;
	}

	public Buyer getBuyer( )
	{
		return BuyerObject;
	}

	public String getSelectedDiscountReason( )
	{
		return selectedDiscountReason;
	}

	public String getAppliedDiscountReasons( )
	{
		return appliedDiscountReasons;
	}

	public String getDiscountReasons( )
	{
		return discountReasons;
	}

	public String getCommercialApprovalLogs( )
	{
		return commercialApprovalLogs;
	}

	public String getSaveTime( )
	{
		return saveTime;
	}

	public String getSavedBy( )
	{
		return savedBy;
	}

	public String getQuoteData( )
	{
		return quoteData;
	}

	public String getImportStatus( )
	{
		return importStatus;
	}

	public String getCostCenter( )
	{
		return costCenter;
	}

	public PaymentType getPaymentType( )
	{
		return PaymentTypeObject;
	}

	public String getPurchaseOrderNumber( )
	{
		return purchaseOrderNumber;
	}

	public String getB2BComment( )
	{
		return b2BComment;
	}

	public B2bCustomerData getB2bCustomerData( )
	{
		return B2bCustomerDataObject;
	}

	public boolean getQuoteAllowed( )
	{
		return quoteAllowed;
	}

	public boolean getIsCelebre( )
	{
		return isCelebre;
	}

	public boolean getIsBNDES( )
	{
		return isBNDES;
	}

	public boolean getBuyerIsPJ( )
	{
		return buyerIsPJ;
	}

	public String getIsCurrent( )
	{
		return isCurrent;
	}

	public float getData( )
	{
		return data;
	}

	public float getTotalWeight( )
	{
		return totalWeight;
	}

	public Status getStatus( )
	{
		return StatusObject;
	}

	public String getOrderType( )
	{
		return orderType;
	}

	public EntriesForOutgoingFlows getEntriesForOutgoingFlows( )
	{
		return EntriesForOutgoingFlowsObject;
	}

	public String getLinkedOldCartCode( )
	{
		return linkedOldCartCode;
	}

	public boolean getIsRedeliveryOrCollect( )
	{
		return isRedeliveryOrCollect;
	}

	public boolean getShowModalRedeliveryOrCollect( )
	{
		return showModalRedeliveryOrCollect;
	}

	public boolean getIgnoreFraud( )
	{
		return ignoreFraud;
	}

	public String getAntiFraudReasonRefuse( )
	{
		return antiFraudReasonRefuse;
	}

	public String getAntiFraudSolicitation( )
	{
		return antiFraudSolicitation;
	}

	public CanEdit getCanEdit( )
	{
		return CanEditObject;
	}

	public PaymentAddress getPaymentAddress( )
	{
		return PaymentAddressObject;
	}

	public String getLastAntiFraudLog( )
	{
		return lastAntiFraudLog;
	}

	public ProductQuantityHash getProductQuantityHash( )
	{
		return ProductQuantityHashObject;
	}

	public String getStoreName( )
	{
		return storeName;
	}

	public String getElegibleMessage( )
	{
		return elegibleMessage;
	}

	public String getDateEliminatedOrder( )
	{
		return dateEliminatedOrder;
	}

	public String getUserEdit( )
	{
		return userEdit;
	}

	public String getDavNumber( )
	{
		return davNumber;
	}

	public String getPreSaleNumber( )
	{
		return preSaleNumber;
	}

	public boolean getUserPartialApproverPermission( )
	{
		return userPartialApproverPermission;
	}

	public LastStatus getLastStatus( )
	{
		return LastStatusObject;
	}

	public String getComApprovalWeightedMargin( )
	{
		return comApprovalWeightedMargin;
	}

	public String getCanEditCart( )
	{
		return canEditCart;
	}

	public String getNote( )
	{
		return note;
	}

	public String getInvoiceObservation( )
	{
		return invoiceObservation;
	}

	public String getEditStatus( )
	{
		return editStatus;
	}

	public String getCanRelease( )
	{
		return canRelease;
	}

	public String getRelease( )
	{
		return release;
	}

	public String getCommercialApprovalType( )
	{
		return commercialApprovalType;
	}

	public String getCartName( )
	{
		return cartName;
	}

	public boolean getIsAvailableBndes( )
	{
		return isAvailableBndes;
	}

	public String getChannel( )
	{
		return channel;
	}

	public String getComercialApprovalDate( )
	{
		return comercialApprovalDate;
	}

	public String getFollowUpReason( )
	{
		return followUpReason;
	}

	public float getCreationtime( )
	{
		return creationtime;
	}

	public AntiFraudApprovalUser getAntiFraudApprovalUser( )
	{
		return AntiFraudApprovalUserObject;
	}

	public String getAntiFraudApprovalDate( )
	{
		return antiFraudApprovalDate;
	}

	public String getIsWarrantyProductService( )
	{
		return isWarrantyProductService;
	}

	public String getIsWarrantyServiceIncrease( )
	{
		return isWarrantyServiceIncrease;
	}

	public String getIsWarrantyServiceDecrease( )
	{
		return isWarrantyServiceDecrease;
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

	public void setDescription( String description )
	{
		this.description = description;
	}

	public void setExpirationTime( String expirationTime )
	{
		this.expirationTime = expirationTime;
	}

	public void setNet( boolean net )
	{
		this.net = net;
	}

	public void setTotalPriceWithTax( TotalPriceWithTax totalPriceWithTaxObject )
	{
		this.TotalPriceWithTaxObject = totalPriceWithTaxObject;
	}

	public void setTotalPrice( TotalPrice totalPriceObject )
	{
		this.TotalPriceObject = totalPriceObject;
	}

	public void setTotalTax( TotalTax totalTaxObject )
	{
		this.TotalTaxObject = totalTaxObject;
	}

	public void setSubTotal( SubTotal subTotalObject )
	{
		this.SubTotalObject = subTotalObject;
	}

	public void setSubTotalWithoutQuoteDiscounts(
			SubTotalWithoutQuoteDiscounts subTotalWithoutQuoteDiscountsObject )
	{
		this.SubTotalWithoutQuoteDiscountsObject = subTotalWithoutQuoteDiscountsObject;
	}

	public void setDeliveryCost( DeliveryCost deliveryCostObject )
	{
		this.DeliveryCostObject = deliveryCostObject;
	}

	public void setTotalItems( float totalItems )
	{
		this.totalItems = totalItems;
	}

	public void setDeliveryMode( String deliveryMode )
	{
		this.deliveryMode = deliveryMode;
	}

	public void setDeliveryAddress( DeliveryAddress deliveryAddressObject )
	{
		this.DeliveryAddressObject = deliveryAddressObject;
	}

	public void setPaymentInfo( String paymentInfo )
	{
		this.paymentInfo = paymentInfo;
	}

	public void setProductDiscounts( ProductDiscounts productDiscountsObject )
	{
		this.ProductDiscountsObject = productDiscountsObject;
	}

	public void setOrderDiscounts( OrderDiscounts orderDiscountsObject )
	{
		this.OrderDiscountsObject = orderDiscountsObject;
	}

	public void setQuoteDiscounts( QuoteDiscounts quoteDiscountsObject )
	{
		this.QuoteDiscountsObject = quoteDiscountsObject;
	}

	public void setQuoteDiscountsRate( float quoteDiscountsRate )
	{
		this.quoteDiscountsRate = quoteDiscountsRate;
	}

	public void setQuoteDiscountsType( String quoteDiscountsType )
	{
		this.quoteDiscountsType = quoteDiscountsType;
	}

	public void setTotalDiscounts( TotalDiscounts totalDiscountsObject )
	{
		this.TotalDiscountsObject = totalDiscountsObject;
	}

	public void setTotalDiscountsWithQuoteDiscounts(
			TotalDiscountsWithQuoteDiscounts totalDiscountsWithQuoteDiscountsObject )
	{
		this.TotalDiscountsWithQuoteDiscountsObject = totalDiscountsWithQuoteDiscountsObject;
	}

	public void setSubTotalWithDiscounts( String subTotalWithDiscounts )
	{
		this.subTotalWithDiscounts = subTotalWithDiscounts;
	}

	public void setSite( String site )
	{
		this.site = site;
	}

	public void setStore( String store )
	{
		this.store = store;
	}

	public void setGuid( String guid )
	{
		this.guid = guid;
	}

	public void setCalculated( boolean calculated )
	{
		this.calculated = calculated;
	}

	public void setUser( String user )
	{
		this.user = user;
	}

	public void setPickupItemsQuantity( float pickupItemsQuantity )
	{
		this.pickupItemsQuantity = pickupItemsQuantity;
	}

	public void setDeliveryItemsQuantity( float deliveryItemsQuantity )
	{
		this.deliveryItemsQuantity = deliveryItemsQuantity;
	}

	public void setTotalUnitCount( float totalUnitCount )
	{
		this.totalUnitCount = totalUnitCount;
	}

	public void setAppliedDiscounts( String appliedDiscounts )
	{
		this.appliedDiscounts = appliedDiscounts;
	}

	public void setAppliedDiscountsSection( String appliedDiscountsSection )
	{
		this.appliedDiscountsSection = appliedDiscountsSection;
	}

	public void setDiscountData( String discountData )
	{
		this.discountData = discountData;
	}

	public void setPriceTotals( String priceTotals )
	{
		this.priceTotals = priceTotals;
	}

	public void setOrderCardNumber( String orderCardNumber )
	{
		this.orderCardNumber = orderCardNumber;
	}

	public void setTotalDiscountsValue( String totalDiscountsValue )
	{
		this.totalDiscountsValue = totalDiscountsValue;
	}

	public void setTotalGrossValue( TotalGrossValue totalGrossValueObject )
	{
		this.TotalGrossValueObject = totalGrossValueObject;
	}

	public void setExpiryDate( String expiryDate )
	{
		this.expiryDate = expiryDate;
	}

	public void setBuyer( Buyer buyerObject )
	{
		this.BuyerObject = buyerObject;
	}

	public void setSelectedDiscountReason( String selectedDiscountReason )
	{
		this.selectedDiscountReason = selectedDiscountReason;
	}

	public void setAppliedDiscountReasons( String appliedDiscountReasons )
	{
		this.appliedDiscountReasons = appliedDiscountReasons;
	}

	public void setDiscountReasons( String discountReasons )
	{
		this.discountReasons = discountReasons;
	}

	public void setCommercialApprovalLogs( String commercialApprovalLogs )
	{
		this.commercialApprovalLogs = commercialApprovalLogs;
	}

	public void setSaveTime( String saveTime )
	{
		this.saveTime = saveTime;
	}

	public void setSavedBy( String savedBy )
	{
		this.savedBy = savedBy;
	}

	public void setQuoteData( String quoteData )
	{
		this.quoteData = quoteData;
	}

	public void setImportStatus( String importStatus )
	{
		this.importStatus = importStatus;
	}

	public void setCostCenter( String costCenter )
	{
		this.costCenter = costCenter;
	}

	public void setPaymentType( PaymentType paymentTypeObject )
	{
		this.PaymentTypeObject = paymentTypeObject;
	}

	public void setPurchaseOrderNumber( String purchaseOrderNumber )
	{
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public void setB2BComment( String b2BComment )
	{
		this.b2BComment = b2BComment;
	}

	public void setB2bCustomerData( B2bCustomerData b2bCustomerDataObject )
	{
		this.B2bCustomerDataObject = b2bCustomerDataObject;
	}

	public void setQuoteAllowed( boolean quoteAllowed )
	{
		this.quoteAllowed = quoteAllowed;
	}

	public void setIsCelebre( boolean isCelebre )
	{
		this.isCelebre = isCelebre;
	}

	public void setIsBNDES( boolean isBNDES )
	{
		this.isBNDES = isBNDES;
	}

	public void setBuyerIsPJ( boolean buyerIsPJ )
	{
		this.buyerIsPJ = buyerIsPJ;
	}

	public void setIsCurrent( String isCurrent )
	{
		this.isCurrent = isCurrent;
	}

	public void setData( float data )
	{
		this.data = data;
	}

	public void setTotalWeight( float totalWeight )
	{
		this.totalWeight = totalWeight;
	}

	public void setStatus( Status statusObject )
	{
		this.StatusObject = statusObject;
	}

	public void setOrderType( String orderType )
	{
		this.orderType = orderType;
	}

	public void setEntriesForOutgoingFlows( EntriesForOutgoingFlows entriesForOutgoingFlowsObject )
	{
		this.EntriesForOutgoingFlowsObject = entriesForOutgoingFlowsObject;
	}

	public void setLinkedOldCartCode( String linkedOldCartCode )
	{
		this.linkedOldCartCode = linkedOldCartCode;
	}

	public void setIsRedeliveryOrCollect( boolean isRedeliveryOrCollect )
	{
		this.isRedeliveryOrCollect = isRedeliveryOrCollect;
	}

	public void setShowModalRedeliveryOrCollect( boolean showModalRedeliveryOrCollect )
	{
		this.showModalRedeliveryOrCollect = showModalRedeliveryOrCollect;
	}

	public void setIgnoreFraud( boolean ignoreFraud )
	{
		this.ignoreFraud = ignoreFraud;
	}

	public void setAntiFraudReasonRefuse( String antiFraudReasonRefuse )
	{
		this.antiFraudReasonRefuse = antiFraudReasonRefuse;
	}

	public void setAntiFraudSolicitation( String antiFraudSolicitation )
	{
		this.antiFraudSolicitation = antiFraudSolicitation;
	}

	public void setCanEdit( CanEdit canEditObject )
	{
		this.CanEditObject = canEditObject;
	}

	public void setPaymentAddress( PaymentAddress paymentAddressObject )
	{
		this.PaymentAddressObject = paymentAddressObject;
	}

	public void setLastAntiFraudLog( String lastAntiFraudLog )
	{
		this.lastAntiFraudLog = lastAntiFraudLog;
	}

	public void setProductQuantityHash( ProductQuantityHash productQuantityHashObject )
	{
		this.ProductQuantityHashObject = productQuantityHashObject;
	}

	public void setStoreName( String storeName )
	{
		this.storeName = storeName;
	}

	public void setElegibleMessage( String elegibleMessage )
	{
		this.elegibleMessage = elegibleMessage;
	}

	public void setDateEliminatedOrder( String dateEliminatedOrder )
	{
		this.dateEliminatedOrder = dateEliminatedOrder;
	}

	public void setUserEdit( String userEdit )
	{
		this.userEdit = userEdit;
	}

	public void setDavNumber( String davNumber )
	{
		this.davNumber = davNumber;
	}

	public void setPreSaleNumber( String preSaleNumber )
	{
		this.preSaleNumber = preSaleNumber;
	}

	public void setUserPartialApproverPermission( boolean userPartialApproverPermission )
	{
		this.userPartialApproverPermission = userPartialApproverPermission;
	}

	public void setLastStatus( LastStatus lastStatusObject )
	{
		this.LastStatusObject = lastStatusObject;
	}

	public void setComApprovalWeightedMargin( String comApprovalWeightedMargin )
	{
		this.comApprovalWeightedMargin = comApprovalWeightedMargin;
	}

	public void setCanEditCart( String canEditCart )
	{
		this.canEditCart = canEditCart;
	}

	public void setNote( String note )
	{
		this.note = note;
	}

	public void setInvoiceObservation( String invoiceObservation )
	{
		this.invoiceObservation = invoiceObservation;
	}

	public void setEditStatus( String editStatus )
	{
		this.editStatus = editStatus;
	}

	public void setCanRelease( String canRelease )
	{
		this.canRelease = canRelease;
	}

	public void setRelease( String release )
	{
		this.release = release;
	}

	public void setCommercialApprovalType( String commercialApprovalType )
	{
		this.commercialApprovalType = commercialApprovalType;
	}

	public void setCartName( String cartName )
	{
		this.cartName = cartName;
	}

	public void setIsAvailableBndes( boolean isAvailableBndes )
	{
		this.isAvailableBndes = isAvailableBndes;
	}

	public void setChannel( String channel )
	{
		this.channel = channel;
	}

	public void setComercialApprovalDate( String comercialApprovalDate )
	{
		this.comercialApprovalDate = comercialApprovalDate;
	}

	public void setFollowUpReason( String followUpReason )
	{
		this.followUpReason = followUpReason;
	}

	public void setCreationtime( float creationtime )
	{
		this.creationtime = creationtime;
	}

	public void setAntiFraudApprovalUser( AntiFraudApprovalUser antiFraudApprovalUserObject )
	{
		this.AntiFraudApprovalUserObject = antiFraudApprovalUserObject;
	}

	public void setAntiFraudApprovalDate( String antiFraudApprovalDate )
	{
		this.antiFraudApprovalDate = antiFraudApprovalDate;
	}

	public void setIsWarrantyProductService( String isWarrantyProductService )
	{
		this.isWarrantyProductService = isWarrantyProductService;
	}

	public void setIsWarrantyServiceIncrease( String isWarrantyServiceIncrease )
	{
		this.isWarrantyServiceIncrease = isWarrantyServiceIncrease;
	}

	public void setIsWarrantyServiceDecrease( String isWarrantyServiceDecrease )
	{
		this.isWarrantyServiceDecrease = isWarrantyServiceDecrease;
	}
}