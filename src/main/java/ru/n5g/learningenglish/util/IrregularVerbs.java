package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Belyaev
 *
 * Неправельные глаголы
 */
public class IrregularVerbs {
    private Map<String, String[]> map = getMap();
    private Random random = new Random(System.nanoTime());

    protected Map<String, String[]> getMap() {
        Map<String, String[]> words = new HashMap<String, String[]>();
        words.put("быть", new String[]{"be", "was were", "been"});
        words.put("бить", new String[]{"beat", "beat", "beaten"});
        words.put("становиться", new String[]{"become", "became", "become"});
        words.put("начинать", new String[]{"begin", "began", "begun"});
        words.put("кровоточить", new String[]{"bleed", "bled", "bled"});
        words.put("дуть", new String[]{"blow", "blew", "blown"});
        words.put("ломать", new String[]{"break", "broke", "broken"});
        words.put("приносить", new String[]{"bring", "brought", "brought"});
        words.put("строить", new String[]{"build", "built", "built"});
        words.put("гореть", new String[]{"burn", "burnt", "burnt"});
        words.put("раразиться", new String[]{"burst", "burst", "burst"});
        words.put("покупать", new String[]{"buy", "bought", "bought"});
//        words.put("", new String[]{"", "", ""});
        return words;
    }


    public String getRandom() {
        int month = random.nextInt(map.size());
        return String.valueOf(map.keySet().toArray()[month]);
    }

    public String[] translate(String timesYear) {
        return map.get(timesYear);
    }
}
