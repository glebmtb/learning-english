package ru.n5g.learningenglish.util;

import ru.n5g.learningenglish.words.Words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Gleb Belyaev
 */
public class SmartRandom<WordRusType, WordEngType> implements WordRandom<WordRusType> {
    private final Words<WordRusType, WordEngType> words;
    private Random random;
    private Map<WordRusType, Integer> smartRandom;
    private int understanding;

    public SmartRandom(Words<WordRusType, WordEngType> words) {
        this(words, 2);
    }

    public SmartRandom(Words<WordRusType, WordEngType> words, int understanding) {
        this.words = words;
        this.understanding = understanding;
        random = new Random(System.nanoTime());
        smartRandom = getSmartRandom(words);
    }

    private Map<WordRusType, Integer> getSmartRandom(Words<WordRusType, WordEngType> map) {
        Map<WordRusType, Integer> smartRandom = new HashMap<WordRusType, Integer>();
        for (WordRusType key : map.getListRusWord()) {
            smartRandom.put(key, 0);
        }
        return smartRandom;
    }

    @SuppressWarnings("unchecked")
    public WordRusType getRandomWord() {
        WordRusType word;
        while (true) {
            int item = random.nextInt(words.size());
            word = (WordRusType) words.getRusWord(item);
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

    public void repeat(WordRusType word) {
        smartRandom.put(word, 0);
    }
}
