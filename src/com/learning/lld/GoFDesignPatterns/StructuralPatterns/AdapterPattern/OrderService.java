package com.learning.lld.GoFDesignPatterns.StructuralPatterns.AdapterPattern;

public class OrderService
{
    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void placeOrder(){
        paymentGateway.pay(1000);
    }
}
