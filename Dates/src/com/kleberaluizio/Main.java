package com.kleberaluizio;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        //Working with Dates

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("Month : " + localDateTime.getMonth());
        System.out.println("Year : " + localDateTime.getDayOfYear());
        System.out.println("Day of Week : " + localDateTime.getDayOfWeek());
        System.out.println("Hour : " + localDateTime.getHour());
        System.out.println("Minute : " + localDateTime.getMinute());
        System.out.println("Second : " + localDateTime.getSecond());
        System.out.println(localDateTime.minusDays(5));
        System.out.println(localDateTime.minusDays(5).plusMinutes(11).plusMonths(36));

        System.out.println("-".repeat(50));

        LocalDateTime someDate =  LocalDateTime.of(2000,
                    Month.DECEMBER,
                    1,
                    14,
                    26,
                    22
            );

        LocalTime someDate1 =  LocalTime.of(
                14,
                26,
                22
        );
        System.out.println(someDate);
        System.out.println(someDate1);
        System.out.println("-".repeat(50));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Month : " + localDate.plusMonths(3).getMonth());
        System.out.println("Year : " + localDate.getDayOfYear());
        System.out.println("Day of Week : " + localDate.getDayOfWeek());
        System.out.println(localDate.minusDays(5));
        System.out.println(localDate.minusDays(5).plusMonths(36));

        System.out.println("-".repeat(50));

        System.out.println("Available Zone Ids");
        for(String z : ZoneId.getAvailableZoneIds()){
             System.out.println("\t" + z);
        }
        System.out.println("-".repeat(50));

        LocalDateTime here = LocalDateTime.now();
        LocalDateTime australia = LocalDateTime.now(ZoneId.of("Australia/Hobart"));

        System.out.println(here);
        System.out.println(australia);

        System.out.println("-".repeat(50));

        System.out.println(LocalDate.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());

        System.out.println("-".repeat(50));

        System.out.println(System.currentTimeMillis());
    }
}
