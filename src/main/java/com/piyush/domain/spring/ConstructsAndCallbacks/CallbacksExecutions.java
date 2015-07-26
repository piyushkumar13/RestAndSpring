package com.piyush.domain.spring.ConstructsAndCallbacks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallbacksExecutions {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext-init.xml");
        context.registerShutdownHook();
    }
}
