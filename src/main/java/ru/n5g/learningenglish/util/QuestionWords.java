package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Belyaev
 */
public class QuestionWords extends RandomAndTranslate {
    @Override
    protected Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("что? какой?", "what");
        map.put("кто?", "who");
        map.put("где? куда?", "where");
        map.put("когда?", "when");
        map.put("почему?", "why");
        map.put("как?", "how");
        map.put("который?", "which");
        map.put("какой?", "what");
        map.put("чей?", "whose");
        return map;
    }
}
