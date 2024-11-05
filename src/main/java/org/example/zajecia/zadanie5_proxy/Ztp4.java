package org.example.zajecia.zadanie5_proxy;

public class Ztp4 {
    public static void main(String[] args) {
        User guest = new User("Guest", UserRole.GUEST);
        User regular = new User("Regular", UserRole.USER);
        User moderator = new User("Moderator", UserRole.MODERATOR);
        User admin = new User("Admin", UserRole.ADMIN);


        INewsService guestService = new NewsServiceProxy(guest);
        INewsService regularService = new NewsServiceProxy(regular);
        INewsService moderatorService = new NewsServiceProxy(moderator);
        INewsService adminService = new NewsServiceProxy(admin);

        System.out.println(guestService.addMessage("Quest", "Message1"));
        System.out.println(regularService.addMessage("Regular", "Message2"));
        System.out.println(moderatorService.addMessage("moderator", "Message3"));
        System.out.println(adminService.addMessage("Admin", "Message4"));

        System.out.println(guestService.readMessage(1));
        System.out.println(guestService.readMessage(1));
        System.out.println(guestService.readMessage(3));

        System.out.println(regularService.editMessage(1, "xREGULARx"));
        System.out.println(moderatorService.editMessage(2,"xModeratorx"));
        System.out.println(adminService.editMessage(3, "xAdminx"));


        System.out.println(moderatorService.deleteMessage(1));
        System.out.println(adminService.deleteMessage(2));

        System.out.println(guestService.readMessage(1));
        System.out.println(guestService.readMessage(2));


    }
}