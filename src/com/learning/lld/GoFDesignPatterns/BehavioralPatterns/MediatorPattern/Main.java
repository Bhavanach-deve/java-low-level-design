package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MediatorPattern;

public class Main
{
    public static void main(String[] args)
    {
        NotificationService notificationService = new NotificationService();
        LibrarianDashboard librarianDashboard = new LibrarianDashboard();
        LibraryCoordinator coordinator=new LibraryCoordinator(notificationService, librarianDashboard);
        InventoryService inventory=new InventoryService(coordinator);
        inventory.markAvailable();

    }
}
