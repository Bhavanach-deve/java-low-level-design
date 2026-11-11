package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.StatePattern;

public class Main
{

    static void main(String[] args) {

        Loan loan = new Loan(new ActiveState());
        loan.returnBook();

        loan.returnBook();

    }

}
