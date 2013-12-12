package ru.n5g.learningenglish.view;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public interface NumberFrom0To20ExerciseView extends ExerciseView{

    /**
     * Показать текст который нужжно ввести на английском
     */
    void setTextForInput(String textForInput);

    /**
     * Записать правельный ответ
     */
    void setRightAnswer(String rightAnswer);

    /**
     * Записать результат тестов
     * Пример: "10 правельных из 20"
     */
    void setResultTest(String resultTest);
}
