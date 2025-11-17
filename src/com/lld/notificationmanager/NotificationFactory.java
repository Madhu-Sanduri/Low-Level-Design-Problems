package com.lld.notificationmanager;

public class NotificationFactory {

    public static NotificationManagerService getNotification(String s){

        return switch (s.toUpperCase()){
            case "EMAIL" ->new EMailNotification();
//                break;

            case "SMS" -> new SMSNotification();

            default -> throw new IllegalStateException("Unexpected value: " + s.toUpperCase());
        };
    }
}
