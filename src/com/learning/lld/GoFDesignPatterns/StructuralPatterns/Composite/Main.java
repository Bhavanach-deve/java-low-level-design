package com.learning.lld.GoFDesignPatterns.StructuralPatterns.Composite;

public class Main
{
    public static void main(String[] args)
    {
        Book javaBook = new Book("Effective Java");
        Book springBook= new Book("Spring in Action");

        BookCategory javaCategory = new BookCategory("Java");
        javaCategory.add(javaBook);

        BookCategory springCategory = new BookCategory("Spring");
        springCategory.add(springBook);

        BookCategory programming= new BookCategory("Programming");
        programming.add(javaCategory);
        programming.add(springCategory);

        programming.display();

    }
}
