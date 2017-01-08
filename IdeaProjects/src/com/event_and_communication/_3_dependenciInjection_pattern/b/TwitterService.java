package com.event_and_communication._3_dependenciInjection_pattern.b;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class TwitterService implements NotificationService {

    @Override
    public void sendMessage(String sendTo, String message) {
        System.out.println( sendTo + " received");
        System.out.println(message);

    }
}
