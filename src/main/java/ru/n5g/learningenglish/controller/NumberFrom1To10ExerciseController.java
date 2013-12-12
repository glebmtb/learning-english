package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.view.NumberFrom1To10ExerciseView;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom1To10ExerciseController {
    private NumberFrom1To10ExerciseView view;

    public NumberFrom1To10ExerciseController(NumberFrom1To10ExerciseView view) {
        this.view = view;
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);
        view.setCounterRepetition("3/50");
        view.setResultQuestion(true);
        view.setRightAnswer("one");
        view.setTextForInput("1");
        view.setPassedQuestions("2");
        view.setCorrectAnswers("1");
    }

    public void clickVerify() {

    }

    public void clickNext() {

    }

    public void clickEnterInInputField() {

    }
}
