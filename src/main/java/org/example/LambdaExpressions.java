package org.example;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Lambda expression for addition
        // Takes two integers (a, b) and returns their sum
        MathOperation add = (a, b) -> a + b;

        // Lambda expression for subtraction
        // Takes two integers (a, b) and returns their difference
        MathOperation subtract = (a, b) -> a - b;

        // Lambda expression for multiplication
        // Takes two integers (a, b) and returns their product
        MathOperation multiply = (a, b) -> a * b;

        // Lambda expression for division
        // Takes two integers (a, b) and returns their quotient
        MathOperation divide = (a, b) -> a / b;

        // Testing the lambda expressions with sample inputs
        System.out.println("Addition: " + add.operate(5, 3)); // Output: 8
        System.out.println("Subtraction: " + subtract.operate(5, 3)); // Output: 2
        System.out.println("Multiplication: " + multiply.operate(5, 3)); // Output: 15
        System.out.println("Division: " + divide.operate(6, 3)); // Output: 2
    }

    // Functional interface for arithmetic operations
    // Contains a single abstract method 'operate' which takes two integers and returns an integer
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }
}