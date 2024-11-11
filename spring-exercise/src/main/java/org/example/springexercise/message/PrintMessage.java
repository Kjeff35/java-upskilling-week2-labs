package org.example.springexercise.message;

import org.springframework.stereotype.Component;

@Component
public class PrintMessage {
    private final MessageService messageService;

    public PrintMessage(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
