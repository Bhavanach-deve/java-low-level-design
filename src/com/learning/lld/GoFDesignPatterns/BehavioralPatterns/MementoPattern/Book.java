package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MementoPattern;

public class Book
{
    private  String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void updateDetails(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void display(){
        System.out.println(title+"-"+author);
    }
    public BookMemento save(){
        return new BookMemento(title,author);
    }
    public void restore(BookMemento memento){
        this.title=memento.getTitle();
        this.author=memento.getAuthor();
    }
}
