package com.learning.lld.GoFDesignPatterns.StructuralPatterns.FacadePattern;

public class MemberService
{
    public boolean isActiveMember(int memberId){
        System.out.println("Checking member....");
        return true;
    }
}
class BookService{
    public boolean isBookAvailable(int bookCopyId){
        System.out.println("Checking book availability...");
        return true;
    }
}
class LoanService{
    public void createLoan(int member,int bookCopyId){
        System.out.println("Creating loan...");
    }
}
class NotificationService{
    public void sendBorrowConfirmation(int memberId){
        System.out.println("Sending confirmation...");
    }
}