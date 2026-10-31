package com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution;

public class AudioBook implements Readable {
    public void readBook() {
        System.out.println("Playing AudioBook ");
    }
}
