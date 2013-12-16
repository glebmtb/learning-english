package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Belyaev
 */
public class IrregularVerbs {
    private Map<String, String[]> map = getMap();
    private Random random = new Random(System.nanoTime());

    protected Map<String, String[]> getMap() {
        Map<String, String[]> words = new HashMap<String, String[]>();
        words.put("привет", new String[]{"1", "2", "3"});
        words.put("привет", new String[]{"1", "2", "3"});
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
