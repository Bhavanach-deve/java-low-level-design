package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection
{
    private List<Book> books=new ArrayList<>();

    public void addBook(Book book)
    {
        books.add(book);
    }
    public Iterator createIterator(){
        return new BookCollectionIterator(books);
    }
}
