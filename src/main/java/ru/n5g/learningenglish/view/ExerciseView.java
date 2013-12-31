package ru.n5g.learningenglish.view;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public interface ExerciseView {
    /**
     * Задать видимость странице старта
     */
    void setVisibleStartPage(boolean isVisible);

    /**
     * Задать видимость страницы занятия
     */
    void setVisibleLessonPage(boolean isVisible);

    /**
     * Записать количество пройденых повторов и сколько осталось
     * пример: "0/50"
     */
    void setCounterRepetition(String counterRepetition);

    /**
     * Записать количество правильных ответов
     */
    void setTrueQuestions(String correctAnswers);

    /**
     * Записать количество пройденых вопросов
     */
    void setPassedQuestions(String passedQuestions);

    /**
     * Записать результат успешности ответа
     */
    void setResultQuestion(boolean isSuccessfully);

    /**
     * Очистить информацию об результате ответа и ответ
     */
    void clearInformantsResultQuestion();

    /**
     * Получения введенный ответ пользователем
     */
    String getEnteredText();

    /**
     * Записать правильный ответ
     */
    void setRightAnswer(String rightAnswer);

    /**
     * Записать результат тестов
     * Пример: "10 правильных из 20"
     */
    void setResultTest(String resultTest);

    /**
     * Показать текст который нужжно ввести на английском
     */
    void setTextForInput(String textForInput);
}
