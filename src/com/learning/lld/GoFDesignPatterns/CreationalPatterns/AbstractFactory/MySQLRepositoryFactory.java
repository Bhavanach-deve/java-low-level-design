package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class MySQLRepositoryFactory implements LibraryRepositoryFactory
{
    @Override
    public BookRepository createBookRepository() {
        return new MySQLBookRepository();
    }

    @Override
    public MemberRepository createMemberRepository() {
        return new MySQLMemberRepository();
    }
}
//The MySQL factory always creates MySQL products.
//This maintains consistency within each family.