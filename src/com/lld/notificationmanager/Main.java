package com.lld.notificationmanager;

public class Main {


    public static void main(String[] args) {
        NotificationManagerService email = NotificationFactory.getNotification("EMAIL");
        email.send("madhu@test.com", "Welcome Madhu!");

        NotificationManagerService sms = NotificationFactory.getNotification("SMS");
        sms.send("9876543210", "Your OTP is 12345");

        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println(logger1 == logger2); // true (singleton)
    }
}
