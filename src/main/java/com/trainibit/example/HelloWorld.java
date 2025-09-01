package com.trainibit.example;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    @Autowired
    private User user;

    public void sayHello() {
        System.out.println("Hello World. User: " +
                user.getName() + " " +
                user.getLastName() + ", Birth date: " +
                user.getBirthDate());
    }
}
