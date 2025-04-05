package com.example.prototypeinsingleton;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A3 {

    public void run() {
        System.out.println("A3 (@Lookup):");
        getB().doTask();
    }

    @Lookup
    public B getB() {
        return null; // Spring overrides this at runtime
    }
}

