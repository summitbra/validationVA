package com.leroymerlin.va.validation.pojo;

public class Unit
{
	private String uid;
	private String name;
	private String members = null;
	private String subGroups = null;
	private String membersCount = null;
	private String unit = null;
	private boolean active;
	private boolean selected;
	private boolean selectable;
	private String reportingOrganization = null;
	private String budgets = null;
	private String orders = null;
	private String costCenters = null;
	private String userGroups = null;
	private String accountManagerGroups = null;
	private String children = null;
	private String administrators = null;
	private String customers = null;
	private String managers = null;
	private String accountManagers = null;
	private String addresses = null;
	private String approvalProcessCode = null;
	private String approvalProcessName = null;
	private String approvers = null;
	private String approverGroups = null;
	private String channel;
	Address AddressObject;
	private String generalTextQuote = null;
	private String generalTextRequestSale = null;
	private String generalTextQuoteMailBody = null;
	private String generalTextRequestSaleMailBody = null;
	private String generalTextManagementReportFooter = null;
	private String typeMailBodyQuote = null;

	// Getter Methods

	public String getUid( )
	{
		return uid;
	}

	public String getName( )
	{
		return name;
	}

	public String getMembers( )
	{
		return members;
	}

	public String getSubGroups( )
	{
		return subGroups;
	}

	public String getMembersCount( )
	{
		return membersCount;
	}

	public String getUnit( )
	{
		return unit;
	}

	public boolean getActive( )
	{
		return active;
	}

	public boolean getSelected( )
	{
		return selected;
	}

	public boolean getSelectable( )
	{
		return selectable;
	}

	public String getReportingOrganization( )
	{
		return reportingOrganization;
	}

	public String getBudgets( )
	{
		return budgets;
	}

	public String getOrders( )
	{
		return orders;
	}

	public String getCostCenters( )
	{
		return costCenters;
	}

	public String getUserGroups( )
	{
		return userGroups;
	}

	public String getAccountManagerGroups( )
	{
		return accountManagerGroups;
	}

	public String getChildren( )
	{
		return children;
	}

	public String getAdministrators( )
	{
		return administrators;
	}

	public String getCustomers( )
	{
		return customers;
	}

	public String getManagers( )
	{
		return managers;
	}

	public String getAccountManagers( )
	{
		return accountManagers;
	}

	public String getAddresses( )
	{
		return addresses;
	}

	public String getApprovalProcessCode( )
	{
		return approvalProcessCode;
	}

	public String getApprovalProcessName( )
	{
		return approvalProcessName;
	}

	public String getApprovers( )
	{
		return approvers;
	}

	public String getApproverGroups( )
	{
		return approverGroups;
	}

	public String getChannel( )
	{
		return channel;
	}

	public Address getAddress( )
	{
		return AddressObject;
	}

	public String getGeneralTextQuote( )
	{
		return generalTextQuote;
	}

	public String getGeneralTextRequestSale( )
	{
		return generalTextRequestSale;
	}

	public String getGeneralTextQuoteMailBody( )
	{
		return generalTextQuoteMailBody;
	}

	public String getGeneralTextRequestSaleMailBody( )
	{
		return generalTextRequestSaleMailBody;
	}

	public String getGeneralTextManagementReportFooter( )
	{
		return generalTextManagementReportFooter;
	}

	public String getTypeMailBodyQuote( )
	{
		return typeMailBodyQuote;
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

	public void setMembers( String members )
	{
		this.members = members;
	}

	public void setSubGroups( String subGroups )
	{
		this.subGroups = subGroups;
	}

	public void setMembersCount( String membersCount )
	{
		this.membersCount = membersCount;
	}

	public void setUnit( String unit )
	{
		this.unit = unit;
	}

	public void setActive( boolean active )
	{
		this.active = active;
	}

	public void setSelected( boolean selected )
	{
		this.selected = selected;
	}

	public void setSelectable( boolean selectable )
	{
		this.selectable = selectable;
	}

	public void setReportingOrganization( String reportingOrganization )
	{
		this.reportingOrganization = reportingOrganization;
	}

	public void setBudgets( String budgets )
	{
		this.budgets = budgets;
	}

	public void setOrders( String orders )
	{
		this.orders = orders;
	}

	public void setCostCenters( String costCenters )
	{
		this.costCenters = costCenters;
	}

	public void setUserGroups( String userGroups )
	{
		this.userGroups = userGroups;
	}

	public void setAccountManagerGroups( String accountManagerGroups )
	{
		this.accountManagerGroups = accountManagerGroups;
	}

	public void setChildren( String children )
	{
		this.children = children;
	}

	public void setAdministrators( String administrators )
	{
		this.administrators = administrators;
	}

	public void setCustomers( String customers )
	{
		this.customers = customers;
	}

	public void setManagers( String managers )
	{
		this.managers = managers;
	}

	public void setAccountManagers( String accountManagers )
	{
		this.accountManagers = accountManagers;
	}

	public void setAddresses( String addresses )
	{
		this.addresses = addresses;
	}

	public void setApprovalProcessCode( String approvalProcessCode )
	{
		this.approvalProcessCode = approvalProcessCode;
	}

	public void setApprovalProcessName( String approvalProcessName )
	{
		this.approvalProcessName = approvalProcessName;
	}

	public void setApprovers( String approvers )
	{
		this.approvers = approvers;
	}

	public void setApproverGroups( String approverGroups )
	{
		this.approverGroups = approverGroups;
	}

	public void setChannel( String channel )
	{
		this.channel = channel;
	}

	public void setAddress( Address addressObject )
	{
		this.AddressObject = addressObject;
	}

	public void setGeneralTextQuote( String generalTextQuote )
	{
		this.generalTextQuote = generalTextQuote;
	}

	public void setGeneralTextRequestSale( String generalTextRequestSale )
	{
		this.generalTextRequestSale = generalTextRequestSale;
	}

	public void setGeneralTextQuoteMailBody( String generalTextQuoteMailBody )
	{
		this.generalTextQuoteMailBody = generalTextQuoteMailBody;
	}

	public void setGeneralTextRequestSaleMailBody( String generalTextRequestSaleMailBody )
	{
		this.generalTextRequestSaleMailBody = generalTextRequestSaleMailBody;
	}

	public void setGeneralTextManagementReportFooter( String generalTextManagementReportFooter )
	{
		this.generalTextManagementReportFooter = generalTextManagementReportFooter;
	}

	public void setTypeMailBodyQuote( String typeMailBodyQuote )
	{
		this.typeMailBodyQuote = typeMailBodyQuote;
	}
}
