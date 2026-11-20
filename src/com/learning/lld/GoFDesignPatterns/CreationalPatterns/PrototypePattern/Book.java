package com.learning.lld.GoFDesignPatterns.CreationalPatterns.PrototypePattern;

public class Book implements Cloneable
{
    String title;
    String author;
    String category;
    public Book(String title, String author, String category)
    {
        this.title = title;
        this.author = author;
        this.category = category;
    }
    public Book clone(){
        try{
            return (Book)super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
