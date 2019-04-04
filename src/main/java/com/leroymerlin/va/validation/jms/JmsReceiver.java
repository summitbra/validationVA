package com.leroymerlin.va.validation.jms;

import com.leroymerlin.va.validation.controller.AuditLogController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class JmsReceiver
{

    public static final Logger LOG = LoggerFactory.getLogger( JmsReceiver.class );

    private AuditLogController auditController;

    public JmsReceiver( AuditLogController auditController )
    {
        this.auditController = auditController;
    }

    @JmsListener( destination = "${endpoints.jms.queues.audit}", containerFactory = "jsaFactory" )
    @Transactional
    public void receiveMessage( JmsResponse response )
    {
        LOG.info( "- - - - - - - - - Start of receiveMessage - - - - - - - - -" );

        if ( response == null )
        {
            LOG.info( "Response message is null" );
            return;
        }

        auditController.processValidation( response.getId( ), response.getAction( ), response.getValue( ), 0 );

        LOG.info( "- - - - - - - - - End of receiveMessage - - - - - - - - -" );
    }
}
