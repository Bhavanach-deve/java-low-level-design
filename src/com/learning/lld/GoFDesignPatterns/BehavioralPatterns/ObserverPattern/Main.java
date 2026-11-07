package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ObserverPattern;

public class Main
{
    public static void main(String[] args)
    {
        LoanEventPublisher publisher=new LoanEventPublisher();
        LoanObserver emailObserver=new MemberEmailObserver();
        LoanObserver auditObserver=new LibrarianAuditObserver();

        publisher.addObserver(emailObserver);
        publisher.addObserver(auditObserver);

        int loanId=14;

        // Imagine the loan has been successfully returned.
        publisher.notifyLoanReturned(loanId);

    }
}
