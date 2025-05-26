package com.example;

public class InlineSQL {
    public void runQuery() {
        String sql = "SELECT * FROM users WHERE username='admin'"; // Should be in .sql file
        System.out.println("Executing: " + sql);
    }
}
