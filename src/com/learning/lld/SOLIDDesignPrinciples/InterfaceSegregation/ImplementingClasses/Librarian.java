package com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.ImplementingClasses;

import com.learning.lld.SOLIDDesignPrinciples.InterfaceSegregation.Borrowable;

public class Librarian implements Borrowable {
    @Override
    public void borrowBook() {
        System.out.println("Librarian borrowed a book");
    }

    @Override
    public void returnBook() {
        System.out.println("Librarian returned a book");
    }
}
