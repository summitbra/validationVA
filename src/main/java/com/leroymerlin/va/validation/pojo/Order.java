package com.leroymerlin.va.validation.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

@XmlRootElement(name = "employee")
@XmlAccessorType( XmlAccessType.PROPERTY)
public class Order implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String customer;
    private String lastName;
    private BigDecimal price;
    private int stock ;
    private BigDecimal promotion ;
    private String paymentTyype ;

    public Integer getId( )
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getCustomer( )
    {
        return customer;
    }

    public void setCustomer( String customer )
    {
        this.customer = customer;
    }

    public String getLastName( )
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public BigDecimal getPrice( )
    {
        return price;
    }

    public void setPrice( BigDecimal price )
    {
        this.price = price;
    }

    public int getStock( )
    {
        return stock;
    }

    public void setStock( int stock )
    {
        this.stock = stock;
    }

    public BigDecimal getPromotion( )
    {
        return promotion;
    }

    public void setPromotion( BigDecimal promotion )
    {
        this.promotion = promotion;
    }

    public String getPaymentTyype( )
    {
        return paymentTyype;
    }

    public void setPaymentTyype( String paymentTyype )
    {
        this.paymentTyype = paymentTyype;
    }
}
