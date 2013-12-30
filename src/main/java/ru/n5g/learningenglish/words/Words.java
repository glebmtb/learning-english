package ru.n5g.learningenglish.words;

import java.util.List;

/**
 * @author Gleb Belyaev
 */
public interface Words<WordRusType, WordEngType> {
    /**
     * Перевод слова с русского на английский
     */
    WordEngType translate(WordRusType word);

    /**
     * Количество слов
     */
    int size();

    /**
     * Вернуть слово на русском по его номеру
     */
    WordRusType getRusWord(int item);

    /**
     * Весь список русских слов
     */
    List<WordRusType> getListRusWord();
}
