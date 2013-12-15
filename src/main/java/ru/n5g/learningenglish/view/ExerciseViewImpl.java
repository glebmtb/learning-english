package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.ExerciseControllerAbsImpl;
import ru.n5g.learningenglish.util.RandomAndTranslate;

/**
 * @author Belyaev
 */
public class ExerciseViewImpl extends ExerciseViewAbs {
    private ExerciseControllerAbsImpl controller;


    public ExerciseViewImpl(RandomAndTranslate randomAndTranslate) {
        controller = new ExerciseControllerAbsImpl(this, randomAndTranslate);
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
