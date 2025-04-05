package com.example.prototypeinsingleton;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A2 {

    @Autowired
    private ObjectProvider<B> bProvider;

    public void run() {
        System.out.println("A2 (ObjectProvider):");
        bProvider.getObject().doTask();
    }
}

