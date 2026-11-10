package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.CommandPattern;

import com.learning.lld.SOLIDDesignPrinciples.DependencyInversion.Service.BookService;

public class ReturnBookCommand implements LibraryCommand
{
    private final LoanService loanService;
    private final int loanId;

    public  ReturnBookCommand(LoanService loanService, int loanId)
    {
        this.loanService = loanService;
        this.loanId = loanId;
    }
    @Override
    public void execute()
    {
        loanService.returnBook(loanId);
    }
}
