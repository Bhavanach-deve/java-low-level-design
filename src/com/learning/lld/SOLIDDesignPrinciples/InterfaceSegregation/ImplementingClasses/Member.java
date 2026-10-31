package com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.ImplementingClasses;

import com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.Readable;
import com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.Searchable;

public class Member implements Searchable, Readable {
    @Override
    public void readBook() {
        System.out.println("Member is reading book details");
    }

    @Override
    public void searchBook() {
        System.out.println("Member is searching for a book");

    }
}
