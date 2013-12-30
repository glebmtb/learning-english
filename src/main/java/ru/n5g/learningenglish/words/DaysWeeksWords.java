package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Дни недели
 *
 * Gleb Belyaev
 * 13.12.13.
 */
public class DaysWeeksWords extends WordsAbs<String , String >{

    @Override
    protected Map<String, String> initializationWords() {
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

    @Override
    public boolean isSound() {
        return true;
    }

    @Override
    public String pathSound() {
        return "daysweek";
    }
}
