package ru.n5g.learningenglish.controller;

import ru.n5g.learningenglish.util.TextForNumber;
import ru.n5g.learningenglish.view.ExerciseView;

import static ru.n5g.learningenglish.util.GenerateRandom.randomNumberTo20;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0To20ExerciseController extends ExerciseControllerAbs {

    private Integer number;


    public NumberFrom0To20ExerciseController(ExerciseView view) {
        super(view);
    }

    @Override
    protected String getRightAnswer() {
        return TextForNumber.getTextForNumber(number);
    }

    @Override
    protected String getNewQuestion() {
        number = randomNumberTo20();
        return number.toString();
    }
}
