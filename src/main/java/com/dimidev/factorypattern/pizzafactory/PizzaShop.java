package com.dimidev.factorypattern.pizzafactory;

public class PizzaShop {
    PizzaFactory factory;

    public PizzaShop(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
