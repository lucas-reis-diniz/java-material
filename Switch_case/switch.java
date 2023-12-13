package com.lucas.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String word = "fasfga";

        switch (word){
            case "banana":
                System.out.println("Congrats! You found it!");
                return;
            case "apple":
                System.out.println("Not apple!");
                break;
            case "pear":
                System.out.println("Not pear!");
                break;
            default:
                System.out.println("No match was found at all!");
                break;
        }

        System.out.println("Hello");

    }
}
