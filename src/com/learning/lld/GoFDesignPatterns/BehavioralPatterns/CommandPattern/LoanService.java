package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.CommandPattern;

public class LoanService
{
    public void borrowBook(int memberId,int bookCopyId){
        System.out.println("Member "+memberId+" borrowed book copy "+bookCopyId);
    }
    public void returnBook(int loanId){
        System.out.println("Loan "+loanId+" returned successfully");
    }
}
