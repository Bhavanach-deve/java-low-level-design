package com.learning.lld.GoFDesignPatterns.CreationalPatterns.SingletonPattern;

public class LibraryApplication
{
    public static void main(String[] args)
    {
        LibraryConfig config1=LibraryConfig.getInstance();
        LibraryConfig config2=LibraryConfig.getInstance();
        System.out.println(config1==config2);

    }
}
