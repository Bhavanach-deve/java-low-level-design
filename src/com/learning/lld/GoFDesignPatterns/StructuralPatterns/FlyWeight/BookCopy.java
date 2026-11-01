package com.learning.lld.GoFDesignPatterns.StructuralPatterns.FlyWeight;


public class BookCopy
{
    private final int copyId;
    private final BookDetails details;
    private boolean available;

    public BookCopy(int copyId, BookDetails details, boolean available){
        this.copyId = copyId;
        this.details= details;
        this.available = available;
    }
    public void display(){
        details.diplay(copyId, available);
    }
}
