package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        // Predicate to check if a number is positive
        // Takes an integer and returns true if it is positive, otherwise false
        Predicate<Integer> isPositive = n -> n > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5)); // Output: true

        // Function to convert a string to its length
        // Takes a string and returns its length
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda")); // Output: 6

        // Consumer to print a string
        // Takes a string and prints it
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Hello, World!"); // Output: Hello, World!

        // Supplier to supply a random number
        // Takes no input and returns a random double
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random Number: " + randomNumber.get());
    }
}