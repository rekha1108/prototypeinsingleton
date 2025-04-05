package com.example.prototypeinsingleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class B {

    public B() {
        System.out.println("New B instance created: " + this);
    }

    public void doTask() {
        System.out.println("Executing task in B: " + this);
    }
}

