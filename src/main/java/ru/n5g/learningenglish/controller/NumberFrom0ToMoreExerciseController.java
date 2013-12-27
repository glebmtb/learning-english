package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.GenerateRandom;
import ru.n5g.learningenglish.util.TextForNumber;
import ru.n5g.learningenglish.view.ExerciseView;

import java.text.DecimalFormat;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class NumberFrom0ToMoreExerciseController extends ExerciseControllerAbs {

    private Integer number;
    private DecimalFormat myFormatter;

    public NumberFrom0ToMoreExerciseController(ExerciseView view) {
        super(view);
        myFormatter = new DecimalFormat("###,###");
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsNumberFrom0ToMore;
    }

    @Override
    protected String getRightAnswer() {
        return TextForNumber.getTextForNumber(number);
    }

    @Override
    protected String getNewQuestion() {
        number = GenerateRandom.randomNumberToMax();
        return myFormatter.format(number);
    }
}
