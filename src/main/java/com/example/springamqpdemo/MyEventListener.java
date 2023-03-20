package com.example.springamqpdemo;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener
    public void handleContextClosedEvent(ContextClosedEvent event) {


    }
}
