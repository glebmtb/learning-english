package ru.n5g.learningenglish.util;

import org.junit.Assert;
import org.junit.Test;

import static ru.n5g.learningenglish.util.TextForNumber.getTextForNumber;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class TextForNumberTest {
    @Test
    public void testGetTextForNumber() throws Exception {
        String number = getTextForNumber(13);
        Assert.assertEquals(number, "thirteen");
    }
}
