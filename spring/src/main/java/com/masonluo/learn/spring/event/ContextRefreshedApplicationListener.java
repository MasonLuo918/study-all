package com.masonluo.learn.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Masonluo
 * @date 2020-10-16 09:38
 */
@Component
public class ContextRefreshedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Context Refreshed application");
    }
}
