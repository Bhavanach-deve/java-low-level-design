package com.learning.lld.GoFDesignPatterns.CreationalPatterns.AbstractFactory;

public class MySQLMemberRepository implements MemberRepository
{

    @Override
    public void saveMember() {
        System.out.println("Saving member in MySQL database");
    }
}
