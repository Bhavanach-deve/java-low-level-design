package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.IteratorPattern;

import java.util.List;

public class BookCollectionIterator implements Iterator
{
    private List<Book> books;
    private int position = 0;
    public BookCollectionIterator(List<Book> books)
    {
        this.books = books;
    }
    @Override
    public boolean hasNext()
    {
        return position < books.size();
    }
    @Override
    public Book next()
    {
        return books.get(position++);
    }

}

//private int position = 0;
//This tracks the current position.
//return position < books.size();
//Checks whether the current position is within the collection.
//return books.get(position++);
//Returns the current book and then increments the position.
//For example, if position = 0, it returns index 0 and changes the position to 1.