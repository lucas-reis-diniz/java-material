package com.lucas.test;

public enum CoffeSize {

    SMALL("Small", 2),
    MEDIUM("Medium", 4),
    LARGE("Large", 7);

    private String name;

    private int price;

    CoffeSize(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public int getPrice() { return price; }
}
