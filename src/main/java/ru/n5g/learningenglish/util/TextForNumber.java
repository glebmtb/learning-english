package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class TextForNumber {
    private static Map<Integer, String> numbers = getNumbers();

    public static String getTextForNumber(int number) {
        return numbers.get(number);
    }

    private static Map<Integer, String> getNumbers() {
        Map<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");
        numbers.put(11, "eleven");
        numbers.put(12, "twelve");
        numbers.put(13, "thirteen");
        numbers.put(14, "fourteen");
        numbers.put(15, "fifteen");
        numbers.put(16, "sixteen");
        numbers.put(17, "seventeen");
        numbers.put(18, "eighteen");
        numbers.put(19, "nineteen");
        numbers.put(20, "twenty");
        return numbers;
    }
}
