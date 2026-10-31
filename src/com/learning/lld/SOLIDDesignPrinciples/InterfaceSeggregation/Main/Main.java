package com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.Main;

import com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.ImplementingClasses.Admin;
import com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.ImplementingClasses.Librarian;
import com.learning.lld.SOLIDDesignPrinciples.InterfaceSeggregation.ImplementingClasses.Member;

public class Main
{
    public static void main(String[] args)
    {
        Librarian librarian = new Librarian();
        librarian.borrowBook();
        librarian.returnBook();

        Member member = new Member();
        member.searchBook();
        member.readBook();

        Admin admin=new Admin();
        admin.downloadReport();
    }
}
