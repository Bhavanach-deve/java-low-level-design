package com.learning.lld.GoFDesignPatterns.CreationalPatterns.FactoryPattern;

public class OrderService
{
    public void makePayment(String type){
        PaymentFactory factory = new PaymentFactory();
        Payment payment=factory.createPayment(type);
        payment.pay();
    }
}
