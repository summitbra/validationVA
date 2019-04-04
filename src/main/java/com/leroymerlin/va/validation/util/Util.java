package com.leroymerlin.va.validation.util;

import com.leroymerlin.va.validation.pojo.Order;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Util
{
    public static Order transformToOrder( String value )
    {
        Order order = null ;
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance( Order.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller( );
            order = ( Order ) jaxbUnmarshaller.unmarshal( new StringReader( value ) );
            System.out.println( order );
        }
        catch (JAXBException e)
        {
            e.printStackTrace( );
        }
        return order ;
    }
}
