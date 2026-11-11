package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class BorrowRequest
{
    private boolean authenticated;
    private boolean activeMember;
    private int activeLoans;
    private boolean bookAvailable;

    public BorrowRequest(boolean authenticated, boolean activeMember, int activeLoans, boolean bookAvailable) {
        this.authenticated = authenticated;
        this.activeMember = activeMember;
        this.activeLoans = activeLoans;
        this.bookAvailable = bookAvailable;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isActiveMember() {
        return activeMember;
    }
    public int getActiveLoans() {
        return activeLoans;
    }

    public boolean isBookAvailable() {
        return bookAvailable;
    }
}
//This object carries the information needed by our validation handlers.