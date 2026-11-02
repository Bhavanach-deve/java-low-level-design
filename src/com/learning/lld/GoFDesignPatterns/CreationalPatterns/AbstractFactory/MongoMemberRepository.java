package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class MongoMemberRepository implements MemberRepository
{
    @Override
    public void saveMember() {
        System.out.println("Saving member in MongoDB database");
    }
}
