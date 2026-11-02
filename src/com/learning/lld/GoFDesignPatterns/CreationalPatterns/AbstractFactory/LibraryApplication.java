package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class LibraryApplication
{
    public static void main(String[] args)
    {
        LibraryRepositoryFactory factory=new MySQLRepositoryFactory();
        BookRepository bookRepository=factory.createBookRepository();
        MemberRepository memberRepository=factory.createMemberRepository();

        bookRepository.saveBook();
        memberRepository.saveMember();

    }
}
