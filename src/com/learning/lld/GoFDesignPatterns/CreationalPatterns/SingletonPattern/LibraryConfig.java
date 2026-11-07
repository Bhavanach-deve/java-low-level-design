package com.learning.lld.GoFDesignPatterns.CreationalPatterns.SingletonPattern;

public class LibraryConfig
{
    //1. Create one static instance
    private static LibraryConfig instance;

    //2. Private constructor
    private LibraryConfig(){
        System.out.println("LibraryConfig object created");
    }
    //3. Global access point
    public static LibraryConfig getInstance(){
        if(instance == null){
            instance = new LibraryConfig();
        }
        return instance;
    }
}
