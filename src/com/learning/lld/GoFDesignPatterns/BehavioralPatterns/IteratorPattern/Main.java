package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.IteratorPattern;

public class Main
{
    public static void main(String[] args)
    {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Java"));
        collection.addBook(new Book("Spring Boot"));
        collection.addBook(new Book("SQL"));

        Iterator iterator= collection.createIterator();
        while (iterator.hasNext())
        {
            Book book = (Book) iterator.next();

            System.out.println(book.getTitle());
        }
    }
}
