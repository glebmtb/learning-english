package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.GenerateRandom;
import ru.n5g.learningenglish.util.TextForNumber;
import ru.n5g.learningenglish.view.NumberFrom0To20ExerciseView;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0To20ExerciseController {
    private NumberFrom0To20ExerciseView view;

    private Integer currentQuestion;
    private Integer totalQuestions;
    private Integer trueQuestions;
    private boolean isEnteredAnswer;

    private Integer number;

    public NumberFrom0To20ExerciseController(NumberFrom0To20ExerciseView view) {
        this.view = view;
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);

        currentQuestion = 0;
        totalQuestions = Settings.numberRepetitions;
        trueQuestions = 0;
        view.setTrueQuestions("0");
        nextQuestion();
    }

    public void clickVerify() {
        if (isEnteredAnswer) {
            return;
        }
        String enteredWord = view.getEnteredText();
        if (enteredWord != null && !enteredWord.isEmpty()) {
            enteredWord = enteredWord.trim().toLowerCase();
        }
        String rightWord = TextForNumber.getTextForNumber(number);
        boolean isRight = rightWord.equals(enteredWord);
        view.setResultQuestion(isRight);
        if (isRight) {
            trueQuestions++;
        } else {
            view.setRightAnswer(rightWord);
        }

        isEnteredAnswer = true;
    }

    public void clickNext() {
        if (currentQuestion.equals(totalQuestions)) {
            view.setResultTest("правельных ответов: " + trueQuestions + " из: " + totalQuestions);
            view.setVisibleStartPage(true);
            view.setVisibleLessonPage(false);
        }
        nextQuestion();
    }

    public void clickEnterInInputField() {
        if (isEnteredAnswer) {
            clickNext();
        } else {
            clickVerify();
        }
    }

    private void nextQuestion() {
        currentQuestion++;
        view.clearInformantsResultQuestion();
        view.setCounterRepetition(currentQuestion + "/" + totalQuestions);
        view.setPassedQuestions(String.valueOf(currentQuestion - 1));
        view.setTrueQuestions(trueQuestions.toString());
        number = GenerateRandom.randomNumberTo20();
        view.setTextForInput(number.toString());
        isEnteredAnswer = false;
    }
}
