package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class MemberStatusHandler extends BorrowHandler
{

    @Override
    public void handle(BorrowRequest request) {
        if(!request.isActiveMember()){
            throw new RuntimeException("Member is inactive");
        }
        System.out.println("Member status passed");
        handleNext(request);
    }
}
