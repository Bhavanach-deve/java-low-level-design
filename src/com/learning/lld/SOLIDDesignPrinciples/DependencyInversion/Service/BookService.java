package com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Service;

import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.BookRepository;

public class BookService
{
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }
    public void addBook(){
        bookRepository.saveBook();
    }
}
