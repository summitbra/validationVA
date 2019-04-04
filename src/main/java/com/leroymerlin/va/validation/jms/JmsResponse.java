package com.leroymerlin.va.validation.jms;

public class JmsResponse
{

    private int id;
    private String action;
    private String value;

    public int getId( )
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getAction( )
    {
        return action;
    }

    public void setAction( String action )
    {
        this.action = action;
    }

    public String getValue( )
    {
        return value;
    }

    public void setValue( String value )
    {
        this.value = value;
    }
}
