package com.leroymerlin.va.validation.action;

import com.leroymerlin.va.validation.pojo.Order;
import com.leroymerlin.va.validation.util.Util;

public class ValidationByPromotionAction
{
    public static boolean execute( String orderVA )
    {
        try
        {
            Order order = Util.transformToOrder( orderVA );
            //
            //
            //
            return true ;
        }
        catch (Exception e )
        {

        }
        return false ;
    }
}
