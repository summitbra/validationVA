package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class DeliveryPointOfService
{
	private String name;
	private String displayName;
	private String url = null;
	private String description = null;
	private String openingHours = null;
	private String storeContent = null;
	Features FeaturesObject;
	GeoPoint GeoPointObject;
	private String formattedDistance = null;
	private String distanceKm = null;
	private String mapIcon = null;
	Address AddressObject;
	ArrayList<Object> storeImages = new ArrayList<Object>( );
	private String warehouseCodes = null;
	private String companyUid = null;
	private String companyName = null;
	private String stateRegistration = null;
	private String cnpj = null;

	// Getter Methods

	public String getName( )
	{
		return name;
	}

	public String getDisplayName( )
	{
		return displayName;
	}

	public String getUrl( )
	{
		return url;
	}

	public String getDescription( )
	{
		return description;
	}

	public String getOpeningHours( )
	{
		return openingHours;
	}

	public String getStoreContent( )
	{
		return storeContent;
	}

	public Features getFeatures( )
	{
		return FeaturesObject;
	}

	public GeoPoint getGeoPoint( )
	{
		return GeoPointObject;
	}

	public String getFormattedDistance( )
	{
		return formattedDistance;
	}

	public String getDistanceKm( )
	{
		return distanceKm;
	}

	public String getMapIcon( )
	{
		return mapIcon;
	}

	public Address getAddress( )
	{
		return AddressObject;
	}

	public String getWarehouseCodes( )
	{
		return warehouseCodes;
	}

	public String getCompanyUid( )
	{
		return companyUid;
	}

	public String getCompanyName( )
	{
		return companyName;
	}

	public String getStateRegistration( )
	{
		return stateRegistration;
	}

	public String getCnpj( )
	{
		return cnpj;
	}

	// Setter Methods

	public void setName( String name )
	{
		this.name = name;
	}

	public void setDisplayName( String displayName )
	{
		this.displayName = displayName;
	}

	public void setUrl( String url )
	{
		this.url = url;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}

	public void setOpeningHours( String openingHours )
	{
		this.openingHours = openingHours;
	}

	public void setStoreContent( String storeContent )
	{
		this.storeContent = storeContent;
	}

	public void setFeatures( Features featuresObject )
	{
		this.FeaturesObject = featuresObject;
	}

	public void setGeoPoint( GeoPoint geoPointObject )
	{
		this.GeoPointObject = geoPointObject;
	}

	public void setFormattedDistance( String formattedDistance )
	{
		this.formattedDistance = formattedDistance;
	}

	public void setDistanceKm( String distanceKm )
	{
		this.distanceKm = distanceKm;
	}

	public void setMapIcon( String mapIcon )
	{
		this.mapIcon = mapIcon;
	}

	public void setAddress( Address addressObject )
	{
		this.AddressObject = addressObject;
	}

	public void setWarehouseCodes( String warehouseCodes )
	{
		this.warehouseCodes = warehouseCodes;
	}

	public void setCompanyUid( String companyUid )
	{
		this.companyUid = companyUid;
	}

	public void setCompanyName( String companyName )
	{
		this.companyName = companyName;
	}

	public void setStateRegistration( String stateRegistration )
	{
		this.stateRegistration = stateRegistration;
	}

	public void setCnpj( String cnpj )
	{
		this.cnpj = cnpj;
	}
}