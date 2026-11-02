package com.learning.lld.GoFDesignPatterns.CreationalPatterns.FactoryPattern;

public class Main
{
    public static void main(String[] args)
    {
        OrderService orderService = new OrderService();
        orderService.makePayment("UPI");

    }
}
