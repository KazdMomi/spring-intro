package com.example;

import org.springframework.context.annotation.*;

@Configuration
public class MessageServiceConfig {
    @Bean
    public MessageService messageService(){
        return new MyNameMessageService();
    }
    @Bean
    public MessageService randomMessageService(){
        return new RandomTextMessageService();
    }
}
