package org.example.controller;


import org.example.model.Counter;

public class CountController {

    private final Counter counter = new Counter();

    public Counter getCounter() {
        return counter;
    }
}
