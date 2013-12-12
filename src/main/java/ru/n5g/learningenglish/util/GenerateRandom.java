package ru.n5g.learningenglish.util;

import com.sun.org.apache.regexp.internal.recompile;

import java.util.Random;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class GenerateRandom {
    public static ABC randomABC(){
        Random random = new Random(System.nanoTime());
        return ABC.values()[random.nextInt(ABC.values().length)];
    }
}
