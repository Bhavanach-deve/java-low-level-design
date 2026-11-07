package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StrategyPattern;

public class Main
{
    public static void main(String[] args)
    {
        CasteStrategy mk=new MunnurKapu();
        CasteStrategy reddy=new Reddy();
        String data="Provide your details";
        ProfileService service1=new ProfileService();
        System.out.println(service1.casteDetails(data,mk));
    }
}
