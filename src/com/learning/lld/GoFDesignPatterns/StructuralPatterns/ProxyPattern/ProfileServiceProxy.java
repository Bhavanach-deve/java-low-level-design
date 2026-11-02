package com.learning.lld.GoFDesignPatterns.StructuralPatterns.ProxyPattern;

public class ProfileServiceProxy implements ProfileService
{
    private ProfileService realService;
    private boolean authorized;
    public ProfileServiceProxy(ProfileService realService,boolean authorized)
    {
        this.realService=realService;
        this.authorized=authorized;
    }

    @Override
    public String getSenstitiveProfile(int profileId)
    {
        if(!authorized){
            throw new SecurityException("Access denied to sensitive profile");
        }
        System.out.println("Access granted");

        return realService.getSenstitiveProfile(profileId);
    }
}
