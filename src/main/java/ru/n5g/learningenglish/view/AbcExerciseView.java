package ru.n5g.learningenglish.view;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public interface AbcExerciseView {
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
     * Записать количество правельных ответов
     */
    void setCorrectAnswers(String correctAnswers);

    /**
     * Записать количество пройденых вопросов
     */
    void setPassedQuestions(String passedQuestions);

    /**
     * Записать результат успешности ответа
     */
    void setResultQuestion(boolean isSuccessfully);

    /**
     * Очистить информацию об резльтате ответа
     */
    void clearInformantsResultQuestion();
}
