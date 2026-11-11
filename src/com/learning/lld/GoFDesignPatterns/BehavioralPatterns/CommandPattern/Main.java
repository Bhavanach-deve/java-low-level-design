package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.CommandPattern;

public class Main
{
    public static void main(String[] args)
    {
        LoanService loanService = new LoanService();
        LibraryCommandInvoker invoker = new LibraryCommandInvoker();
        LibraryCommand borrowCommand=new BorrowBookCommand(loanService,101,5001);
        LibraryCommand returnCommand=new ReturnBookCommand(loanService,3001);
        invoker.executeCommand(borrowCommand);
        invoker.executeCommand(returnCommand);

    }
}
//We encapsulate a request or operation inside a command object.