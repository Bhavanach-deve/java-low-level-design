package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StrategyPattern;

public class Reddy implements CasteStrategy
{
    @Override
    public String subCasteDetails(String details) {
        return "Reddy profiles";
    }
}
