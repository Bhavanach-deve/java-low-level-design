package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class MySQLBookRepository implements BookRepository
{
    @Override
    public void saveBook() {
        System.out.println("Saving book in MySQL database");
    }
}
