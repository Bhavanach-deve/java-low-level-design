package com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution;

public class AudioBook implements Readable {
    public void readBook(String message) {
        System.out.println("Reading AudioBook ");
    }
}
