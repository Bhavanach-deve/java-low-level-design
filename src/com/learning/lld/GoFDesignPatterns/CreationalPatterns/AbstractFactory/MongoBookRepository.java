package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class MongoBookRepository implements BookRepository
{
    @Override
    public void saveBook() {
        System.out.println("Saving book in MongoDB database");
    }
}
