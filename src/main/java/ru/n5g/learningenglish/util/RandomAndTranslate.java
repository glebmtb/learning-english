package ru.n5g.learningenglish.util;

import java.util.Map;
import java.util.Random;

/**
 * @author Belyaev
 */
public abstract class RandomAndTranslate {
    private Map<String, String> map = getMap();

    protected abstract Map<String, String> getMap();

    private Random random = new Random(System.nanoTime());

    public String getRandom() {
        int month = random.nextInt(map.size());
        return String.valueOf(map.keySet().toArray()[month]);
    }

    public String translate(String timesYear) {
        return map.get(timesYear);
    }
}
