package com.lld.notificationmanager;

public class SMSNotification implements NotificationManagerService{

    private final Logger logger=Logger.getLogger();
    @Override
    public void send(String message, String type) {
        logger.logger(type+","+ message);
        //actucal code;
    }
}
