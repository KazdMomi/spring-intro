package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class MyApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService messageService = ctx.getBean("messageService", MessageService.class);
        MessageService messageService2 = ctx.getBean("randomMessageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
        System.out.println(System.identityHashCode(messageService.getMessage()));
        System.out.println(System.identityHashCode(messageService2.getMessage()));
    }
}
