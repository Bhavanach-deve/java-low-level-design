package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StrategyPattern;

public class MunnurKapu implements CasteStrategy
{
    @Override
    public String subCasteDetails(String details) {
        return "MunnurKapu profiles";
    }
}
