package com.leroymerlin.va.validation.controller;

import com.leroymerlin.va.validation.entity.AuditLog;
import com.leroymerlin.va.validation.pojo.Order;
import com.leroymerlin.va.validation.service.AuditLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuditLogController
{

    private AuditLogService service;
    private Logger LOG = LoggerFactory.getLogger( AuditLogController.class );

    @Autowired
    public AuditLogController( AuditLogService service )
    {
        this.service = service;
    }

    /**
     * Retorna o resultado de uma auditoria de validacao de Order do VA
     *
     * @param id
     * @return
     */
    @GetMapping( "validate/{id}" )
    public AuditLog getResultValidation( @PathVariable( "id" ) int id )
    {
        LOG.info( "AuditLog: GET request id " + id );
        return service.find( id );
    }

    /**
     * Execute a Auditoria Default
     *
     * @param order
     * @return
     */
    @PostMapping( "validate" )
    public AuditLog executeValidation( @RequestBody Order order )
    {
        LOG.info( "AuditLog: POST request received" );

        AuditLog result = service.executeDefault( order ) ;

        LOG.info( "AuditLog: Inserted with id " + result.getId( ) );
        return result;
    }

    /**
     * Executa a Auditoria de acordo com o tema/contexto
     *
     * @param id
     * @param action
     * @param value
     * @param delay
     * @return
     */
    @PostMapping( "validation/{id}" )
    public AuditLog processValidation( @PathVariable( "id" ) int id,
                                  @RequestParam( "action" ) String action,
                                  @RequestParam( "value" ) String value,
                                  @RequestParam( required = false, value = "delay", defaultValue = "0" ) int delay )
    {
        LOG.info( "AuditLog: process " + id );
        AuditLog auditLog;

        switch ( action )
        {
            case "default":
                auditLog = service.executeDefault( id, value, delay );
                break;
            case "price":
                auditLog = service.executeByPrice( id, value, delay );
                break;
            case "stock":
                auditLog = service.executeByStock( id, value, delay );
                break;
            case "promotion":
                auditLog = service.executeByPromotion( id, value, delay );
                break;
            case "fraud":
                auditLog = service.executeByFraud( id, value, delay );
                break;
            case "customer":
                auditLog = service.executeByCustomer( id, value, delay );
                break;
            default:
                auditLog = null;
        }
        return auditLog;
    }
}
