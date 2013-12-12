package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.ABC;
import ru.n5g.learningenglish.util.AbcSpeak;
import ru.n5g.learningenglish.view.AbcExerciseView;

import static ru.n5g.learningenglish.util.GenerateRandom.randomABC;

/**
 * Belyaev Gleb
 * 11.12.13.
 */
public class AbcExerciseController {
    private AbcExerciseView view;
    private AbcSpeak abcSpeak;

    private Integer currentQuestion;
    private Integer totalQuestions;
    private Integer trueQuestions;
    private ABC symbol;
    private boolean isEnteredSymbol;

    public AbcExerciseController(AbcExerciseView view) {
        this.view = view;
        abcSpeak = new AbcSpeak();
    }

    public void clickStart() {
        view.setVisibleStartPage(false);
        view.setVisibleLessonPage(true);

        currentQuestion = 0;
        totalQuestions = Settings.numberRepetitions;
        trueQuestions = 0;
        symbol = null;
        isEnteredSymbol = false;

        nextQuestions();
    }

    public void clickReplace() {
        abcSpeak.speakABC(symbol);
    }

    public void clickNext() {
        if(currentQuestion.equals(currentQuestion)){
            //TODO the end
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
        }

        isEnteredSymbol = true;
    }

    private void refreshInfo() {
        view.setCounterRepetition(currentQuestion + "/" + totalQuestions);
        view.setCorrectAnswers(trueQuestions.toString());
        view.setPassedQuestions(String.valueOf(currentQuestion - 1));
        view.clearInformantsResultQuestion();
    }

    private void nextQuestions() {
        currentQuestion++;
        symbol = randomABC();
        isEnteredSymbol = false;
        refreshInfo();
        abcSpeak.speakABC(symbol);
    }
}
