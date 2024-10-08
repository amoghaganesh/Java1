package com.xworkz.funinterfaace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrimeMinister {
    public static void main(String[] args) {
        // Creating a collection of Prime Minister names
        Collection<String> pmNames = new ArrayList<>();

        // Adding elements to the collection
        pmNames.add("Narendra Modi");
        pmNames.add("Manmohan Singh");
        pmNames.add("Atal Bihari Vajpayee");
        pmNames.add("Rajiv Gandhi");
        pmNames.add("Indira Gandhi");
        pmNames.add("Jawaharlal Nehru");
        pmNames.add("Morarji Desai");
        pmNames.add("Lal Bahadur Shastri");
        pmNames.add("P. V. Narasimha Rao");
        pmNames.add("Vishwanath Pratap Singh");

        // a. Sort in ascending order using stream
        List<String> ascendingOrder = pmNames.stream()
                .sorted((ref1, ref2) -> ref1.compareTo(ref2))
                .toList();
        System.out.println("Prime Ministers in Ascending Order: " + ascendingOrder);

        // b. Sort in descending order using stream
        List<String> descendingOrder = pmNames.stream()
                .sorted((ref1, ref2) -> ref2.compareTo(ref1))
                .toList();
        System.out.println("Prime Ministers in Descending Order: " + descendingOrder);
    }
}
