package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StrategyPattern;

public class ProfileService
{
    public String  casteDetails(String details,CasteStrategy strategy)
    {
        return strategy.subCasteDetails(details);
    }
}
