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
     * Записать количество правельных ответов
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
}
