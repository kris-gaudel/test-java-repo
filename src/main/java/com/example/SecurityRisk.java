package com.example;

public class SecurityRisk {
    public static void main(String[] args) {
        // Example of hardcoded password
        String password = "supersecret123"; // Should be flagged!
        System.out.println("Using password: " + password);
    }
}
