package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.NumberFrom0To20ExerciseController;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0To20ExerciseViewImpl extends ExerciseViewAbs {
    private NumberFrom0To20ExerciseController controller;

    public NumberFrom0To20ExerciseViewImpl() {
        controller = new NumberFrom0To20ExerciseController(this);
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
