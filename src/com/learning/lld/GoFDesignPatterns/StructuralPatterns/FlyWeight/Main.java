package com.learning.lld.GoFDesignPatterns.StructuralPatterns.FlyWeight;

public class Main
{
    public static void main(String[] args)
    {
        BookDetails sharedDetails=new BookDetails("Clean Code","Robert C. Martin");

        BookCopy copy1=new BookCopy(101,sharedDetails,true);

        BookCopy copy2=new BookCopy(102,sharedDetails,false);

        copy1.display();
        copy2.display();


    }
}
