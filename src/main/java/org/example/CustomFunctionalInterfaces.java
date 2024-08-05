package org.example;
public class CustomFunctionalInterfaces {
    public static void main(String[] args) {
        // Lambda expression for greeting service
        // Takes a string message and prints "Hello, <message>"
        GreetingService greetService = message -> System.out.println("Hello, " + message);
        greetService.sayMessage("World");

        // Lambda expression for calculating string length
        // Takes a string and returns its length
        StringLength stringLength = str -> str.length();
        System.out.println("Length of 'Lambda': " + stringLength.getLength("Lambda"));
    }

    // Functional interface for greeting service
    // Contains a single abstract method 'sayMessage' which takes a string and returns void
    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    // Functional interface for string length calculation
    // Contains a single abstract method 'getLength' which takes a string and returns an integer
    @FunctionalInterface
    interface StringLength {
        int getLength(String str);
    }
}