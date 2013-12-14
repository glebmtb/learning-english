package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Belyaev
 */
public class AdverbsOfFrequency extends RandomAndTranslate {
    @Override
    protected Map<String, String> getMap() {
        Map<String, String> adverbsOfFrequency = new HashMap<String, String>();
        adverbsOfFrequency.put("всегда (100%)","always");
        adverbsOfFrequency.put("обычно (75%)","usually");
        adverbsOfFrequency.put("часто (50%)","often");
        adverbsOfFrequency.put("иногда (40%)","sometimes");
        adverbsOfFrequency.put("нечасто (10%)","rarely");
        adverbsOfFrequency.put("редко (5%)","seldom");
        adverbsOfFrequency.put("никогда (0%)","never");
        return adverbsOfFrequency;
    }
}
