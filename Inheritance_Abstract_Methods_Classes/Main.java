package com.lucas.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    List<Vehicle> vehicleList = new ArrayList<>();
    vehicleList.add(new Car());
    vehicleList.add(new Motorbike());

    for (Vehicle vehicle : vehicleList) {
        vehicle.activateBreaks();
    }

    }
}
