package com.event_and_communication._3_dependenciInjection_pattern.c;

import com.event_and_communication._3_dependenciInjection_pattern.a.GoogleProvider;
import com.event_and_communication._3_dependenciInjection_pattern.a.Provider;
import com.event_and_communication._3_dependenciInjection_pattern.b.NotificationService;
import com.event_and_communication._3_dependenciInjection_pattern.b.TwitterService;
import com.google.inject.AbstractModule;

/**
 * Created by Adil Bozov on 26.10.2016 г..
 */
public class InjectionModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(NotificationService.class).to(TwitterService.class);
        bind(Provider.class).to(GoogleProvider.class);
    }
}
