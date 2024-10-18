package dto;

import java.util.*;

public class MallDemo {
    public static void main(String[] args) {
        List<MallDTO> malls = new ArrayList<>();

        // Creating 10 Mall instances
        malls.add(new MallDTO(1, "Mall A", Location.CITY_CENTER, "Owner A", 50000));
        malls.add(new MallDTO(2, "Mall B", Location.SUBURB, "Owner B", 200000));
        malls.add(new MallDTO(3, "Mall C", Location.DOWNTOWN, "Owner C", 150000));
        malls.add(new MallDTO(4, "Mall D", Location.INDUSTRIAL_AREA, "Owner D", 80000));
        malls.add(new MallDTO(5, "Mall E", Location.CITY_CENTER, "Owner E", 250000));
        malls.add(new MallDTO(6, "Mall F", Location.SUBURB, "Owner F", 95000));
        malls.add(new MallDTO(7, "Mall G", Location.DOWNTOWN, "Owner G", 300000));
        malls.add(new MallDTO(8, "Mall H", Location.INDUSTRIAL_AREA, "Owner H", 120000));
        malls.add(new MallDTO(9, "Mall I", Location.CITY_CENTER, "Owner I", 45000));
        malls.add(new MallDTO(10, "Mall J", Location.SUBURB, "Owner J", 60000));

        // 1. Sort by ID desc
        malls.sort(Comparator.comparingInt(MallDTO::getId).reversed());
        System.out.println("Sorted by ID desc:");
        malls.forEach(System.out::println);

        // 2. Sort by name desc order
        malls.sort(Comparator.comparing(MallDTO::getName).reversed());
        System.out.println("\nSorted by name desc:");
        malls.forEach(System.out::println);

        // 3. Show difference between Iterator and ListIterator
        System.out.println("\nUsing Iterator:");
        Iterator<MallDTO> iterator = malls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing ListIterator:");
        ListIterator<MallDTO> listIterator = malls.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 4. Filter all malls by landDimension less than one lakh
        System.out.println("\nMalls with landDimension less than 100000:");
        malls.stream()
                .filter(mall -> mall.getLandDimension() < 100000)
                .forEach(System.out::println);

        // 5. Collect only names of malls
        System.out.println("\nNames of all malls:");
        List<String> mallNames = malls.stream()
                .map(MallDTO::getName)
                .collect(Collectors.toList());
        mallNames.forEach(System.out::println);

        // 6. Collect only landDimensions and sort them in ascending order
        System.out.println("\nLandDimensions in ascending order:");
        List<Double> landDimensions = malls.stream()
                .map(MallDTO::getLandDimension)
                .sorted()
                .collect(Collectors.toList());
        landDimensions.forEach(System.out::println);
    }
}

