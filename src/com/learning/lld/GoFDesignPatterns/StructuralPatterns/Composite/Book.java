package com.learning.lld.GoFDesignPatterns.StructuralPatterns.Composite;

public class Book implements LibraryComponent
{
    private String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public void display()
    {
        System.out.println("Book: "+title);
    }
}
//A Book is a leaf. It displays itself and doesn't contain other library components.