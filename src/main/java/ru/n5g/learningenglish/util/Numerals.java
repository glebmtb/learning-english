package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class Numerals {
    private static Map<String, String> numerals = getNumerals();
    private static Random random = new Random(System.nanoTime());

    public static Map<String, String> getNumerals() {
        Map<String, String> numerals = new HashMap<String, String>();
        numerals.put("1st", "first");
        numerals.put("2nd", "second");
        numerals.put("3rd", "third");
        numerals.put("4th", "fourth");
        numerals.put("5th", "fifth");
        numerals.put("6th", "sixth");
        numerals.put("7th", "seventh");
        numerals.put("8th", "eighth");
        numerals.put("9th", "ninth");
        numerals.put("10th", "tenth");
        numerals.put("11th", "eleventh");
        numerals.put("12th", "twelfth");
        numerals.put("13th", "thirteenth");
        numerals.put("14th", "fourteenth");
        numerals.put("15th", "fifteenth");
        numerals.put("16th", "sixteenth");
        numerals.put("17th", "seventeenth");
        numerals.put("18th", "eighteenth");
        numerals.put("19th", "nineteenth");
        numerals.put("20th", "twentieth");
        numerals.put("21st", "twenty first");
        numerals.put("22nd", "twenty second");
        numerals.put("23rd", "twenty third");
        numerals.put("24th", "twenty fourth");
        numerals.put("25th", "twenty fifth");
        numerals.put("26th", "twenty sixth");
        numerals.put("27th", "twenty seventh");
        numerals.put("28th", "twenty eighth");
        numerals.put("29th", "twenty ninth");
        numerals.put("30th", "thirtieth");
        numerals.put("31st", "thirty-first");
        return numerals;
    }

    public static String getRandomNumeral() {
        int month = random.nextInt(30) + 1;
        return String.valueOf(numerals.keySet().toArray()[month]);
    }

    public static String translateNumeral(String numeral) {
        return numerals.get(numeral);
    }
}
