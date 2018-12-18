package com.github.cafecomjavanaresource.todo.listener;

import com.github.cafecomjavanaresource.todo.message.data.TodoMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "todo-channel", containerFactory = "myFactory")
    public void receiveMessage(TodoMessage todo) {
        System.out.println(String.format("#### Received todo: < %s >", todo));
    }

}
