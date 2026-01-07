package com.github.sameerbhilare.decorator.coffee;

// Concrete component - Base coffee
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
