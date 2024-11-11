package org.example.springexercise.message;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String getMessage() {
        return "Hello World!";
    }
}
