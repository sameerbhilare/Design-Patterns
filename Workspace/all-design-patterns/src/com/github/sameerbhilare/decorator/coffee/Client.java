package com.github.sameerbhilare.decorator.coffee;

public class Client {

    public static void main(String[] args) {

        Coffee coffe = new SimpleCoffee();
        System.out.println("Desc: " + coffe.getDescription() + ", Cost: " + coffe.getCost());

        coffe = new MilkDecorator(new SimpleCoffee());
        System.out.println("Desc: " + coffe.getDescription() + ", Cost: " + coffe.getCost());

        coffe = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Desc: " + coffe.getDescription() + ", Cost: " + coffe.getCost());
    }
}
