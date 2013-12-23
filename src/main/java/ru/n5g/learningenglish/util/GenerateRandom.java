package ru.n5g.learningenglish.util;

import com.sun.org.apache.regexp.internal.recompile;

import java.util.Random;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class GenerateRandom {
    private static Random random = new Random(System.nanoTime());

    public static ABC randomABC(){
        return ABC.values()[random.nextInt(ABC.values().length)];
    }

    public static Integer randomNumberTo20() {
        return random.nextInt(100);
    }

    public static Integer randomNumberToMax() {
        return random.nextInt(Integer.MAX_VALUE);
    }
}
