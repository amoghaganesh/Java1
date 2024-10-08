package com.xworkz.funinterfaace;
import java.util.*;

public class LongCollectionSorting {
    public static void main(String[] args) {
        // Creating a collection of long elements
        Collection<Long> longList = new ArrayList<>();

        // Adding elements to the collection
        longList.add(102L);
        longList.add(59L);
        longList.add(74L);
        longList.add(23L);
        longList.add(87L);
        longList.add(46L);
        longList.add(38L);
        longList.add(91L);
        longList.add(15L);
        longList.add(65L);

        // a. Sort in ascending order using stream
        List<Long> ascendingOrder = longList.stream()
                .sorted((ref1, ref2) -> ref1.compareTo(ref2))
                .toList();
        System.out.println("Ascending Order (Long): " + ascendingOrder);

        // b. Sort in descending order using stream
        List<Long> descendingOrder = longList.stream()
                .sorted((ref1, ref2) -> ref2.compareTo(ref1))
                .toList();
        System.out.println("Descending Order (Long): " + descendingOrder);
    }
}
