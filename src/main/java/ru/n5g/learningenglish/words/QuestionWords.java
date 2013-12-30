package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;

/**
 * Вопросительные слова
 *
 * @author Gleb Belyaev
 */
public class QuestionWords extends WordsAbs<String, String> {

    @Override
    protected Map<String, String> initializationWords() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("что? какой?", "what");
        map.put("кто?", "who");
        map.put("где? куда?", "where");
        map.put("когда?", "when");
        map.put("почему?", "why");
        map.put("как?", "how");
        map.put("который?", "which");
        map.put("чей?", "whose");
        return map;
    }

    @Override
    public boolean isSound() {
        return true;
    }

    @Override
    public String pathSound() {
        return "questionwords";
    }
}
