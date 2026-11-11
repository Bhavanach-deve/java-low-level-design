package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class AuthenticationHandler extends BorrowHandler
{

    @Override
    public void handle(BorrowRequest request) {
        if(!request.isAuthenticated()){
            throw new RuntimeException("Login required");
        }
        System.out.println("Authentication passed");
        handleNext(request);
    }
}
