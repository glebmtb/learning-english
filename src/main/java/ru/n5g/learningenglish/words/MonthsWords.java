package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Месяца года
 *
 * Gleb Belyaev
 * 13.12.13.
 */
public class MonthsWords extends WordsAbs<String, String>{

    @Override
    protected Map<String, String> initializationWords() {
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

    @Override
    public boolean isSound() {
        return true;
    }

    @Override
    public String pathSound() {
        return "month";
    }
}
