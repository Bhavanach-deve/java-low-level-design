package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ObserverPattern;

public class LibrarianAuditObserver implements LoanObserver
{
    @Override
    public void onLoanReturned(int loanId) {
        System.out.println("Audit recorded: Loan "+loanId+" was returned.");
    }
}
