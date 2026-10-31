package com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Implementation;

import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.BookRepository;

public class MongoDBBookRepository implements BookRepository
{
    @Override
    public void saveBook() {
        System.out.println("Saving Book using MongoDB");
    }
}
