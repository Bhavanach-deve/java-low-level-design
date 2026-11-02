package com.learning.lld.GoFDesignPatterns.StructuralPatterns.ProxyPattern;

public class Main
{
    public static void main(String[] args)
    {
        ProfileService realService=new RealProfileService();

        ProfileService profileService=new ProfileServiceProxy(realService,true);

        String result=profileService.getSenstitiveProfile(101);

        System.out.println(result);

    }
}
