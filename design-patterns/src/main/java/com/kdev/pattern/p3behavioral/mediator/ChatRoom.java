package com.kdev.pattern.p3behavioral.mediator;

import java.util.Date;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
