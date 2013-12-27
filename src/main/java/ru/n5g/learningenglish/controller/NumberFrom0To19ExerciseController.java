package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.Settings;
import ru.n5g.learningenglish.util.TextForNumber;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.GenerateRandom.randomNumberTo19;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0To19ExerciseController extends ExerciseControllerAbs {

    private Integer number;


    public NumberFrom0To19ExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected Integer getTotalQuestions() {
        return Settings.numberRepetitionsNumberFrom0To19;
    }

    @Override
    protected String getRightAnswer() {
        return TextForNumber.getTextForNumber(number);
    }

    @Override
    protected String getNewQuestion() {
        number = randomNumberTo19();
        return number.toString();
    }
}
