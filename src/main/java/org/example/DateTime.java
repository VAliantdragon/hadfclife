package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) throws InterruptedException {

        Instant start=Instant.now();
        System.out.println(start);
        Thread.sleep(1000);
        Instant end=Instant.now();
        Duration d=Duration.between(start,end);
        System.out.println(d.getSeconds());

        LocalDate dateTime=LocalDate.now();
        System.out.println(dateTime);

        LocalDateTime t=LocalDateTime.now();
        System.out.println(t.minusWeeks(1));

    }
}
