package com.learning.lld.GoFDesignPatterns.StructuralPatterns.FlyWeight;

public final class BookDetails
{
    private String title;
    private String author;

    public  BookDetails(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void diplay(int copyId,boolean available){
        System.out.println(title+" by "+author+" |Copy: "+copyId+" | Available: "+available);
    }
}
