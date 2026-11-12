package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MediatorPattern;

public class InventoryService
{
    private LibraryMediator mediator;
    public InventoryService(LibraryMediator mediator)
    {
        this.mediator=mediator;
    }
    public void markAvailable(){
        System.out.println("Book marked as available");
        mediator.notify(this,"BOOK_RETURNED");
    }
}
