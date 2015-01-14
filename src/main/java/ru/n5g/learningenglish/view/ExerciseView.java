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
    @Deprecated
    void setCounterRepetition(String counterRepetition);

    /**
     * Записать количество пройденых вопросв и сколько осталось
     * currentQuestion - номер текущего вопроса
     * countQuestions - всего вопросов
     */
    void setCounterRepetition(Integer currentQuestion, Integer countQuestions);

    /**
     * Записать количество правильных ответов
     */
    @Deprecated
    void setTrueQuestions(String correctAnswers);

    /**
     * Записать количество пройденых вопросов
     */
    @Deprecated
    void setPassedQuestions(String passedQuestions);

    /**
     * Записать результат ответа
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
    @Deprecated
    void setResultTest(String resultTest);

    /**
     * Записать результат тестов
     * rightAnswers - количество правельных ответов
     * countQuestions - количество вопросов
     */
    void setResultTest(Integer rightAnswers, Integer countQuestions);

    /**
     * Показать текст который нужжно ввести на английском
     */
    void setTextForInput(String textForInput);

    /**
     * Записать количество правильных ответов
     * rightAnswers - количество правельных ответов
     * countQuestions - количество заданных вопросов
     */
    void setCountRightAnswer(Integer rightAnswers, Integer countQuestions);
}
