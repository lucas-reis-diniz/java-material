package com.lucas.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        CoffeSize ordered = CoffeSize.LARGE;
        System.out.println("A customer has just ordered a " + ordered.getName() + " coffe for $" + ordered.getPrice() + ".");

    }
}
