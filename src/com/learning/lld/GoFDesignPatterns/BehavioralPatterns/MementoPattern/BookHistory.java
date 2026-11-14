package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MementoPattern;

public class BookHistory
{
    private BookMemento savedState;

    public void save(Book book){
        savedState=book.save();
    }
    public void undo(Book book){
        if(savedState!=null){
            book.restore(savedState);
        }
    }
}
