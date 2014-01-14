package ru.n5g.learningenglish.words;

import java.util.HashMap;
import java.util.Map;

/**
 * Gleb Belyaev
 * 1/14/14.
 */
public class PrepositionsOfPlaceWords extends WordsAbs<String, String> {
    @Override
    protected Map<String, String> initializationWords() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("в", "in");
        map.put("на (поверхонсти)", "on");
        map.put("возле, совсем близко", "at");
        map.put("возле, около", "by");
        map.put("над", "above");
        map.put("под", "under");
        map.put("позади, взади", "behind");
        map.put("на против", "opposite");
        map.put("между", "between");
        map.put("рядом с", "next to");
        map.put("впереди, перед", "in front of");
        map.put("в передней части, в начале", "in the front of");
        map.put("в задней части, в конце", "in the back of");
        map.put("в середине, в средней части", "in the middle of");
        map.put("с лева от", "to the left of");
        map.put("с права от", "to the right of");
        map.put("внутри", "inside");
        map.put("с наружи, на улице", "outside");
        map.put("на вершине", "on top of");
        map.put("на углу", "at the corner");
        map.put("рядом с, близко", "close to, close by, near");
        return map;
    }

    @Override
    public boolean isSound() {
        return false;
    }

    @Override
    public String pathSound() {
        return null;
    }
}
