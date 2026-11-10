package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.CommandPattern;

public class BorrowBookCommand implements LibraryCommand
{
    private final LoanService loanService;
    private final int memberId;
    private final int bookCopyId;

    public BorrowBookCommand(LoanService loanService, int memberId, int bookCopyId){
        this.loanService = loanService;
        this.memberId = memberId;
        this.bookCopyId = bookCopyId;
    }

    @Override
    public void execute(){
        loanService.borrowBook(memberId, bookCopyId);
    }
}
