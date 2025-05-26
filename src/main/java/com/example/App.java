package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Example method to trigger your tool's checks
    public void doSomething(String input) {
        String password = "your_secret_password"; // This line should be flagged!
        System.out.println("Input: " + password);
    }
}
