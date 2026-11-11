package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public abstract class BorrowHandler
{
    protected BorrowHandler nextHandler;

    public void setNextHandler(BorrowHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }
    public abstract void handle(BorrowRequest borrowRequest);

    protected void handleNext(BorrowRequest request)
    {
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
