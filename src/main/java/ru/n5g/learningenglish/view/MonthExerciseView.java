package ru.n5g.learningenglish.view;

import ru.n5g.learningenglish.controller.MonthExerciseController;

/**
 * Gleb Belyaev
 * 13.12.13.
 */
public class MonthExerciseView extends ExerciseViewAbs {

    private MonthExerciseController controller;

    public MonthExerciseView() {
        controller = new MonthExerciseController(this);
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
