package org.example.stack;


import java.util.Stack;

public class StackCalculator {

    private final Stack<Double> stack;

    public StackCalculator() {
        stack = new Stack<>();
    }

    public void push(double operand) {
        stack.push(operand);
    }

    public double pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.pop();
    }

    public void performOperation(char operator) {
        if (stack.size() < 2) {
            throw new IllegalStateException("Insufficient operands in the stack");
        }

        double b = stack.pop();
        double a = stack.pop();
        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }

        stack.push(result);
    }

    public double getResult() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("No result available");
        }
        return stack.peek();
    }
}