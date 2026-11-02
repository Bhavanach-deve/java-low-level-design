package com.learning.lld.GoFDesignPatterns.StructuralPatterns.AdapterPattern;

public class RazorpayAdapter implements PaymentGateway{

    private RazorpayAPI razorpayAPI;

    public RazorpayAdapter(RazorpayAPI razorpayAPI){
        this.razorpayAPI = razorpayAPI;
    }


    @Override
    public void pay(double amount) {
        razorpayAPI.makePayment(amount);
    }
}
