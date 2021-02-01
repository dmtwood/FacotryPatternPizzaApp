package com.dimidev.factorypattern.pizzafactory;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaShop store = new PizzaShop(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
