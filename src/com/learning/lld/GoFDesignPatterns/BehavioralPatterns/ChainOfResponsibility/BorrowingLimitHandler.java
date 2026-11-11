package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class BorrowingLimitHandler extends BorrowHandler
{

    @Override
    public void handle(BorrowRequest borrowRequest) {
        if(borrowRequest.getActiveLoans()>=3){
            throw new RuntimeException("Borrowing limit exceeded");
        }
        System.out.println("Borrowing limit passed");

        handleNext(borrowRequest);
    }
}
