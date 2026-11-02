package com.learning.lld.GoFDesignPatterns.CreationalPatterns.FactoryPattern;

public class CreditCardPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment through Credit Card");
    }
}
