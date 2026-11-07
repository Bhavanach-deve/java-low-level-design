package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ObserverPattern;

public class MemberEmailObserver implements LoanObserver
{
    @Override
    public void onLoanReturned(int loanId) {
        System.out.println("Email sent: Loan "+loanId+" returned successfully");
    }
}
