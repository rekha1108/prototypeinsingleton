package com.example.prototypeinsingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A1 {

    @Autowired
    private B b;

    public void run() {
        System.out.println("A1 (autowired):");
        b.doTask();
    }
}

