package ru.n5g.learningenglish.words;

import java.util.List;

/**
 * @author Gleb Belyaev
 */
public interface Words<WordRusType, WordEngType> {
    /**
     * Перевод слова с русского на английский
     */
    WordEngType translate(WordRusType rusWord);

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

    /**
     * наличие озвучки слов
     */
    boolean isSound();

    /**
     * папка с мп3 файлы должны храниться в пакете "/ru/n5g/learningenglish/mp3/"
     */
    String pathSound();
}
