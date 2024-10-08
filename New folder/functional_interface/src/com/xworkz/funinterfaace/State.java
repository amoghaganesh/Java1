package com.xworkz.funinterfaace;
import java.util.*;
import java.util.List;

public class State {

    public static void main(String[] args) {
        // Creating a collection of state names
        Collection<String> stateNames = new ArrayList<>();

        // Adding elements to the collection
        stateNames.add("Karnataka");
        stateNames.add("Maharashtra");
        stateNames.add("Tamil Nadu");
        stateNames.add("Uttar Pradesh");
        stateNames.add("Kerala");
        stateNames.add("Bihar");
        stateNames.add("Punjab");
        stateNames.add("Gujarat");
        stateNames.add("Rajasthan");
        stateNames.add("West Bengal");

        // a. Sort in ascending order using stream
        List<String> ascendingOrder = stateNames.stream()
                .sorted((ref1, ref2) -> ref1.compareTo(ref2))
                .toList();
        System.out.println("States in Ascending Order: " + ascendingOrder);

        // b. Sort in descending order using stream
        List<String> descendingOrder = stateNames.stream()
                .sorted((ref1, ref2) -> ref2.compareTo(ref1))
                .toList();
        System.out.println("States in Descending Order: " + descendingOrder);
    }
}
