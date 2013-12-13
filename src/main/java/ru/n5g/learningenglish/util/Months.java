package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class Months {
    private static Map<String, String> months = getMonths();
    private static Random random = new Random(System.nanoTime());

    private static Map<String, String> getMonths() {
        Map<String, String> months = new HashMap<String, String>();
        months.put("январь", "january");
        months.put("февраль", "february");
        months.put("март", "march");
        months.put("апрель", "april");
        months.put("май", "may");
        months.put("июнь", "june");
        months.put("июль", "july");
        months.put("август", "august");
        months.put("сентябрь", "september");
        months.put("октябрь", "october");
        months.put("ноябрь", "november");
        months.put("декабрь", "december");
        return months;
    }

    public static String getRandomMonth(){
        int month = random.nextInt(12);
        return String.valueOf(months.keySet().toArray()[month]);
    }

    public static String translateMonth(String month){
        return months.get(month);
    }
}
