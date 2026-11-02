package com.learning.lld.GoFDesignPatterns.CreationalPatterns.FactoryPattern;

public class UPIPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment from UPI");
    }
}
