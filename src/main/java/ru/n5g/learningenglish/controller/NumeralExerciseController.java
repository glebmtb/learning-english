package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.Numerals.getRandomNumeral;
import static ru.n5g.learningenglish.util.Numerals.translateNumeral;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class NumeralExerciseController extends ExerciseControllerAbs{
    private String numeral;

    public NumeralExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsNumeral;
    }

    @Override
    protected String getRightAnswer() {
        return translateNumeral(numeral);
    }

    @Override
    protected String getNewQuestion() {
        numeral = getRandomNumeral();
        return numeral;
    }
}
