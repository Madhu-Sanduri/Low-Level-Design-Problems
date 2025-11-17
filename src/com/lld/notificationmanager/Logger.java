package com.lld.notificationmanager;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

    private static Logger logger;

    private Logger(){

    }

    public static Logger getLogger(){
        if(logger==null){
            synchronized (Logger.class){
                if(logger==null){
                    logger=new Logger();
                }
            }
        }
        return logger;
    }

    public void logger(String message){
        System.out.println("LOG : "+ LocalDateTime.now()+" " + message);
    }


}
