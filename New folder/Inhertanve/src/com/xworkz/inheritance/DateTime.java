package com.xworkz.inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {

    public static void main(String[] args) {
        // 2.1 Create a past date
        LocalDate pastDate = LocalDate.of(1990, 5, 15);
        System.out.println("Past Date: " + pastDate);

        // 2.2 Create a future date
        LocalDate futureDate = LocalDate.now().plusDays(30);
        System.out.println("Future Date: " + futureDate);

        // 2.3 Create a past datetime
        LocalDateTime pastDateTime = LocalDateTime.of(2010, 12, 25, 10, 30);
        System.out.println("Past DateTime: " + pastDateTime);

        // 2.4 Create a future datetime
        LocalDateTime futureDateTime = LocalDateTime.now().plusHours(5).plusDays(7);
        System.out.println("Future DateTime: " + futureDateTime);
    }
}
