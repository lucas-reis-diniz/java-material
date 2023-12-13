package com.lucas.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        cal.add(Calendar.DAY_OF_YEAR, 1);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR));

    }
}
