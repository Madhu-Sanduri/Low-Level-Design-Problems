package com.lld.notificationmanager;

public class EMailNotification implements NotificationManagerService{
    private final Logger logger= Logger.getLogger();
    @Override
    public void send(String message, String type) {
        logger.logger(type+","+ message);

    }
}
