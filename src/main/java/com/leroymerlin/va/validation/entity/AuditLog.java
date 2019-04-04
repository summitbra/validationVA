package com.leroymerlin.va.validation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class AuditLog
{

    @Id
    @GeneratedValue
    private int id;
    private String description;
    private Timestamp date;
    private String log;
    private String object;
    private String validationType;
    private boolean valid;

    @Version
    private int version;

    public AuditLog( )
    {
    }

    public AuditLog( String description, String log, String object, String validationType, boolean valid )
    {
        this.description = description;
        this.log = log;
        this.object = object;
        this.validationType = validationType;
        this.valid = valid;
    }

    public int getId( )
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getDescription( )
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public Timestamp getDate( )
    {
        return date;
    }

    public void setDate( Timestamp date )
    {
        this.date = date;
    }

    public String getLog( )
    {
        return log;
    }

    public void setLog( String log )
    {
        this.log = log;
    }

    public String getObject( )
    {
        return object;
    }

    public void setObject( String object )
    {
        this.object = object;
    }

    public int getVersion( )
    {
        return version;
    }

    public void setVersion( int version )
    {
        this.version = version;
    }

    public boolean isValid( )
    {
        return valid;
    }

    public void setValid( boolean valid )
    {
        this.valid = valid;
    }

    public String getValidationType( )
    {
        return validationType;
    }

    public void setValidationType( String validationType )
    {
        this.validationType = validationType;
    }
}
