package com.event_and_communication._3_dependenciInjection_pattern.c;

import com.event_and_communication._3_dependenciInjection_pattern.a.Provider;
import com.event_and_communication._3_dependenciInjection_pattern.b.NotificationService;
import com.google.inject.Inject;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class TwitterWrapper {

    NotificationService service;
    Provider provider;



    @Inject
    private TwitterWrapper(NotificationService service, Provider provider){
        this.service = service;
        this.provider = provider;
    }

    public void processNotification(String sendTo, String message){
        System.out.println("Provider: " + this.provider.getProvider());
        this.service.sendMessage(sendTo, message);
    }
}
