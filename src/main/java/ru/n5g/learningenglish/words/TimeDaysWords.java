package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;

/**
 * Время суток
 * <p/>
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimeDaysWords extends WordsAbs<String, String> {
    @Override
    protected Map<String, String> initializationWords() {
        Map<String, String> months = new HashMap<String, String>();
        months.put("утро", "morning");
        months.put("день", "afternoon");
        months.put("вечер", "evening");
        months.put("ночь", "night");

        return months;
    }
}
