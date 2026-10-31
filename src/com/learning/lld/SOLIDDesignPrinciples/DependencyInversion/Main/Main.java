package com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Main;

import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.BookRepository;
import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Implementation.MongoDBBookRepository;
import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Implementation.MySQLBookRepository;
import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Service.BookService;

public class Main
{
    public static void main(String[] args)
    {
        BookRepository mysql=new MySQLBookRepository();
        BookRepository mongoDb=new MongoDBBookRepository();
        BookService bookService1= new BookService(mysql);
        bookService1.addBook();
        BookService bookService2 = new BookService(mongoDb);
        bookService2.addBook();



    }
}
