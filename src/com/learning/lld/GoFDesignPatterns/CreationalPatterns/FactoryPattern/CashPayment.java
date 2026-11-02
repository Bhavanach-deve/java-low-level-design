package com.learning.lld.GoFDesignPatterns.CreationalPatterns.FactoryPattern;

public class CashPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment through Cash");
    }
}
