package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StatePattern;

public interface LoanState
{
    void returnBook(Loan loan);
    void renewLoan(Loan loan);
}
