package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MediatorPattern;

public class LibraryCoordinator implements LibraryMediator
{
    private NotificationService notificationService;
    private LibrarianDashboard dashboard;

    public LibraryCoordinator(NotificationService notificationService,LibrarianDashboard librarianDashboard){
        this.notificationService = notificationService;
        this.dashboard = librarianDashboard;
    }

    @Override
    public void notify(Object sender, String event) {
        if(event.equals("BOOK_RETURNED")){
            notificationService.notifyMember();
            dashboard.updateDashBoard();
        }
    }
}
//The concrete mediator knows the participating components and coordinates their interaction.