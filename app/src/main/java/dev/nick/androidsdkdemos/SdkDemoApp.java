package dev.nick.androidsdkdemos;

import com.nick.scalpel.ScalpelApplication;

import dev.nick.eventbus.EventBus;

public class SdkDemoApp extends ScalpelApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.create(this);
    }
}