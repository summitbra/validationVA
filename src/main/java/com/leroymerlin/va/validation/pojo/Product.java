package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class Product
{
	private String code;
	private String name;
	private String url;
	private String description = null;
	private boolean purchasable;
	Stock StockObject;
	private String futureStocks = null;
	private boolean availableForPickup;
	private String averageRating = null;
	private String numberOfReviews = null;
	private String summary = null;
	private String manufacturer;
	private String variantType = null;
	Price PriceObject;
	private String baseProduct = null;
	private String images = null;
	ArrayList<Object> categories = new ArrayList<Object>( );
	private String reviews = null;
	private String classifications = null;
	private String potentialPromotions = null;
	private String variantOptions = null;
	ArrayList<Object> baseOptions = new ArrayList<Object>( );
	private String volumePricesFlag = null;
	private String volumePrices = null;
	private String productReferences = null;
	private String variantMatrix = null;
	private String priceRange = null;
	private String firstCategoryNameList = null;
	private String multidimensional = null;
	private boolean configurable;
	private String addToCartDisabled = null;
	private String addToCartDisabledMessage = null;
	private String orderFormQuantity = null;
	private String keywords = null;
	private String genders = null;
	Unit UnitObject;
	private String salesPackage = null;
	SectionCategory SectionCategoryObject;
	private String externalImageUrl;
	private boolean isAvs;
	private boolean isTop0;
	private boolean isMDH;
	private String avsEndDate = null;
	private boolean acceptsBNDES;
	private String urlToCatalog;
	private String sapStatus = null;
	private boolean approval;
	private boolean handledByBatch;
	private String productCodeDisplay;
	private String technicalName;
	private String quotattionName = null;
	private String identifier;
	private float valueInitialService;
	private float valueFinalService;
	private String serviceGroup;
	ProductTypeParametrization ProductTypeParametrizationObject;
	ArrayList<Object> serviceProducts = new ArrayList<Object>( );
	private float stockFactor;
	private String descriptionCampaign = null;
	private String assortment = null;
	private String vendor = null;
	private String saleable = null;
	private String firstVariantCode = null;
	private String firstVariantImage = null;

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

	public boolean getPurchasable( )
	{
		return purchasable;
	}

	public Stock getStock( )
	{
		return StockObject;
	}

	public String getFutureStocks( )
	{
		return futureStocks;
	}

	public boolean getAvailableForPickup( )
	{
		return availableForPickup;
	}

	public String getAverageRating( )
	{
		return averageRating;
	}

	public String getNumberOfReviews( )
	{
		return numberOfReviews;
	}

	public String getSummary( )
	{
		return summary;
	}

	public String getManufacturer( )
	{
		return manufacturer;
	}

	public String getVariantType( )
	{
		return variantType;
	}

	public Price getPrice( )
	{
		return PriceObject;
	}

	public String getBaseProduct( )
	{
		return baseProduct;
	}

	public String getImages( )
	{
		return images;
	}

	public String getReviews( )
	{
		return reviews;
	}

	public String getClassifications( )
	{
		return classifications;
	}

	public String getPotentialPromotions( )
	{
		return potentialPromotions;
	}

	public String getVariantOptions( )
	{
		return variantOptions;
	}

	public String getVolumePricesFlag( )
	{
		return volumePricesFlag;
	}

	public String getVolumePrices( )
	{
		return volumePrices;
	}

	public String getProductReferences( )
	{
		return productReferences;
	}

	public String getVariantMatrix( )
	{
		return variantMatrix;
	}

	public String getPriceRange( )
	{
		return priceRange;
	}

	public String getFirstCategoryNameList( )
	{
		return firstCategoryNameList;
	}

	public String getMultidimensional( )
	{
		return multidimensional;
	}

	public boolean getConfigurable( )
	{
		return configurable;
	}

	public String getAddToCartDisabled( )
	{
		return addToCartDisabled;
	}

	public String getAddToCartDisabledMessage( )
	{
		return addToCartDisabledMessage;
	}

	public String getOrderFormQuantity( )
	{
		return orderFormQuantity;
	}

	public String getKeywords( )
	{
		return keywords;
	}

	public String getGenders( )
	{
		return genders;
	}

	public Unit getUnit( )
	{
		return UnitObject;
	}

	public String getSalesPackage( )
	{
		return salesPackage;
	}

	public SectionCategory getSectionCategory( )
	{
		return SectionCategoryObject;
	}

	public String getExternalImageUrl( )
	{
		return externalImageUrl;
	}

	public boolean getIsAvs( )
	{
		return isAvs;
	}

	public boolean getIsTop0( )
	{
		return isTop0;
	}

	public boolean getIsMDH( )
	{
		return isMDH;
	}

	public String getAvsEndDate( )
	{
		return avsEndDate;
	}

	public boolean getAcceptsBNDES( )
	{
		return acceptsBNDES;
	}

	public String getUrlToCatalog( )
	{
		return urlToCatalog;
	}

	public String getSapStatus( )
	{
		return sapStatus;
	}

	public boolean getApproval( )
	{
		return approval;
	}

	public boolean getHandledByBatch( )
	{
		return handledByBatch;
	}

	public String getProductCodeDisplay( )
	{
		return productCodeDisplay;
	}

	public String getTechnicalName( )
	{
		return technicalName;
	}

	public String getQuotattionName( )
	{
		return quotattionName;
	}

	public String getIdentifier( )
	{
		return identifier;
	}

	public float getValueInitialService( )
	{
		return valueInitialService;
	}

	public float getValueFinalService( )
	{
		return valueFinalService;
	}

	public String getServiceGroup( )
	{
		return serviceGroup;
	}

	public ProductTypeParametrization getProductTypeParametrization( )
	{
		return ProductTypeParametrizationObject;
	}

	public float getStockFactor( )
	{
		return stockFactor;
	}

	public String getDescriptionCampaign( )
	{
		return descriptionCampaign;
	}

	public String getAssortment( )
	{
		return assortment;
	}

	public String getVendor( )
	{
		return vendor;
	}

	public String getSaleable( )
	{
		return saleable;
	}

	public String getFirstVariantCode( )
	{
		return firstVariantCode;
	}

	public String getFirstVariantImage( )
	{
		return firstVariantImage;
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

	public void setPurchasable( boolean purchasable )
	{
		this.purchasable = purchasable;
	}

	public void setStock( Stock stockObject )
	{
		this.StockObject = stockObject;
	}

	public void setFutureStocks( String futureStocks )
	{
		this.futureStocks = futureStocks;
	}

	public void setAvailableForPickup( boolean availableForPickup )
	{
		this.availableForPickup = availableForPickup;
	}

	public void setAverageRating( String averageRating )
	{
		this.averageRating = averageRating;
	}

	public void setNumberOfReviews( String numberOfReviews )
	{
		this.numberOfReviews = numberOfReviews;
	}

	public void setSummary( String summary )
	{
		this.summary = summary;
	}

	public void setManufacturer( String manufacturer )
	{
		this.manufacturer = manufacturer;
	}

	public void setVariantType( String variantType )
	{
		this.variantType = variantType;
	}

	public void setPrice( Price priceObject )
	{
		this.PriceObject = priceObject;
	}

	public void setBaseProduct( String baseProduct )
	{
		this.baseProduct = baseProduct;
	}

	public void setImages( String images )
	{
		this.images = images;
	}

	public void setReviews( String reviews )
	{
		this.reviews = reviews;
	}

	public void setClassifications( String classifications )
	{
		this.classifications = classifications;
	}

	public void setPotentialPromotions( String potentialPromotions )
	{
		this.potentialPromotions = potentialPromotions;
	}

	public void setVariantOptions( String variantOptions )
	{
		this.variantOptions = variantOptions;
	}

	public void setVolumePricesFlag( String volumePricesFlag )
	{
		this.volumePricesFlag = volumePricesFlag;
	}

	public void setVolumePrices( String volumePrices )
	{
		this.volumePrices = volumePrices;
	}

	public void setProductReferences( String productReferences )
	{
		this.productReferences = productReferences;
	}

	public void setVariantMatrix( String variantMatrix )
	{
		this.variantMatrix = variantMatrix;
	}

	public void setPriceRange( String priceRange )
	{
		this.priceRange = priceRange;
	}

	public void setFirstCategoryNameList( String firstCategoryNameList )
	{
		this.firstCategoryNameList = firstCategoryNameList;
	}

	public void setMultidimensional( String multidimensional )
	{
		this.multidimensional = multidimensional;
	}

	public void setConfigurable( boolean configurable )
	{
		this.configurable = configurable;
	}

	public void setAddToCartDisabled( String addToCartDisabled )
	{
		this.addToCartDisabled = addToCartDisabled;
	}

	public void setAddToCartDisabledMessage( String addToCartDisabledMessage )
	{
		this.addToCartDisabledMessage = addToCartDisabledMessage;
	}

	public void setOrderFormQuantity( String orderFormQuantity )
	{
		this.orderFormQuantity = orderFormQuantity;
	}

	public void setKeywords( String keywords )
	{
		this.keywords = keywords;
	}

	public void setGenders( String genders )
	{
		this.genders = genders;
	}

	public void setUnit( Unit unitObject )
	{
		this.UnitObject = unitObject;
	}

	public void setSalesPackage( String salesPackage )
	{
		this.salesPackage = salesPackage;
	}

	public void setSectionCategory( SectionCategory sectionCategoryObject )
	{
		this.SectionCategoryObject = sectionCategoryObject;
	}

	public void setExternalImageUrl( String externalImageUrl )
	{
		this.externalImageUrl = externalImageUrl;
	}

	public void setIsAvs( boolean isAvs )
	{
		this.isAvs = isAvs;
	}

	public void setIsTop0( boolean isTop0 )
	{
		this.isTop0 = isTop0;
	}

	public void setIsMDH( boolean isMDH )
	{
		this.isMDH = isMDH;
	}

	public void setAvsEndDate( String avsEndDate )
	{
		this.avsEndDate = avsEndDate;
	}

	public void setAcceptsBNDES( boolean acceptsBNDES )
	{
		this.acceptsBNDES = acceptsBNDES;
	}

	public void setUrlToCatalog( String urlToCatalog )
	{
		this.urlToCatalog = urlToCatalog;
	}

	public void setSapStatus( String sapStatus )
	{
		this.sapStatus = sapStatus;
	}

	public void setApproval( boolean approval )
	{
		this.approval = approval;
	}

	public void setHandledByBatch( boolean handledByBatch )
	{
		this.handledByBatch = handledByBatch;
	}

	public void setProductCodeDisplay( String productCodeDisplay )
	{
		this.productCodeDisplay = productCodeDisplay;
	}

	public void setTechnicalName( String technicalName )
	{
		this.technicalName = technicalName;
	}

	public void setQuotattionName( String quotattionName )
	{
		this.quotattionName = quotattionName;
	}

	public void setIdentifier( String identifier )
	{
		this.identifier = identifier;
	}

	public void setValueInitialService( float valueInitialService )
	{
		this.valueInitialService = valueInitialService;
	}

	public void setValueFinalService( float valueFinalService )
	{
		this.valueFinalService = valueFinalService;
	}

	public void setServiceGroup( String serviceGroup )
	{
		this.serviceGroup = serviceGroup;
	}

	public void setProductTypeParametrization(
			ProductTypeParametrization productTypeParametrizationObject )
	{
		this.ProductTypeParametrizationObject = productTypeParametrizationObject;
	}

	public void setStockFactor( float stockFactor )
	{
		this.stockFactor = stockFactor;
	}

	public void setDescriptionCampaign( String descriptionCampaign )
	{
		this.descriptionCampaign = descriptionCampaign;
	}

	public void setAssortment( String assortment )
	{
		this.assortment = assortment;
	}

	public void setVendor( String vendor )
	{
		this.vendor = vendor;
	}

	public void setSaleable( String saleable )
	{
		this.saleable = saleable;
	}

	public void setFirstVariantCode( String firstVariantCode )
	{
		this.firstVariantCode = firstVariantCode;
	}

	public void setFirstVariantImage( String firstVariantImage )
	{
		this.firstVariantImage = firstVariantImage;
	}
}
