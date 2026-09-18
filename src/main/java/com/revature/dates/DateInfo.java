package com.revature.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DateInfo {

    public static void main(String[] args) {
        now();
        parsing();
        formatting();
        arithmetic();
        zonesAndInstants();
        comparisons();
        epoch();
    }

    /**  */
    static void now() {
        System.out.println("-- now --");
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

    }

    /**  */
    static void parsing() {
        System.out.println("\n-- parsing --");
        System.out.println(LocalDate.parse("2026-09-17"));
    }

    /** Changing Objects into Text */
    static void formatting() {
        /*
            Note tne var keyword: this tells the compiler to check the assigned value for the type of the variable.
            It is an alternate option for declaring your data type, it does not break Java's static typing
         */
        var date = LocalDate.of(2026, 9, 17);
        var formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.UK);

        System.out.println("\n-- formatting --");
        System.out.println(date.format(formatter));
    }

    /** Moving through time. Every call returns a new object; Use Period/Duration/ChronoUnit to measure the gap
        between two values */
    static void arithmetic() {
        var date = LocalDate.of(2026, 9, 17);

        System.out.println("\n--arithmetic --");
        System.out.println(date.plusDays(10));
        // Remember your dates are immutable
        System.out.println(date);
    }

    /** Time Zones. An Instant is UTC; the same moment reads differently per zone */
    static void zonesAndInstants() {
        var instant = Instant.parse("2026-09-17T04:45:30Z");

        System.out.println("\n-- zones --");
        /*
            If you need to convert between time zones you can od so with the atZone method passing it a ZoneId
         */
        System.out.println(instant.atZone(ZoneId.of("Asia/Tokyo")));
        System.out.println(ZoneId.getAvailableZoneIds());
    }

    /** isBefore/isAfter compare points in time */
    static void comparisons() {
        var a = LocalDate.of(2026, 9, 17);
        var b = LocalDate.of(2027, 1, 17);

        System.out.println("\n-- comparisons --");
        System.out.println(a.isBefore(b));
    }

    /** Second (or millis) since 1970-01-01T00:00:00Z; An Instant round-trips with
        ofEpochSecond/getEpochSecond (and the Milli pair) */
    static void epoch() {
        var instant = Instant.ofEpochSecond(1_787_000_000L);

        System.out.println("\n-- epoch --");
        System.out.println(instant);
    }

}
