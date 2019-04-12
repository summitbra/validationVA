package com.leroymerlin.va.validation.pojo;

import java.util.ArrayList;

public class EntriesForOutgoingFlows
{
	private String entriesServiceAvulsoForOutgoingFlows = null;
	ArrayList<Object> entriesProductForOutgoingFlows = new ArrayList<Object>( );

	// Getter Methods

	public String getEntriesServiceAvulsoForOutgoingFlows( )
	{
		return entriesServiceAvulsoForOutgoingFlows;
	}

	// Setter Methods

	public void setEntriesServiceAvulsoForOutgoingFlows(
			String entriesServiceAvulsoForOutgoingFlows )
	{
		this.entriesServiceAvulsoForOutgoingFlows = entriesServiceAvulsoForOutgoingFlows;
	}
}