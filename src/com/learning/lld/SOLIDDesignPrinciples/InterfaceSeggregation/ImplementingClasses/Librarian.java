package com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.ImplementingClasses;

import com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.Borrowable;

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
