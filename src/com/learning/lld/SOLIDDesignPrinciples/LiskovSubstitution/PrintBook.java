package com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution;


public class PrintBook implements Readable,Borrowable
{

    @Override
    public void borrowBook() {
        System.out.println("PrintBook borrowed");
    }

    @Override
    public void returnBook()
    {
        System.out.println("PrintedBook returned");

    }

    @Override
    public void readBook( ){
        System.out.println("Reading PrintBook ");
    }
}
