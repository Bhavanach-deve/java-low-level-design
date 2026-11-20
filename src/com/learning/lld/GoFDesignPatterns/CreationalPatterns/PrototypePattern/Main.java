package com.learning.lld.GoFDesignPatterns.CreationalPatterns.PrototypePattern;

public class Main
{
    public static void main(String[] args)
    {
        Book original=new Book("Effective java","Bloch","Programming");

        Book copy=original.clone();
        System.out.println(original.title);
        System.out.println(copy.title);
        System.out.println(original==copy);
    }
}
