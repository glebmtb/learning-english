package ru.n5g.learningenglish.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Gleb Belyaev
 * 12/30/13.
 */
public abstract class WordsAbs<WordRusType, WordEngType> implements Words<WordRusType, WordEngType> {
    protected Map<WordRusType, WordEngType> map;


    public WordsAbs() {
        map = initializationWords();
    }

    @Override
    public WordEngType translate(WordRusType rusWord) {
        return map.get(rusWord);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    @SuppressWarnings("unchecked")
    public WordRusType getRusWord(int item) {
        return (WordRusType) map.keySet().toArray()[item];
    }

    @Override
    public List<WordRusType> getListRusWord() {
        return new ArrayList<WordRusType>(map.keySet());
    }

    public Map<WordRusType, WordEngType> cloneMap() {
        return new HashMap<WordRusType, WordEngType>(map);
    }

    protected abstract Map<WordRusType, WordEngType> initializationWords();
}
