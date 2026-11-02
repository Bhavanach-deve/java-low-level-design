package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public interface LibraryRepositoryFactory
{
    BookRepository createBookRepository();
    MemberRepository createMemberRepository();
}
