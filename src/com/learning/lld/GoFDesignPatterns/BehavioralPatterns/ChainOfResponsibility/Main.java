package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class Main
{
    public static void main(String[] args)
    {
        BorrowHandler authentication = new AuthenticationHandler();
        BorrowHandler memberStatus = new MemberStatusHandler();
        BorrowHandler borrowingLimit = new BorrowingLimitHandler();
        BorrowHandler bookAvailability = new BookAvailabilityHandler();
        authentication.setNextHandler(memberStatus);
        memberStatus.setNextHandler(borrowingLimit);
        borrowingLimit.setNextHandler(bookAvailability);
        BorrowRequest request=new BorrowRequest(true,true,2,true);
        authentication.handle(request);
        System.out.println("All validations passed!");

    }
}
