package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class Entry
{
	private float entryNumber;
	private float quantity;
	BasePrice basePrice;
	TotalPrice totalPrice;
	Product product;
	private boolean updateable;
	DeliveryMode deliveryMode;
	DeliveryPointOfService deliveryPointOfService;
	private String entries = null;
	ArrayList<Object> configurationInfos = new ArrayList<Object>( );
	StatusSummaryMap statusSummaryMap;
	ArrayList<Object> entryGroupNumbers = new ArrayList<Object>( );
	ArrayList<Object> comments = new ArrayList<Object>( );
	ArrayList<Object> supportedActions = new ArrayList<Object>( );
	private String url = null;
	private float cancellableQty;
	private float returnableQty;
	private String cancelledItemsPrice = null;
	private String returnedItemsPrice = null;
	private boolean isCompetitorPrice;
	private boolean isAvailableToDealingParameters;
	private boolean isParametersReason;
	DiscountData discountData;
	ArrayList<Object> discountValues = new ArrayList<Object>( );
	private boolean combinedReason;
	private String storageCenterWarehouseCode;
	OutgoingFlow OutgoingFlow;
	private String outboundFilial;
	private float dateView;
	private boolean containErrorSeparation;
	private float separatedQuantity;
	private String separationMsgError;
	private float billedQuantityByDocuments;
	private float maxPercentDiscountAllowed;
	private float maxMonetaryDiscountAllowed;
	private boolean editDiscountEcommerce;
	private String offerCode;
	private String vendorName = null;
	private boolean isMarketplace;
	private String appliedDiscounts = null;
	private float creationTime;
	private String deliveryShift;
	private String withdrawalScheduling;
	private String deliveryScheduling;
	private String storageCenterWarehouseName;
	private String storageCenterName;
	private String storageCenter;
	private String billedQuantity = null;
	private String refundedQuantity = null;
	private String returnedQuantity = null;
	CreationUser creationUser;
	private String quantityStatusName = null;
	ExpeditionCenter expeditionCenter;
	private boolean isSite;
	private String shippingCompany = null;
	private String quantityAllocated = null;
	private String quantityUnallocated = null;
	private String quantityCancelled = null;
	private String quantityPending = null;
	private String quantityShipped = null;
	private String quantityReturned = null;
	SelectedOrderOutgoingFlow selectedOrderOutgoingFlow;
	private String availableOrderOutgoingFlowList = null;
	DefaultOrderOutgoingFlow defaultOrderOutgoingFlow;
	private String groupOutgoingFlow = null;
	private String groupServiceFlow = null;
	ExpeditionWarehouseInfo expeditionWarehouseInfo;
	ExpeditionCenterInfo expeditionCenterInfo;
	StorageCenterInfo storageCenterInfo;
	private String center = null;
	private float quantityDec;
	private float totalWeight;
	private float packageQuantity;
	private String weightUnit;
	private String productBatch;
	private String specialPrice = null;
	private String staticSpecialPrice = null;
	private String margin = null;
	private String comercialization = null;
	private String isPossiblePackage = null;
	private String packageChecked = null;
	private boolean bathDefinedByUser;
	private boolean showMonitor;
	private String deliverySchedulingTime = null;
	private String centerCodeATP = null;
	private boolean isImported;
	private boolean isVMI;
	private boolean isVMIWithATP;
	private String quantityReserved = null;
	private boolean canAppliedDiscounts;
	private float totalPriceWithoutDiscount;
	private boolean isWarrantyProductService;
	private boolean hasTicketWarranty;
	private String warrantyServiceTicketNumber = null;
	private String categoryRootCode = null;
	private String categoryRootDescription = null;
	private String leftOverQuantity = null;
	private String leftOverPercentage = null;
	private String packageCheckedBlocked = null;
	private String forceRemoveMarketplace = null;
	private String currentStoreName;
	private String maxAvailableQty;
	private String biggestBatchQty;
	private String specialPriceReason = null;
	private boolean isSplited;
	private String warehouseSplited = null;
	private boolean isComplexDiscount;
	private boolean isFidelityDiscount;
	private String selectedDiscountReason = null;
	private String appliedDiscountReasons = null;
	ArrayList<Object> discountReasons = new ArrayList<Object>( );
	private float decimalQuantity;
	private float packagingQuantity;
	private float integerQuantity;
	private String schedulingCode = null;
	private boolean possibleApprovalProduct;
	RootCategory rootCategory;
	private String serviceEntry = null;
	private String sourceEntryPK;
	private float dateDeliveryRemoval;
	private String note = null;
	private float deliveryDate;
	private String deliveryTime = null;
	private String deliveryShiftEnum = null;
	private String defaultOutgoingFlow = null;
	private String pdvdiscounts = null;

	public float getEntryNumber( )
	{
		return entryNumber;
	}

	public void setEntryNumber( float entryNumber )
	{
		this.entryNumber = entryNumber;
	}

	public float getQuantity( )
	{
		return quantity;
	}

	public void setQuantity( float quantity )
	{
		this.quantity = quantity;
	}

	public BasePrice getBasePrice( )
	{
		return basePrice;
	}

	public void setBasePrice( BasePrice basePrice )
	{
		this.basePrice = basePrice;
	}

	public TotalPrice getTotalPrice( )
	{
		return totalPrice;
	}

	public void setTotalPrice( TotalPrice totalPrice )
	{
		this.totalPrice = totalPrice;
	}

	public Product getProduct( )
	{
		return product;
	}

	public void setProduct( Product product )
	{
		this.product = product;
	}

	public boolean isUpdateable( )
	{
		return updateable;
	}

	public void setUpdateable( boolean updateable )
	{
		this.updateable = updateable;
	}

	public DeliveryMode getDeliveryMode( )
	{
		return deliveryMode;
	}

	public void setDeliveryMode( DeliveryMode deliveryMode )
	{
		this.deliveryMode = deliveryMode;
	}

	public DeliveryPointOfService getDeliveryPointOfService( )
	{
		return deliveryPointOfService;
	}

	public void setDeliveryPointOfService( DeliveryPointOfService deliveryPointOfService )
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}

	public String getEntries( )
	{
		return entries;
	}

	public void setEntries( String entries )
	{
		this.entries = entries;
	}

	public ArrayList<Object> getConfigurationInfos( )
	{
		return configurationInfos;
	}

	public void setConfigurationInfos( ArrayList<Object> configurationInfos )
	{
		this.configurationInfos = configurationInfos;
	}

	public StatusSummaryMap getStatusSummaryMap( )
	{
		return statusSummaryMap;
	}

	public void setStatusSummaryMap( StatusSummaryMap statusSummaryMap )
	{
		this.statusSummaryMap = statusSummaryMap;
	}

	public ArrayList<Object> getEntryGroupNumbers( )
	{
		return entryGroupNumbers;
	}

	public void setEntryGroupNumbers( ArrayList<Object> entryGroupNumbers )
	{
		this.entryGroupNumbers = entryGroupNumbers;
	}

	public ArrayList<Object> getComments( )
	{
		return comments;
	}

	public void setComments( ArrayList<Object> comments )
	{
		this.comments = comments;
	}

	public ArrayList<Object> getSupportedActions( )
	{
		return supportedActions;
	}

	public void setSupportedActions( ArrayList<Object> supportedActions )
	{
		this.supportedActions = supportedActions;
	}

	public String getUrl( )
	{
		return url;
	}

	public void setUrl( String url )
	{
		this.url = url;
	}

	public float getCancellableQty( )
	{
		return cancellableQty;
	}

	public void setCancellableQty( float cancellableQty )
	{
		this.cancellableQty = cancellableQty;
	}

	public float getReturnableQty( )
	{
		return returnableQty;
	}

	public void setReturnableQty( float returnableQty )
	{
		this.returnableQty = returnableQty;
	}

	public String getCancelledItemsPrice( )
	{
		return cancelledItemsPrice;
	}

	public void setCancelledItemsPrice( String cancelledItemsPrice )
	{
		this.cancelledItemsPrice = cancelledItemsPrice;
	}

	public String getReturnedItemsPrice( )
	{
		return returnedItemsPrice;
	}

	public void setReturnedItemsPrice( String returnedItemsPrice )
	{
		this.returnedItemsPrice = returnedItemsPrice;
	}

	public boolean isCompetitorPrice( )
	{
		return isCompetitorPrice;
	}

	public void setCompetitorPrice( boolean competitorPrice )
	{
		isCompetitorPrice = competitorPrice;
	}

	public boolean isAvailableToDealingParameters( )
	{
		return isAvailableToDealingParameters;
	}

	public void setAvailableToDealingParameters( boolean availableToDealingParameters )
	{
		isAvailableToDealingParameters = availableToDealingParameters;
	}

	public boolean isParametersReason( )
	{
		return isParametersReason;
	}

	public void setParametersReason( boolean parametersReason )
	{
		isParametersReason = parametersReason;
	}

	public DiscountData getDiscountData( )
	{
		return discountData;
	}

	public void setDiscountData( DiscountData discountData )
	{
		this.discountData = discountData;
	}

	public ArrayList<Object> getDiscountValues( )
	{
		return discountValues;
	}

	public void setDiscountValues( ArrayList<Object> discountValues )
	{
		this.discountValues = discountValues;
	}

	public boolean isCombinedReason( )
	{
		return combinedReason;
	}

	public void setCombinedReason( boolean combinedReason )
	{
		this.combinedReason = combinedReason;
	}

	public String getStorageCenterWarehouseCode( )
	{
		return storageCenterWarehouseCode;
	}

	public void setStorageCenterWarehouseCode( String storageCenterWarehouseCode )
	{
		this.storageCenterWarehouseCode = storageCenterWarehouseCode;
	}

	public com.leroymerlin.va.validation.pojo.OutgoingFlow getOutgoingFlow( )
	{
		return OutgoingFlow;
	}

	public void setOutgoingFlow( com.leroymerlin.va.validation.pojo.OutgoingFlow outgoingFlow )
	{
		OutgoingFlow = outgoingFlow;
	}

	public String getOutboundFilial( )
	{
		return outboundFilial;
	}

	public void setOutboundFilial( String outboundFilial )
	{
		this.outboundFilial = outboundFilial;
	}

	public float getDateView( )
	{
		return dateView;
	}

	public void setDateView( float dateView )
	{
		this.dateView = dateView;
	}

	public boolean isContainErrorSeparation( )
	{
		return containErrorSeparation;
	}

	public void setContainErrorSeparation( boolean containErrorSeparation )
	{
		this.containErrorSeparation = containErrorSeparation;
	}

	public float getSeparatedQuantity( )
	{
		return separatedQuantity;
	}

	public void setSeparatedQuantity( float separatedQuantity )
	{
		this.separatedQuantity = separatedQuantity;
	}

	public String getSeparationMsgError( )
	{
		return separationMsgError;
	}

	public void setSeparationMsgError( String separationMsgError )
	{
		this.separationMsgError = separationMsgError;
	}

	public float getBilledQuantityByDocuments( )
	{
		return billedQuantityByDocuments;
	}

	public void setBilledQuantityByDocuments( float billedQuantityByDocuments )
	{
		this.billedQuantityByDocuments = billedQuantityByDocuments;
	}

	public float getMaxPercentDiscountAllowed( )
	{
		return maxPercentDiscountAllowed;
	}

	public void setMaxPercentDiscountAllowed( float maxPercentDiscountAllowed )
	{
		this.maxPercentDiscountAllowed = maxPercentDiscountAllowed;
	}

	public float getMaxMonetaryDiscountAllowed( )
	{
		return maxMonetaryDiscountAllowed;
	}

	public void setMaxMonetaryDiscountAllowed( float maxMonetaryDiscountAllowed )
	{
		this.maxMonetaryDiscountAllowed = maxMonetaryDiscountAllowed;
	}

	public boolean isEditDiscountEcommerce( )
	{
		return editDiscountEcommerce;
	}

	public void setEditDiscountEcommerce( boolean editDiscountEcommerce )
	{
		this.editDiscountEcommerce = editDiscountEcommerce;
	}

	public String getOfferCode( )
	{
		return offerCode;
	}

	public void setOfferCode( String offerCode )
	{
		this.offerCode = offerCode;
	}

	public String getVendorName( )
	{
		return vendorName;
	}

	public void setVendorName( String vendorName )
	{
		this.vendorName = vendorName;
	}

	public boolean isMarketplace( )
	{
		return isMarketplace;
	}

	public void setMarketplace( boolean marketplace )
	{
		isMarketplace = marketplace;
	}

	public String getAppliedDiscounts( )
	{
		return appliedDiscounts;
	}

	public void setAppliedDiscounts( String appliedDiscounts )
	{
		this.appliedDiscounts = appliedDiscounts;
	}

	public float getCreationTime( )
	{
		return creationTime;
	}

	public void setCreationTime( float creationTime )
	{
		this.creationTime = creationTime;
	}

	public String getDeliveryShift( )
	{
		return deliveryShift;
	}

	public void setDeliveryShift( String deliveryShift )
	{
		this.deliveryShift = deliveryShift;
	}

	public String getWithdrawalScheduling( )
	{
		return withdrawalScheduling;
	}

	public void setWithdrawalScheduling( String withdrawalScheduling )
	{
		this.withdrawalScheduling = withdrawalScheduling;
	}

	public String getDeliveryScheduling( )
	{
		return deliveryScheduling;
	}

	public void setDeliveryScheduling( String deliveryScheduling )
	{
		this.deliveryScheduling = deliveryScheduling;
	}

	public String getStorageCenterWarehouseName( )
	{
		return storageCenterWarehouseName;
	}

	public void setStorageCenterWarehouseName( String storageCenterWarehouseName )
	{
		this.storageCenterWarehouseName = storageCenterWarehouseName;
	}

	public String getStorageCenterName( )
	{
		return storageCenterName;
	}

	public void setStorageCenterName( String storageCenterName )
	{
		this.storageCenterName = storageCenterName;
	}

	public String getStorageCenter( )
	{
		return storageCenter;
	}

	public void setStorageCenter( String storageCenter )
	{
		this.storageCenter = storageCenter;
	}

	public String getBilledQuantity( )
	{
		return billedQuantity;
	}

	public void setBilledQuantity( String billedQuantity )
	{
		this.billedQuantity = billedQuantity;
	}

	public String getRefundedQuantity( )
	{
		return refundedQuantity;
	}

	public void setRefundedQuantity( String refundedQuantity )
	{
		this.refundedQuantity = refundedQuantity;
	}

	public String getReturnedQuantity( )
	{
		return returnedQuantity;
	}

	public void setReturnedQuantity( String returnedQuantity )
	{
		this.returnedQuantity = returnedQuantity;
	}

	public CreationUser getCreationUser( )
	{
		return creationUser;
	}

	public void setCreationUser( CreationUser creationUser )
	{
		this.creationUser = creationUser;
	}

	public String getQuantityStatusName( )
	{
		return quantityStatusName;
	}

	public void setQuantityStatusName( String quantityStatusName )
	{
		this.quantityStatusName = quantityStatusName;
	}

	public ExpeditionCenter getExpeditionCenter( )
	{
		return expeditionCenter;
	}

	public void setExpeditionCenter( ExpeditionCenter expeditionCenter )
	{
		this.expeditionCenter = expeditionCenter;
	}

	public boolean isSite( )
	{
		return isSite;
	}

	public void setSite( boolean site )
	{
		isSite = site;
	}

	public String getShippingCompany( )
	{
		return shippingCompany;
	}

	public void setShippingCompany( String shippingCompany )
	{
		this.shippingCompany = shippingCompany;
	}

	public String getQuantityAllocated( )
	{
		return quantityAllocated;
	}

	public void setQuantityAllocated( String quantityAllocated )
	{
		this.quantityAllocated = quantityAllocated;
	}

	public String getQuantityUnallocated( )
	{
		return quantityUnallocated;
	}

	public void setQuantityUnallocated( String quantityUnallocated )
	{
		this.quantityUnallocated = quantityUnallocated;
	}

	public String getQuantityCancelled( )
	{
		return quantityCancelled;
	}

	public void setQuantityCancelled( String quantityCancelled )
	{
		this.quantityCancelled = quantityCancelled;
	}

	public String getQuantityPending( )
	{
		return quantityPending;
	}

	public void setQuantityPending( String quantityPending )
	{
		this.quantityPending = quantityPending;
	}

	public String getQuantityShipped( )
	{
		return quantityShipped;
	}

	public void setQuantityShipped( String quantityShipped )
	{
		this.quantityShipped = quantityShipped;
	}

	public String getQuantityReturned( )
	{
		return quantityReturned;
	}

	public void setQuantityReturned( String quantityReturned )
	{
		this.quantityReturned = quantityReturned;
	}

	public SelectedOrderOutgoingFlow getSelectedOrderOutgoingFlow( )
	{
		return selectedOrderOutgoingFlow;
	}

	public void setSelectedOrderOutgoingFlow( SelectedOrderOutgoingFlow selectedOrderOutgoingFlow )
	{
		this.selectedOrderOutgoingFlow = selectedOrderOutgoingFlow;
	}

	public String getAvailableOrderOutgoingFlowList( )
	{
		return availableOrderOutgoingFlowList;
	}

	public void setAvailableOrderOutgoingFlowList( String availableOrderOutgoingFlowList )
	{
		this.availableOrderOutgoingFlowList = availableOrderOutgoingFlowList;
	}

	public DefaultOrderOutgoingFlow getDefaultOrderOutgoingFlow( )
	{
		return defaultOrderOutgoingFlow;
	}

	public void setDefaultOrderOutgoingFlow( DefaultOrderOutgoingFlow defaultOrderOutgoingFlow )
	{
		this.defaultOrderOutgoingFlow = defaultOrderOutgoingFlow;
	}

	public String getGroupOutgoingFlow( )
	{
		return groupOutgoingFlow;
	}

	public void setGroupOutgoingFlow( String groupOutgoingFlow )
	{
		this.groupOutgoingFlow = groupOutgoingFlow;
	}

	public String getGroupServiceFlow( )
	{
		return groupServiceFlow;
	}

	public void setGroupServiceFlow( String groupServiceFlow )
	{
		this.groupServiceFlow = groupServiceFlow;
	}

	public ExpeditionWarehouseInfo getExpeditionWarehouseInfo( )
	{
		return expeditionWarehouseInfo;
	}

	public void setExpeditionWarehouseInfo( ExpeditionWarehouseInfo expeditionWarehouseInfo )
	{
		this.expeditionWarehouseInfo = expeditionWarehouseInfo;
	}

	public ExpeditionCenterInfo getExpeditionCenterInfo( )
	{
		return expeditionCenterInfo;
	}

	public void setExpeditionCenterInfo( ExpeditionCenterInfo expeditionCenterInfo )
	{
		this.expeditionCenterInfo = expeditionCenterInfo;
	}

	public StorageCenterInfo getStorageCenterInfo( )
	{
		return storageCenterInfo;
	}

	public void setStorageCenterInfo( StorageCenterInfo storageCenterInfo )
	{
		this.storageCenterInfo = storageCenterInfo;
	}

	public String getCenter( )
	{
		return center;
	}

	public void setCenter( String center )
	{
		this.center = center;
	}

	public float getQuantityDec( )
	{
		return quantityDec;
	}

	public void setQuantityDec( float quantityDec )
	{
		this.quantityDec = quantityDec;
	}

	public float getTotalWeight( )
	{
		return totalWeight;
	}

	public void setTotalWeight( float totalWeight )
	{
		this.totalWeight = totalWeight;
	}

	public float getPackageQuantity( )
	{
		return packageQuantity;
	}

	public void setPackageQuantity( float packageQuantity )
	{
		this.packageQuantity = packageQuantity;
	}

	public String getWeightUnit( )
	{
		return weightUnit;
	}

	public void setWeightUnit( String weightUnit )
	{
		this.weightUnit = weightUnit;
	}

	public String getProductBatch( )
	{
		return productBatch;
	}

	public void setProductBatch( String productBatch )
	{
		this.productBatch = productBatch;
	}

	public String getSpecialPrice( )
	{
		return specialPrice;
	}

	public void setSpecialPrice( String specialPrice )
	{
		this.specialPrice = specialPrice;
	}

	public String getStaticSpecialPrice( )
	{
		return staticSpecialPrice;
	}

	public void setStaticSpecialPrice( String staticSpecialPrice )
	{
		this.staticSpecialPrice = staticSpecialPrice;
	}

	public String getMargin( )
	{
		return margin;
	}

	public void setMargin( String margin )
	{
		this.margin = margin;
	}

	public String getComercialization( )
	{
		return comercialization;
	}

	public void setComercialization( String comercialization )
	{
		this.comercialization = comercialization;
	}

	public String getIsPossiblePackage( )
	{
		return isPossiblePackage;
	}

	public void setIsPossiblePackage( String isPossiblePackage )
	{
		this.isPossiblePackage = isPossiblePackage;
	}

	public String getPackageChecked( )
	{
		return packageChecked;
	}

	public void setPackageChecked( String packageChecked )
	{
		this.packageChecked = packageChecked;
	}

	public boolean isBathDefinedByUser( )
	{
		return bathDefinedByUser;
	}

	public void setBathDefinedByUser( boolean bathDefinedByUser )
	{
		this.bathDefinedByUser = bathDefinedByUser;
	}

	public boolean isShowMonitor( )
	{
		return showMonitor;
	}

	public void setShowMonitor( boolean showMonitor )
	{
		this.showMonitor = showMonitor;
	}

	public String getDeliverySchedulingTime( )
	{
		return deliverySchedulingTime;
	}

	public void setDeliverySchedulingTime( String deliverySchedulingTime )
	{
		this.deliverySchedulingTime = deliverySchedulingTime;
	}

	public String getCenterCodeATP( )
	{
		return centerCodeATP;
	}

	public void setCenterCodeATP( String centerCodeATP )
	{
		this.centerCodeATP = centerCodeATP;
	}

	public boolean isImported( )
	{
		return isImported;
	}

	public void setImported( boolean imported )
	{
		isImported = imported;
	}

	public boolean isVMI( )
	{
		return isVMI;
	}

	public void setVMI( boolean VMI )
	{
		isVMI = VMI;
	}

	public boolean isVMIWithATP( )
	{
		return isVMIWithATP;
	}

	public void setVMIWithATP( boolean VMIWithATP )
	{
		isVMIWithATP = VMIWithATP;
	}

	public String getQuantityReserved( )
	{
		return quantityReserved;
	}

	public void setQuantityReserved( String quantityReserved )
	{
		this.quantityReserved = quantityReserved;
	}

	public boolean isCanAppliedDiscounts( )
	{
		return canAppliedDiscounts;
	}

	public void setCanAppliedDiscounts( boolean canAppliedDiscounts )
	{
		this.canAppliedDiscounts = canAppliedDiscounts;
	}

	public float getTotalPriceWithoutDiscount( )
	{
		return totalPriceWithoutDiscount;
	}

	public void setTotalPriceWithoutDiscount( float totalPriceWithoutDiscount )
	{
		this.totalPriceWithoutDiscount = totalPriceWithoutDiscount;
	}

	public boolean isWarrantyProductService( )
	{
		return isWarrantyProductService;
	}

	public void setWarrantyProductService( boolean warrantyProductService )
	{
		isWarrantyProductService = warrantyProductService;
	}

	public boolean isHasTicketWarranty( )
	{
		return hasTicketWarranty;
	}

	public void setHasTicketWarranty( boolean hasTicketWarranty )
	{
		this.hasTicketWarranty = hasTicketWarranty;
	}

	public String getWarrantyServiceTicketNumber( )
	{
		return warrantyServiceTicketNumber;
	}

	public void setWarrantyServiceTicketNumber( String warrantyServiceTicketNumber )
	{
		this.warrantyServiceTicketNumber = warrantyServiceTicketNumber;
	}

	public String getCategoryRootCode( )
	{
		return categoryRootCode;
	}

	public void setCategoryRootCode( String categoryRootCode )
	{
		this.categoryRootCode = categoryRootCode;
	}

	public String getCategoryRootDescription( )
	{
		return categoryRootDescription;
	}

	public void setCategoryRootDescription( String categoryRootDescription )
	{
		this.categoryRootDescription = categoryRootDescription;
	}

	public String getLeftOverQuantity( )
	{
		return leftOverQuantity;
	}

	public void setLeftOverQuantity( String leftOverQuantity )
	{
		this.leftOverQuantity = leftOverQuantity;
	}

	public String getLeftOverPercentage( )
	{
		return leftOverPercentage;
	}

	public void setLeftOverPercentage( String leftOverPercentage )
	{
		this.leftOverPercentage = leftOverPercentage;
	}

	public String getPackageCheckedBlocked( )
	{
		return packageCheckedBlocked;
	}

	public void setPackageCheckedBlocked( String packageCheckedBlocked )
	{
		this.packageCheckedBlocked = packageCheckedBlocked;
	}

	public String getForceRemoveMarketplace( )
	{
		return forceRemoveMarketplace;
	}

	public void setForceRemoveMarketplace( String forceRemoveMarketplace )
	{
		this.forceRemoveMarketplace = forceRemoveMarketplace;
	}

	public String getCurrentStoreName( )
	{
		return currentStoreName;
	}

	public void setCurrentStoreName( String currentStoreName )
	{
		this.currentStoreName = currentStoreName;
	}

	public String getMaxAvailableQty( )
	{
		return maxAvailableQty;
	}

	public void setMaxAvailableQty( String maxAvailableQty )
	{
		this.maxAvailableQty = maxAvailableQty;
	}

	public String getBiggestBatchQty( )
	{
		return biggestBatchQty;
	}

	public void setBiggestBatchQty( String biggestBatchQty )
	{
		this.biggestBatchQty = biggestBatchQty;
	}

	public String getSpecialPriceReason( )
	{
		return specialPriceReason;
	}

	public void setSpecialPriceReason( String specialPriceReason )
	{
		this.specialPriceReason = specialPriceReason;
	}

	public boolean isSplited( )
	{
		return isSplited;
	}

	public void setSplited( boolean splited )
	{
		isSplited = splited;
	}

	public String getWarehouseSplited( )
	{
		return warehouseSplited;
	}

	public void setWarehouseSplited( String warehouseSplited )
	{
		this.warehouseSplited = warehouseSplited;
	}

	public boolean isComplexDiscount( )
	{
		return isComplexDiscount;
	}

	public void setComplexDiscount( boolean complexDiscount )
	{
		isComplexDiscount = complexDiscount;
	}

	public boolean isFidelityDiscount( )
	{
		return isFidelityDiscount;
	}

	public void setFidelityDiscount( boolean fidelityDiscount )
	{
		isFidelityDiscount = fidelityDiscount;
	}

	public String getSelectedDiscountReason( )
	{
		return selectedDiscountReason;
	}

	public void setSelectedDiscountReason( String selectedDiscountReason )
	{
		this.selectedDiscountReason = selectedDiscountReason;
	}

	public String getAppliedDiscountReasons( )
	{
		return appliedDiscountReasons;
	}

	public void setAppliedDiscountReasons( String appliedDiscountReasons )
	{
		this.appliedDiscountReasons = appliedDiscountReasons;
	}

	public ArrayList<Object> getDiscountReasons( )
	{
		return discountReasons;
	}

	public void setDiscountReasons( ArrayList<Object> discountReasons )
	{
		this.discountReasons = discountReasons;
	}

	public float getDecimalQuantity( )
	{
		return decimalQuantity;
	}

	public void setDecimalQuantity( float decimalQuantity )
	{
		this.decimalQuantity = decimalQuantity;
	}

	public float getPackagingQuantity( )
	{
		return packagingQuantity;
	}

	public void setPackagingQuantity( float packagingQuantity )
	{
		this.packagingQuantity = packagingQuantity;
	}

	public float getIntegerQuantity( )
	{
		return integerQuantity;
	}

	public void setIntegerQuantity( float integerQuantity )
	{
		this.integerQuantity = integerQuantity;
	}

	public String getSchedulingCode( )
	{
		return schedulingCode;
	}

	public void setSchedulingCode( String schedulingCode )
	{
		this.schedulingCode = schedulingCode;
	}

	public boolean isPossibleApprovalProduct( )
	{
		return possibleApprovalProduct;
	}

	public void setPossibleApprovalProduct( boolean possibleApprovalProduct )
	{
		this.possibleApprovalProduct = possibleApprovalProduct;
	}

	public RootCategory getRootCategory( )
	{
		return rootCategory;
	}

	public void setRootCategory( RootCategory rootCategory )
	{
		this.rootCategory = rootCategory;
	}

	public String getServiceEntry( )
	{
		return serviceEntry;
	}

	public void setServiceEntry( String serviceEntry )
	{
		this.serviceEntry = serviceEntry;
	}

	public String getSourceEntryPK( )
	{
		return sourceEntryPK;
	}

	public void setSourceEntryPK( String sourceEntryPK )
	{
		this.sourceEntryPK = sourceEntryPK;
	}

	public float getDateDeliveryRemoval( )
	{
		return dateDeliveryRemoval;
	}

	public void setDateDeliveryRemoval( float dateDeliveryRemoval )
	{
		this.dateDeliveryRemoval = dateDeliveryRemoval;
	}

	public String getNote( )
	{
		return note;
	}

	public void setNote( String note )
	{
		this.note = note;
	}

	public float getDeliveryDate( )
	{
		return deliveryDate;
	}

	public void setDeliveryDate( float deliveryDate )
	{
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryTime( )
	{
		return deliveryTime;
	}

	public void setDeliveryTime( String deliveryTime )
	{
		this.deliveryTime = deliveryTime;
	}

	public String getDeliveryShiftEnum( )
	{
		return deliveryShiftEnum;
	}

	public void setDeliveryShiftEnum( String deliveryShiftEnum )
	{
		this.deliveryShiftEnum = deliveryShiftEnum;
	}

	public String getDefaultOutgoingFlow( )
	{
		return defaultOutgoingFlow;
	}

	public void setDefaultOutgoingFlow( String defaultOutgoingFlow )
	{
		this.defaultOutgoingFlow = defaultOutgoingFlow;
	}

	public String getPdvdiscounts( )
	{
		return pdvdiscounts;
	}

	public void setPdvdiscounts( String pdvdiscounts )
	{
		this.pdvdiscounts = pdvdiscounts;
	}
}