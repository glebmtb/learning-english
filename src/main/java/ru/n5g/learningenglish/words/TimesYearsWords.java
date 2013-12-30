package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Временя года
 *
 * Gleb Belyaev
 * 13.12.13.
 */
public class TimesYearsWords extends WordsAbs<String, String> {
    @Override
    protected Map<String, String> initializationWords() {
        Map<String, String> months = new HashMap<String, String>();
        months.put("весна", "spring");
        months.put("лето", "summer");
        months.put("осень", "autumn");
        months.put("зима", "winter");

        return months;
    }

    @Override
    public boolean isSound() {
        return true;
    }

    @Override
    public String pathSound() {
        return "timesyear";
    }
}
