package ru.n5g.learningenglish.util;

import ru.n5g.learningenglish.words.Words;

import java.util.Random;

/**
 * Gleb Belyaev
 * 12/30/13.
 */
public class StupidRandom<WordRusType> implements WordRandom<WordRusType>{
    private Words<WordRusType, ?> words;
    private Random random;

    public StupidRandom(Words<WordRusType, ?> words) {
        this.words = words;
        this.random = new Random(System.nanoTime());
    }

    @Override
    public WordRusType getRandomWord() {
        int item = random.nextInt(words.size());
        return words.getRusWord(item);
    }
}
