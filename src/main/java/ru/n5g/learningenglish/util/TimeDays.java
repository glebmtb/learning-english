package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimeDays {
    private static Map<String, String> timeDays = getTimeDays();
    private static Random random = new Random(System.nanoTime());

    private static Map<String, String> getTimeDays() {
        Map<String, String> months = new HashMap<String, String>();
        months.put("утро", "morning");
        months.put("день", "afternoon");
        months.put("вечер", "evening");
        months.put("ночь", "night");

        return months;
    }

    public static String getRandomTimeDay() {
        int month = random.nextInt(4);
        return String.valueOf(timeDays.keySet().toArray()[month]);
    }

    public static String translateTimeDay(String timesYear) {
        return timeDays.get(timesYear);
    }
}
