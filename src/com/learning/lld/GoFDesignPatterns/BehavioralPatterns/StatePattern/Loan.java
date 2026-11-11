package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StatePattern;

public class Loan
{
    private LoanState state;
    public Loan(LoanState state){
        this.state = state;
    }
    public void setState(LoanState state){
        this.state = state;
    }
    public void returnBook(){
        state.returnBook(this);
    }
    public void renewLoan(){
        state.renewLoan(this);
    }
}
//This is the most important class to understand.
//
//Loan is called the Context in the State Pattern.