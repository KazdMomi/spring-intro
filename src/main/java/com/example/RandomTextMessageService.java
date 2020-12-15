package com.example;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component("messageService2")
public class RandomTextMessageService implements MessageService{
    private String randomMessege[] = new String[] {"Random 1","Random 2","Random 3","Random 4","Random 5",
            "Random 6","Random 7","Random 8","Random 9","Random 10"};
    @Override
    public String getMessage() {
        int i = (int)(Math.random()*10+1);
        return randomMessege[i];
        //return randomMessege[new Random().nextInt(9)];
    }
}
