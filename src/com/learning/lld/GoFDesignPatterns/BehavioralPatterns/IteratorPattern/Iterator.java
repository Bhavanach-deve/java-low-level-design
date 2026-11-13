package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.IteratorPattern;

public interface Iterator
{
    boolean hasNext();

    Book next();
}
//hasNext() checks whether another element exists.

//next() returns the next element and advances the iterator.