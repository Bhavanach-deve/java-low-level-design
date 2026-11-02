package com.learning.lld.GoFDesignPatterns.CreationalPatterns.FactoryPattern;

public class PaymentFactory
{
    public Payment createPayment(String type){

        if(type.equals("UPI")){
            return new UPIPayment();
        }
        if(type.equals("Card")){
            return new CreditCardPayment();
        }
        if(type.equals("Cash")){
            return new CashPayment();
        }
        throw new IllegalArgumentException("Invalid Payment Type");
    }
}
//The Factory's responsibility is:
//Based on what the caller asks for, create and return the appropriate Payment object.