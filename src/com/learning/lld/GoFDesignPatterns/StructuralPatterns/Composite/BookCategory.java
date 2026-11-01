package com.learning.lld.GoFDesignPatterns.StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class BookCategory implements LibraryComponent
{
    private String name;
    private List<LibraryComponent> components;

    public BookCategory(String name){
        this.name=name;
        this.components=new ArrayList<LibraryComponent>();
    }

    public void add(LibraryComponent component){
        components.add(component);
    }
    public void remove(LibraryComponent component){
        components.remove(component);
    }

    @Override
    public void display()
    {
        System.out.println("Category: "+name);

        for(LibraryComponent component:components){
            component.display();
        }
    }
}
