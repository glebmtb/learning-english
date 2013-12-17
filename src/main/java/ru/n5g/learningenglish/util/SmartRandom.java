package ru.n5g.learningenglish.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Belyaev
 */
public class SmartRandom<WordRusType, WordEngType> implements WordRandom<WordRusType> {
    private final Map<WordRusType, WordEngType> map;
    private Random random;
    private Map<WordRusType, Integer> smartRandom;
    private int understanding;

    public SmartRandom(Map<WordRusType, WordEngType> map) {
        this(map, 2);
    }

    public SmartRandom(Map<WordRusType, WordEngType> map, int understanding) {
        this.map = map;
        this.understanding = understanding;
        random = new Random(System.nanoTime());
        smartRandom = getSmartRandom(map);
    }

    private Map<WordRusType, Integer> getSmartRandom(Map<WordRusType, WordEngType> map) {
        Map<WordRusType, Integer> smartRandom = new HashMap<WordRusType, Integer>();
        for (WordRusType key : map.keySet()) {
            smartRandom.put(key, 0);
        }
        return smartRandom;
    }

    @SuppressWarnings("unchecked")
    public WordRusType getRandom() {
        WordRusType word;
        while (true) {
            int item = random.nextInt(map.size());
            word = (WordRusType) map.keySet().toArray()[item];
            if (smartRandom.get(word) < understanding) {
                break;
            }
        }
        return word;
    }

    public void understand(WordRusType word) {
        smartRandom.put(word, smartRandom.get(word) + 1);
        if (isItClear()) {
            resetSmartRandom();
        }
    }

    private void resetSmartRandom() {
        for (WordRusType word : new ArrayList<WordRusType>(smartRandom.keySet())) {
            smartRandom.put(word, 0);
        }
    }

    private boolean isItClear() {
        for (Integer understandingWord : smartRandom.values()) {
            if (understandingWord < understanding) {
                return false;
            }
        }
        return true;
    }
}
