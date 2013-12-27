package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class DaysWeeks {
    private static Map<String, String> daysWeeks = getDaysWeeks();
    private static Random random = new Random(System.nanoTime());

    private static Map<String, String> getDaysWeeks() {
        Map<String, String> months = new HashMap<String, String>();
        months.put("понедельник", "monday");
        months.put("вторник", "tuesday");
        months.put("среда", "wednesday");
        months.put("четверг", "thursday");
        months.put("пятница", "friday");
        months.put("суббота", "saturday");
        months.put("воскресенье", "sunday");

        return months;
    }

    public static String getRandomDaysWeek() {
        int month = random.nextInt(7);
        return String.valueOf(daysWeeks.keySet().toArray()[month]);
    }

    public static String translateDaysWeek(String daysWeek) {
        return daysWeeks.get(daysWeek);
    }
}
