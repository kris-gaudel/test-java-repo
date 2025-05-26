package com.example;

import java.util.Date;

public class LegacyCode {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated!");
    }

    public void useDeprecated() {
        Date date = new Date();
        System.out.println("Current date: " + date.toGMTString()); // Deprecated!
    }
}
