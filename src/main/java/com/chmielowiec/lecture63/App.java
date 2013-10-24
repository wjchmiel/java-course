package com.chmielowiec.lecture63;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class App {

    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };
    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"}
    };

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<>();

        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            System.out.print("Vehicle: " + vehicle + ", drivers: ");

            Set<String> driverSet = new LinkedHashSet<>();

            for (String driver : driversList) {
                driverSet.add(driver);
            }

            System.out.println(driverSet);

            personnel.put(vehicle, driverSet);
        }

        Set<String> driversList = personnel.get("helicopter");

        for (String driver : driversList) {
            System.out.println(driver);
        }

        for (String vehicle : personnel.keySet()) {

            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList1 = personnel.get(vehicle);

            for (String driver : driversList1) {
                System.out.print(driver);
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
