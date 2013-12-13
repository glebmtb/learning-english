package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.ABC;
import ru.n5g.learningenglish.util.AbcSpeak;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.GenerateRandom.randomABC;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseController {
    private ExerciseView view;
    private AbcSpeak abcSpeak;

    private Integer currentQuestion;
    private Integer totalQuestions;
    private Integer trueQuestions;
    private ABC symbol;
    private boolean isEnteredSymbol;

    public AbcExerciseController(ExerciseView view) {
        this.view = view;
        abcSpeak = new AbcSpeak();
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);

        currentQuestion = 0;
        totalQuestions = Settings.numberRepetitionsAbc;
        trueQuestions = 0;
        symbol = null;
        isEnteredSymbol = false;

        nextQuestions();
    }

    public void clickReplace() {
        abcSpeak.speakABC(symbol);
    }

    public void clickNext() {
        if (currentQuestion.equals(totalQuestions)) {
            view.setResultTest("правельных ответов: " + trueQuestions + " из: " + totalQuestions);
            view.setVisibleStartPage(true);
            view.setVisibleLessonPage(false);
            return;
        }
        nextQuestions();
    }

    public void enteredSymbol() {
        if (isEnteredSymbol) {
            clickNext();
            return;
        }
        String enteredSymbol = view.getEnteredText();
        if (enteredSymbol == null || enteredSymbol.isEmpty() || enteredSymbol.length() > 1) {
            return;
        }

        Boolean trueQuestion = String.valueOf(symbol).equals(enteredSymbol);
        view.setResultQuestion(trueQuestion);
        if (trueQuestion) {
            trueQuestions++;
        } else {
            view.setRightAnswer(String.valueOf(symbol).toUpperCase());
        }

        isEnteredSymbol = true;
    }

    private void refreshInfo() {
        view.setCounterRepetition(currentQuestion + "/" + totalQuestions);
        view.setTrueQuestions(trueQuestions.toString());
        view.setPassedQuestions(String.valueOf(currentQuestion - 1));
        view.clearInformantsResultQuestion();
    }

    private void nextQuestions() {
        currentQuestion++;
        symbol = randomABC();
        isEnteredSymbol = false;
        refreshInfo();
        abcSpeak.speakABC(symbol);
        view.setRightAnswer("");
    }
}
