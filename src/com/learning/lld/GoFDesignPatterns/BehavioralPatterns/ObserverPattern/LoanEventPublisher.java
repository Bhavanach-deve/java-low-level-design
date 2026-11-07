package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class LoanEventPublisher
{
    private final List<LoanObserver>observers=new ArrayList<>();

    public void addObserver(LoanObserver observer)
    {
        observers.add(observer);
    }
    public void removeObserver(LoanObserver observer)
    {
        observers.remove(observer);
    }
    public void notifyLoanReturned(int loanId)
    {
        for(LoanObserver observer:observers){
            observer.onLoanReturned(loanId);
        }
    }
}
