package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MementoPattern;

public class Main
{
    public static void main(String[] args)
    {
        Book book=new Book("Java Basics","James Gosling");
        BookHistory history=new BookHistory();
        book.display();
        history.save(book);
        book.updateDetails("Advanced Java","James");
        book.display();
        history.undo(book);
        book.display();

    }
}
