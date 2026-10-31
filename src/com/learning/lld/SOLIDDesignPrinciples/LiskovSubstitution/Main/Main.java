package com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution.Main;

import com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution.AudioBook;
import com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution.PrintBook;

public class Main
{
    static void main(String[] args) {
        PrintBook printBook = new PrintBook();
        printBook.readBook();
        printBook.borrowBook();
        printBook.returnBook();
        System.out.println();
        AudioBook audioBook = new AudioBook();
        audioBook.readBook();
    }
}
