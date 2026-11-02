package com.learning.lld.GoFDesignPatterns.StructuralPatterns.FacadePattern;

public class Main
{
    public static void main(String[] args)
    {
        LibraryFacade libraryFacade=new LibraryFacade(new MemberService(),new BookService(),new LoanService(),new NotificationService() );

        libraryFacade.borrowBook(101,501);

    }
}
