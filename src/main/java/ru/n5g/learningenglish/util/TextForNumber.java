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
        if (number < 21) {
            return numbers.get(number);
        } else if (number >= 21 && number < 100) {
            return getNumberFrom20To99(number);
        } else if (number >= 100 && number < 1000) {
            return getNumberFrom100To999(number);
        } else if (number >= 1000 && number < 1000000) {
            return getNumberFrom1000To1000000(number);
        } else if (number >= 1000000 && number < 1000000000) {
            return getNumberFrom1000000To1000000000(number);
        } else if (number >= 1000000000) {
            return getNumberFrom1000000000(number);
        }

        return "none";
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
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        numbers.put(50, "fifty");
        numbers.put(60, "sixty");
        numbers.put(70, "seventy");
        numbers.put(80, "eighty");
        numbers.put(90, "ninety");
        return numbers;
    }

    private static String getNumberFrom20To99(int number) {
        String firstDigit = String.valueOf(String.valueOf(number).charAt(0));
        String secondDigit = String.valueOf(String.valueOf(number).charAt(1));

        Integer x = Integer.valueOf(firstDigit + "0");
        Integer y = Integer.valueOf(secondDigit);

        String xx = numbers.get(x);
        String yy = numbers.get(y);
        if (y == 0) {
            return xx;
        } else {
            return xx + " " + yy;
        }
    }

    private static String getNumberFrom100To999(int number) {
        String firstDigit = String.valueOf(String.valueOf(number).charAt(0));
        String otherDigit = String.valueOf(number).substring(1);

        Integer x = Integer.valueOf(firstDigit);
        Integer y = Integer.valueOf(otherDigit);

        String xx = numbers.get(x);
        String yy = getTextForNumber(y);

        String numberText = xx + " hundred";
        if (y == 0) {
            return numberText;
        } else {
            return numberText + " " + yy;
        }
    }

    private static String getNumberFrom1000To1000000(int number) {
        String numberStr = String.valueOf(number);
        int size = numberStr.length();

        String to1000Text = "";
        String to1000Str = numberStr.substring(size - 3);
        Integer to1000Int = Integer.valueOf(to1000Str);
        if (to1000Int != 0) {
            to1000Text = getTextForNumber(to1000Int);
        }

        String from1000Str = numberStr.substring(0, size - 3);
        Integer from1000Int = Integer.valueOf(from1000Str);
        String from1000Text = getTextForNumber(from1000Int);

        return from1000Text + " thousand" + (to1000Text.isEmpty() ? "" : " " + to1000Text);
    }

    private static String getNumberFrom1000000To1000000000(int number) {
        String numberStr = String.valueOf(number);
        int size = numberStr.length();

        String to1000000Text = "";
        String to1000000Str = numberStr.substring(size - 6);
        Integer to1000000Int = Integer.valueOf(to1000000Str);
        if (to1000000Int != 0) {
            to1000000Text = getTextForNumber(to1000000Int);
        }

        String from1000000Str = numberStr.substring(0, size - 6);
        Integer from1000000Int = Integer.valueOf(from1000000Str);
        String from1000000Text = getTextForNumber(from1000000Int);

        return from1000000Text + " million" + (to1000000Text.isEmpty() ? "" : " " + to1000000Text);
    }

    private static String getNumberFrom1000000000(int number) {
        String numberStr = String.valueOf(number);
        int size = numberStr.length();

        String toText = "";
        String toStr = numberStr.substring(size - 9);
        Integer toInt = Integer.valueOf(toStr);
        if (toInt != 0) {
            toText = getTextForNumber(toInt);
        }

        String fromStr = numberStr.substring(0, size - 9);
        Integer fromInt = Integer.valueOf(fromStr);
        String fromText = getTextForNumber(fromInt);

        return fromText + " billion" + (toText.isEmpty() ? "" : " " + toText);
    }
}
