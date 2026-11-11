package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class BookAvailabilityHandler extends BorrowHandler{
    @Override
    public void handle(BorrowRequest borrowRequest) {
        if(!borrowRequest.isBookAvailable()){
            throw new RuntimeException("Book is unavailable");
        }
        System.out.println("Book availability passed");
        handleNext(borrowRequest);
    }
}
