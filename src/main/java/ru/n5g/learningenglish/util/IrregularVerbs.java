package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Belyaev
 *
 * Неправельные глаголы
 */
public class IrregularVerbs implements WordRandom<String>, WordTranslate<String[], String>{
    private Map<String, String[]> map;
    private SmartRandom<String, String[]> smartRandom;

    public IrregularVerbs() {
        map = getMap();
        smartRandom = new SmartRandom<String, String[]>(map);
    }

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
        words.put("ворваться, разрываться, взрываться", new String[]{"burst", "burst", "burst"});
        words.put("покупать", new String[]{"buy", "bought", "bought"});
//        words.put("", new String[]{"", "", ""});
        return words;
    }

    @Override
    public String getRandom() {
        return smartRandom.getRandom();
    }

    @Override
    public String[] translate(String timesYear) {
        return map.get(timesYear);
    }

    public void rideAnswer(String word){
        smartRandom.understand(word);
    }
}
