package org.example.springexercise;

import org.example.springexercise.message.PrintMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExerciseApplication {

    public static void main(String[] args) {
        var context =SpringApplication.run(SpringExerciseApplication.class, args);
        PrintMessage printer = context.getBean(PrintMessage.class);
        printer.printMessage();
    }

}
