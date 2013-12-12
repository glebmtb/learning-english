package ru.n5g.learningenglish.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class GenerateRandomTest {
    @Test
    public void testRandomABC() throws Exception {
        List<ABC> abc = new ArrayList<ABC>(Arrays.asList(ABC.values()));
        for (int i = 0; i < 200; i++) {
            int index = abc.indexOf(GenerateRandom.randomABC());
            if (index >= 0) {
                abc.remove(index);
            }
        }
        if (abc.size() > 0)
            System.out.println(abc);
        Assert.assertEquals(0, abc.size());
    }
}
