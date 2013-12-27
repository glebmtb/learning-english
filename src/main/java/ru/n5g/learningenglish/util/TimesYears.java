package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimesYears {
    private static Map<String, String> timesYears = getTimesYears();
    private static Random random = new Random(System.nanoTime());

    private static Map<String, String> getTimesYears() {
        Map<String, String> months = new HashMap<String, String>();
        months.put("весна", "spring");
        months.put("лето", "summer");
        months.put("осень", "autumn");
        months.put("зима", "winter");

        return months;
    }

    public static String getRandomTimesYear() {
        int month = random.nextInt(4);
        return String.valueOf(timesYears.keySet().toArray()[month]);
    }

    public static String translateTimesYear(String timesYear) {
        return timesYears.get(timesYear);
    }
}
