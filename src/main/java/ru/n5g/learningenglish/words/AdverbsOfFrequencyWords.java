package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;

/**
 * Наречия частотности
 *
 * @author Gleb Belyaev
 */
public class AdverbsOfFrequencyWords extends WordsAbs<String, String> {

    @Override
    protected Map<String, String> initializationWords() {
        Map<String, String> adverbsOfFrequency = new HashMap<String, String>();
        adverbsOfFrequency.put("всегда (100%)", "always");
        adverbsOfFrequency.put("обычно (75%)", "usually");
        adverbsOfFrequency.put("часто (50%)", "often");
        adverbsOfFrequency.put("иногда (40%)", "sometimes");
        adverbsOfFrequency.put("нечасто (10%)", "rarely");
        adverbsOfFrequency.put("редко (5%)", "seldom");
        adverbsOfFrequency.put("никогда (0%)", "never");
        return adverbsOfFrequency;
    }

    @Override
    public boolean isSound() {
        return false;
    }

    @Override
    public String pathSound() {
        return null;
    }
}
