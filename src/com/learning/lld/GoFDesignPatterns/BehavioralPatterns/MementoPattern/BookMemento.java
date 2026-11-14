package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MementoPattern;

public final class BookMemento
{
    private String title;
    private String author;

    public BookMemento(String title, String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
