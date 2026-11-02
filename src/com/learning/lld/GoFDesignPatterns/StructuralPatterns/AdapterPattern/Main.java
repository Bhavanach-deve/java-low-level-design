package com.learning.lld.GoFDesignPatterns.StructuralPatterns.AdapterPattern;

public class Main
{
    public static void main(String[] args)
    {
        RazorpayAPI razorpayAPI = new RazorpayAPI();

        PaymentGateway gateway=new RazorpayAdapter(razorpayAPI);

        OrderService orderService=new OrderService(gateway);

        orderService.placeOrder();

    }
}
//OrderService thinks:
// PaymentGateway
//    ↓
//pay()
//Adapter translates:
//pay()
// ↓
//makePayment()
//The third-party API remains untouched.
//CLIENT
//  ↓
//Expected Interface
//  ↓
// ADAPTER
//  ↓
//Existing/Incompatible Class
//The Adapter is basically a translator.