package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StatePattern;

public class ActiveState implements LoanState
{

    @Override
    public void returnBook(Loan loan) {
        System.out.println("Active loan returned");
        loan.setState(new ReturnedState());
    }

    @Override
    public void renewLoan(Loan loan) {
        System.out.println("Active loan renewed");
    }

}
