package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class MongoRepositoryFactory implements LibraryRepositoryFactory{
    @Override
    public BookRepository createBookRepository() {
        return new MongoBookRepository();
    }

    @Override
    public MemberRepository createMemberRepository() {
        return new MongoMemberRepository();
    }
}
//The MongoDB factory always creates MongoDB products.
//This maintains consistency within each family.