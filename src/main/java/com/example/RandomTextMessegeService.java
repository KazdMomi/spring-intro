package com.example;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component("messageService2")
public class RandomTextMessegeService implements MessageService{
    private String randomMessage[] = new String[] {"Random 1","Random 2","Random 3","Random 4","Random 5",
            "Random 6","Random 7","Random 8","Random 9","Random 10"};
    @Override
    public String getMessage() {
        return randomMessage[new Random().nextInt(9)];
    }
}
