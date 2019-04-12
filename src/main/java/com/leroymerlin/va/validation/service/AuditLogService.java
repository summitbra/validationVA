package com.leroymerlin.va.validation.service;

import com.google.gson.Gson;
import com.leroymerlin.va.validation.action.*;
import com.leroymerlin.va.validation.entity.AuditLog;
import com.leroymerlin.va.validation.pojo.Order;
import com.leroymerlin.va.validation.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class AuditLogService
{
    private AuditLogRepository repository;

    @Autowired
    public AuditLogService( AuditLogRepository repository )
    {
        this.repository = repository;
    }

    public AuditLog find( int id )
    {
        return repository.findById( id ).orElse( null );
    }

    public AuditLog create( AuditLog audit )
    {
        return repository.save( audit );
    }

    public AuditLog executeDefault( Order order )
    {
        boolean result = DefaultAction.execute( order );

        boolean resultByPrice = ValidationByPriceAction.execute( order );
        boolean resultByStock = ValidationByStockAction.execute( order );
        boolean resultByPromotion = ValidationByPromotionAction.execute( order );
        boolean resultByFraud = ValidationByFraudAction.execute( order );
        boolean resultByCustomer = ValidationByCustomerAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA com todas as regras de Pedido") ;
        audit.setObject( order.toString( ) );
        String log = " execution default: " + result +
                " execution price: "   + resultByPrice +
                " execution stock: " + resultByStock +
                " execution promotion: " + resultByPromotion +
                " execution fraud: " + resultByFraud  +
                " execution customer: " + resultByCustomer  ;
        audit.setLog( log );
        audit.setValidationType( "default" );
        if ( result &&
                resultByPrice &&
                resultByStock &&
                resultByPromotion &&
                resultByFraud &&
                resultByCustomer )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }

        repository.save( audit );
        return audit ;
    }

    public AuditLog executeDefault( int id, String value, int delay )
    {
        Gson gson = new Gson( );
        Order order = gson.fromJson( value, Order.class);

        boolean result = DefaultAction.execute( order );
        boolean resultByPrice = ValidationByPriceAction.execute( order );
        boolean resultByStock = ValidationByStockAction.execute( order );
        boolean resultByPromotion = ValidationByPromotionAction.execute( order );
        boolean resultByFraud = ValidationByFraudAction.execute( order );
        boolean resultByCustomer = ValidationByCustomerAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA com todas as regras de Pedido") ;
        audit.setObject( value );
        String log = " execution default: " + result +
                     " execution price: "   + resultByPrice +
                     " execution stock: " + resultByStock +
                     " execution promotion: " + resultByPromotion +
                     " execution fraud: " + resultByFraud  +
                     " execution customer: " + resultByCustomer  ;
        audit.setLog( log );
        audit.setValidationType( "default" );
        if ( result &&
                resultByPrice &&
                resultByStock &&
                resultByPromotion &&
                resultByFraud &&
                resultByCustomer )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }

        repository.save( audit );
        return audit ;
    }

    public AuditLog executeByPrice( int id, String value, int delay )
    {
        Gson gson = new Gson();
        Order order = gson.fromJson( value, Order.class);

        boolean resultByPrice = ValidationByPriceAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA validando dados de Price") ;
        audit.setObject( value );
        audit.setLog( " execution : " + resultByPrice );
        audit.setValidationType( "price" );
        if ( resultByPrice )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }

        repository.save( audit );

        return audit ;
    }

    public AuditLog executeByStock( int id, String value, int delay )
    {
        Gson gson = new Gson();
        Order order = gson.fromJson( value, Order.class);

        boolean resultByStock = ValidationByStockAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA validando dados de Stock") ;
        audit.setObject( value );
        audit.setLog( " execution : " + resultByStock );
        audit.setValidationType( "stock" );
        if ( resultByStock )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }

        repository.save( audit );
        return audit ;
    }

    public AuditLog executeByPromotion( int id, String value, int delay )
    {
        Gson gson = new Gson();
        Order order = gson.fromJson( value, Order.class);

        boolean resultByPromotion = ValidationByPromotionAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA validando as promocoes aplicadas") ;
        audit.setObject( value );
        audit.setLog( " execution : " + resultByPromotion );
        audit.setValidationType( "promotion" );
        if ( resultByPromotion )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }

        repository.save( audit );
        return audit ;
    }

    public AuditLog executeByFraud( int id, String value, int delay )
    {
        Gson gson = new Gson();
        Order order = gson.fromJson( value, Order.class);

        boolean resultByFraud = ValidationByFraudAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA validando possíveis fraudes") ;
        audit.setObject( value );
        audit.setLog( " execution : " + resultByFraud );
        audit.setValidationType( "fraud" );
        if ( resultByFraud )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }

        repository.save( audit );
        return audit ;
    }

    public AuditLog executeByCustomer( int id, String value, int delay )
    {
        Gson gson = new Gson();
        Order order = gson.fromJson( value, Order.class);

        boolean resultByCustomer = ValidationByCustomerAction.execute( order );

        AuditLog audit = new AuditLog( );
        audit.setDate( new Timestamp( new Date().getTime( ) ) );
        audit.setDescription( "Auditoria no VA validando cliente") ;
        audit.setObject( value );
        audit.setLog( " execution : " + resultByCustomer );
        audit.setValidationType( "customer" );
        if ( resultByCustomer )
        {
            audit.setValid( true );
        }
        else
        {
            audit.setValid( false );
        }
        repository.save( audit );
        return audit ;
    }
}