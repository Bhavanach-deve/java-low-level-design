package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StatePattern;

public class ReturnedState implements LoanState{
    @Override
    public void returnBook(Loan loan)
    {
        throw new IllegalStateException(
                "Book has already been returned"
        );
    }

    @Override
    public void renewLoan(Loan loan) {
        throw new IllegalStateException(
                "Returned loan cannot be renewed"
        );
    }
}
