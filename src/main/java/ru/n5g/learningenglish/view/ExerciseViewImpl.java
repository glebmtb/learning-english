package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.ExerciseControllerAbsImpl;
import ru.n5g.learningenglish.util.AdverbsOfFrequency;

/**
 * @author Belyaev
 */
public class ExerciseViewImpl extends ExerciseViewAbs {
    private ExerciseControllerAbsImpl controller;


    public ExerciseViewImpl() {
        controller = new ExerciseControllerAbsImpl(this, new AdverbsOfFrequency());
    }

    @Override
    protected void clickNext() {
        controller.clickNext();
    }

    @Override
    protected void clickVerify() {
        controller.clickVerify();
    }

    @Override
    protected void clickEnterInInputField() {
        controller.clickEnterInInputField();
    }

    @Override
    protected void clickStart() {
        controller.clickStart();
    }
}
