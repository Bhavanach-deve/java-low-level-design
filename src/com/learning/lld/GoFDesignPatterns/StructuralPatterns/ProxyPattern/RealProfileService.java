package com.learning.lld.GoFDesignPatterns.StructuralPatterns.ProxyPattern;

public class RealProfileService implements ProfileService
{

    @Override
    public String getSenstitiveProfile(int profileId) {
        System.out.println("Fetching senstitive profile...");
        return "Senstitive profile details for "+profileId;
    }
}
