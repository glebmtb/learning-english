package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.ABC;
import ru.n5g.learningenglish.util.AbcSpeak;
import ru.n5g.learningenglish.view.AbcExerciseView;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseController {
    private AbcExerciseView view;
    private AbcSpeak abcSpeak;

    private Integer currentQuestion;
    private Integer totalQuestion;
    private Integer trueQuestion;

    private boolean isEnteredSymbol;

    public AbcExerciseController(AbcExerciseView view) {
        this.view = view;
        abcSpeak = new AbcSpeak();
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);
        view.setCounterRepetition("0/50");
        view.setCorrectAnswers("0");
        view.setPassedQuestions("0");
        view.setResultQuestion(true);
        view.clearInformantsResultQuestion();
        String sim = view.getEnteredSymbol();
    }

    public void clickReplace() {
        String symbol = view.getEnteredSymbol();
        ABC abc = ABC.valueOf(symbol);
        abcSpeak.speakABC(abc);
    }

    public void clickNext() {

    }

    public void enteredSymbol() {
        if (isEnteredSymbol) {
            return;
        }
        String symbol = view.getEnteredSymbol();
        if (symbol == null || symbol.isEmpty() || symbol.length() > 1) {
            return;
        }

        isEnteredSymbol = true;
    }
}
