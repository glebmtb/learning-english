package ru.n5g.learningenglish.util;

/**
 * @author Belyaev
 */
public interface WordTranslate<WordEngType, WordRusType> {
    WordEngType translate(WordRusType word);
}
