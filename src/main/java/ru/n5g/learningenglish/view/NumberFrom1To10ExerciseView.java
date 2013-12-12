package ru.n5g.learningenglish.view;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public interface NumberFrom1To10ExerciseView extends ExerciseView{

    /**
     * Показать текст который нужжно ввести на английском
     */
    void setTextForInput(String textForInput);

    /**
     * Записать правельный ответ
     */
    void setRightAnswer(String rightAnswer);
}
