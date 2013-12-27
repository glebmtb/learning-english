package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.NumberFrom0To100ExerciseController;

/**
 * Gleb Belyaev
 * 12.12.13.
 */
public class NumberFrom0To100ExerciseView extends ExerciseViewAbs {
    private NumberFrom0To100ExerciseController controller;

    public NumberFrom0To100ExerciseView() {
        controller = new NumberFrom0To100ExerciseController(this);
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
