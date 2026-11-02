package com.learning.lld.GoFDesignPatterns.StructuralPatterns.FacadePattern;

public class LibraryFacade
{
    private MemberService memberService;
    private BookService bookService;
    private LoanService loanService;
    private NotificationService notificationService;

    public LibraryFacade(MemberService memberService, BookService bookService, LoanService loanService, NotificationService notificationService){
        this.memberService = memberService;
        this.bookService = bookService;
        this.loanService = loanService;
        this.notificationService = notificationService;
    }
    public void borrowBook(int memberId,int bookCopyId){
        if(!memberService.isActiveMember(memberId)){
            throw new IllegalArgumentException("Member is  inactive.");
        }
        if(!bookService.isBookAvailable(bookCopyId)){
            throw new IllegalArgumentException("Book is unavailable.");
        }
        loanService.createLoan(memberId,bookCopyId);
        notificationService.sendBorrowConfirmation(memberId);
    }
}
