package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StatePattern;

public class OverdueState implements LoanState
{
    @Override
    public void returnBook(Loan loan) {
        System.out.println("Overdue loan returned. Late fee must be calculated.");
        loan.setState(new ReturnedState());
    }

    @Override
    public void renewLoan(Loan loan)
    {
        throw new IllegalStateException("Overdue loans cannot be renewed");

    }
}
