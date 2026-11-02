package com.learning.lld.GoFDesignPatterns.CreationalPatterns.BuilderPattern;

public class LibraryApplication
{
    public static void main(String[] args)
    {
        Book book=new Book.BookBuilder(101,"Java","James Gosling").isbn("123456789").category("Programming").publisher("Tech Publications").publicationYear(2025).build();
        System.out.println("Book craeted successfully");

    }
}
