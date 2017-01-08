package com.event_and_communication._3_dependenciInjection_pattern.d_main;

import com.event_and_communication._3_dependenciInjection_pattern.c.InjectionModule;
import com.event_and_communication._3_dependenciInjection_pattern.c.TwitterWrapper;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new InjectionModule());
        TwitterWrapper twitterWrapper = injector.getInstance(TwitterWrapper.class);

        twitterWrapper.processNotification("Program", "Hello!");
    }
}


