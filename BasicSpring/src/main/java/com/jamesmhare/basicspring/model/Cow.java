package com.jamesmhare.basicspring.model;

import org.springframework.stereotype.Component;

@Component
public class Cow {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("The cow says moo.");
    }
}
