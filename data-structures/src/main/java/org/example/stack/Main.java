package org.example.stack;

public class Main {
    public static void main(String[] args) {
        StackCalculator calculator = new StackCalculator();

        calculator.push(5);
        calculator.push(3);
        calculator.performOperation('+');
        System.out.println("Result: " + calculator.getResult());

        calculator.push(4);
        calculator.performOperation('*');
        System.out.println("Result: " + calculator.getResult());

        calculator.push(2);
        calculator.performOperation('/');
        System.out.println("Result: " + calculator.getResult());
    }
}
